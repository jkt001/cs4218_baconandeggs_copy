package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
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
 * 
 * @author andhieka
 *
 */
public class CommApplication implements Comm {
	
	private InputStream leftInputStream;
	private InputStream rightInputStream;
	private BufferedReader leftReader;
	private BufferedReader rightReader;
	private OutputStream outputStream;
	private String leftString;
	private String rightString;
	
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws CommException {
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
	private void readInputArgs(String[] args, InputStream stdin, OutputStream stdout) throws CommException, FileNotFoundException {
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

	private InputStream inputStreamFromFileName(String fileName) throws CommException, FileNotFoundException {
		Path currentDir = Paths.get(Environment.currentDirectory);
		Path filePath = currentDir.resolve(fileName);
		checkIfFileIsReadable(filePath, true);
		return new FileInputStream(filePath.toString());
	}
	
	private boolean checkIfFileIsReadable(Path filePath) {
		return Files.exists(filePath) && Files.isReadable(filePath);
	}
	
	private boolean checkIfFileIsReadable(Path filePath, boolean raiseException) throws CommException {
		boolean isReadable = checkIfFileIsReadable(filePath);
		if (!isReadable && raiseException) {
			throw new CommException("file is not readable");
		}
		return isReadable;
	}
	
	// Section: main processing
	private void process() throws IOException {
		leftString = "";
		rightString = "";
		while (leftReader.ready() || rightReader.ready() ||
				!leftString.isEmpty() || !rightString.isEmpty()) {
			if (leftString.equals("") && leftReader.ready()) {
				leftString = readLine(leftReader);
			}
			if (rightString.equals("") && rightReader.ready()) {
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
	
	private void writeNewLine(OutputStream outputStream) throws IOException {
		outputStream.write(System.lineSeparator().getBytes());
	}
	
	private String readLine(BufferedReader reader) throws IOException {
		StringBuilder sb = new StringBuilder();
		while(true) {
			int inputChar = reader.read();
			if (inputChar != -1) {
				sb.append((char)inputChar);
			}
			if (inputChar == '\n' || inputChar == -1) {
				break;
			}
		}
		return sb.toString();
	}
	
	@Override
	public String commNoMatches(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commOnlyFirst(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commOnlySecond(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commBothMathches(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commAllMatches(String[] args) {
		// TODO Auto-generated method stub
		return null;
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
