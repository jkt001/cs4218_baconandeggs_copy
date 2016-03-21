package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.PriorityQueue;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.app.Comm;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.CommException;

/**
 * The comm utility reads file1 and file2, which should be sorted lexically,
 * and produces three text columns as output: lines only in file1; lines
 * only in file2; and lines in both files.
 * 
 * The comm utility assumes that the files are lexically sorted; all characters
 * participate in line comparisons.
 */
public class CommApplication implements Comm {
	
	public static final String EXP_NULL_POINTER = "Output stream is null";
	public static final String EXP_INVALID_ARGS = "Invalid args";
	public static final String SINGLE_TAB = "\t";
	public static final String DOUBLE_TAB = "\t\t";
	public static final String EXP_FNF_EXCEPTION = "File not found";
	
	private InputStream leftInputStream;
	private InputStream rightInputStream;
	private BufferedReader leftReader;
	private BufferedReader rightReader;
	private OutputStream outputStream;
	private String leftString;
	private String rightString;
	
	/**
	 * This method runs comm based on the given args and stdin.
	 * 
	 * @param args An array of String that should contain one or two filenames of the input.
	 * @param stdin The input stream that will be used as FILE1 if there is only one argument.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws CommException {
		checkArgs(args, stdin, stdout);
		try {
			readInputArgs(args, stdin, stdout);
			setupBufferedReaders();
			process();
			closeStreams();
		} catch (CommException ce) {
			ce.printStackTrace();
			throw ce;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CommException(e.getMessage());
		} finally {
			leftInputStream = null;
			rightInputStream = null;
			leftReader = null;
			rightReader = null;
			leftString = null;
			rightString = null;
			outputStream = null;
		}
	}
	
	/**
	 * This is a convenience method for testing.
	 * 
	 * @param leftInputStream InputStream containing the contents of the first file.
	 * @param rightInputStream InputStream containing the contents of the second file.
	 * @param outputStream OutputStream where the evaluation result will be output.
	 * @throws CommException if there is any problem when running the application.
	 */
	public void comm(InputStream leftStream, InputStream rightStream, OutputStream outStream) throws CommException {
		try {
			this.leftInputStream = leftStream;
			this.rightInputStream = rightStream;
			this.outputStream = outStream;
			setupBufferedReaders();
			process();
			closeStreams();
		} catch (IOException e) {
			e.printStackTrace();
			throw new CommException(e.getMessage());
		} finally {
			leftInputStream = null;
			rightInputStream = null;
			leftReader = null;
			rightReader = null;
			leftString = null;
			rightString = null;
			outputStream = null;
		}
	}
	
	private void setupBufferedReaders() {
		leftReader = new BufferedReader(new InputStreamReader(leftInputStream));
		rightReader = new BufferedReader(new InputStreamReader(rightInputStream));
	}
	
	private void closeStreams() throws IOException {
		leftInputStream.close();
		rightInputStream.close();
		leftReader.close();
		rightReader.close();
	}
	
	// Section: reading input arguments
	private void checkArgs(String[] args, InputStream stdin, OutputStream stdout) throws CommException {
		if (stdout == null) {
			throw new CommException(EXP_NULL_POINTER);
		}
		if (args == null || args.length == 0 || args.length > 2 ) {
			throw new CommException(EXP_INVALID_ARGS);
		}
	}
	
	private void readInputArgs(String[] args, InputStream stdin, OutputStream stdout) throws CommException {
		outputStream = stdout;
		if (args.length == 2) {
			leftInputStream = inputStreamFromFileName(args[0]);
			rightInputStream = inputStreamFromFileName(args[1]);
		} else if (args.length == 1) {
			leftInputStream = stdin;
			rightInputStream = inputStreamFromFileName(args[0]);
		} else {
			throw new CommException("usage: comm [FILE1] FILE2");
		}
	}

	private InputStream inputStreamFromFileName(String fileName) throws CommException {
		Path currentDir = Paths.get(Environment.currentDirectory);
		Path filePath = currentDir.resolve(fileName);
		checkIfFileIsReadable(filePath, true);
		try {
			return new FileInputStream(filePath.toString());	
		} catch (FileNotFoundException e) {
			throw new CommException(EXP_FNF_EXCEPTION);
		}
	}
	
	private boolean checkIfFileIsReadable(Path filePath) {
		return Files.exists(filePath) && Files.isReadable(filePath);
	}
	
	private boolean checkIfFileIsReadable(Path filePath, boolean raiseException) throws CommException {
		boolean isReadable = checkIfFileIsReadable(filePath);
		if (!isReadable && raiseException) {
			throw new CommException(EXP_FNF_EXCEPTION);
		}
		return isReadable;
	}
	
	// Section: main processing
	private void process() throws IOException {
		leftString = "";
		rightString = "";
		while (leftReader.ready() || rightReader.ready() ||
				!leftString.isEmpty() || !rightString.isEmpty()) {
			if (leftString.isEmpty() && leftReader.ready()) {
				leftString = readLine(leftReader);
			}
			if (rightString.isEmpty() && rightReader.ready()) {
				rightString = readLine(rightReader);
			}
			writeOneLine();
		}
	}
	
	private void writeOneLine() throws IOException {
		if (leftString.isEmpty()) {
			printRightString();
		} else if (rightString.isEmpty()) {
			printLeftString();
		} else {
			if (leftString.equals(rightString)) {
				printEqualString();
			} else if (leftString.compareTo(rightString) < 0) {
				printLeftString();
			} else {
				printRightString();
			}
		}
	}
	
	private void printLeftString() throws IOException {
		writeString(leftString, outputStream);
		leftString = "";
	}
	
	private void printRightString() throws IOException {
		writeTabs(1, outputStream);
		writeString(rightString, outputStream);
		rightString = "";
	}
	
	private void printEqualString() throws IOException {
		writeTabs(2, outputStream);
		writeString(leftString, outputStream);
		leftString = "";
		rightString = "";
	}
	private void writeTabs(int numberOfTabs, OutputStream outputStream) throws IOException {
		for (int i = 0; i < numberOfTabs; i++) {
			outputStream.write("\t".getBytes());
		}
	}
	
	private void writeString(String stringToWrite, OutputStream outputStream) throws IOException {
		outputStream.write(stringToWrite.getBytes());
	}
	
	private String readLine(BufferedReader reader) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		while(true) {
			int inputChar = reader.read();
			if (inputChar != -1) {
				stringBuilder.append((char)inputChar);
			}
			if (inputChar == '\n' || inputChar == -1) {
				break;
			}
		}
		return stringBuilder.toString();
	}
	
	/**
	 * Runs comm on the given input files.
	 * This comm implementation can handle the case where there are exactly
	 * zero match between the left and right files. The output format is as
	 * described in the comment on top of this class declaration. 
	 */
	@Override
	public String commNoMatches(String[] args) {
		return runAndRetrieveResult(args);
	}

	/**
	 * Runs comm on the given input files.
	 * This comm implementation can handle the case where there there are only
	 * contents in the first file, and the second file exists but is empty.
	 */
	@Override
	public String commOnlyFirst(String[] args) {
		return runAndRetrieveResult(args);
	}

	/**
	 * Runs comm on the given input files.
	 * This comm implementation can handle the case where there there are only
	 * contents in the second file, and the first file exists but is empty.
	 */
	@Override
	public String commOnlySecond(String[] args) {
		return runAndRetrieveResult(args);
	}

	/**
	 * Runs comm on the given input files.
	 * This comm implementation can handle the case where there are some 
	 * matches between the first and second input files.
	 */
	@Override
	public String commBothMathches(String[] args) {
		return runAndRetrieveResult(args);
	}

	/**
	 * Run comm on the given input files. 
	 * This comm implementation can handle the case where first and second
	 * input have exactly the same contents.
	 */
	@Override
	public String commAllMatches(String[] args) {
		return runAndRetrieveResult(args);
	}
	
	private String runAndRetrieveResult(String[] args) {
		try {
			InputStream inputStream = new ByteArrayInputStream("".getBytes());
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			run(args, inputStream, outputStream);
			return outputStream.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "comm: terminated with error message " + e.getMessage();
		}
	}
	
	/**
	 * Sorts an array list of comparable elements.
	 * @param toBeSorted
	 */
	private <E> void sort(ArrayList<E> toBeSorted) {
		PriorityQueue<E> minHeap = new PriorityQueue<E>();

		while (!toBeSorted.isEmpty()) {
			minHeap.add(toBeSorted.remove(0));
		}

		while (!minHeap.isEmpty()) {
			toBeSorted.add(minHeap.poll());
		}
	}

}
