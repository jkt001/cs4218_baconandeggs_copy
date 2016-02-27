package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.PriorityQueue;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.SortException;

public class SortApplication implements Application {

	/**
	 * Runs the sort application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. Only one file could be
	 *            specified. If file is specified, the input should be read from
	 *            the file, else, input is read from stdin. If a flag,-n, is
	 *            specified, it will treat the first word as a number and sort
	 *            accordingly.
	 * 
	 * @param stdin
	 *            An InputStream. The input for the command is read from this
	 *            InputStream if no file is specified.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * 
	 * @throws SortException
	 *             If the file(s) specified do not exist or are unreadable.
	 */
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws SortException {
		if (args == null || args.length == 0) {
			sortFromStdinAndWriteToStdOut(stdin, stdout);
		} else if (args.length == 1) {
			if (args[0].equals("-n")) {
				numericSortFromStdinAndWriteToStdOut(stdin, stdout);
			} else {
				Path currentDir = Paths.get(Environment.currentDirectory);
				Path filePath = currentDir.resolve(args[1]);

				if (checkIfFileIsReadable(filePath)) {
					sortFromFileAndWriteToStdOut(filePath, stdout);
				}
			}
		} else if (args.length == 2) {
			if (args[0].equals("-n")) {
				Path currentDir = Paths.get(Environment.currentDirectory);
				Path filePath = currentDir.resolve(args[1]);

				if (checkIfFileIsReadable(filePath)) {
					numericSortFromFileAndWriteToStdOut(filePath, stdout);
				}

			} else {
				throw new SortException("Unsupported option :" + args[0]);
			}
		} else {
			throw new SortException("Too many arguments specified");
		}

	}

	/**
	 * Read from file, sort the contents lexicographically, print to stdout
	 * 
	 * @param filePath
	 *            A Path. Read file from the file path given
	 * @param stdout
	 *            An Output Stream to print the output
	 * 
	 * @throws SortException
	 *             If stdout is null. Other exceptions caught when reading and
	 *             writing from input and output streams.
	 */
	private void sortFromFileAndWriteToStdOut(Path filePath, OutputStream stdout) throws SortException {

		if (stdout == null) {
			throw new SortException("Stdout is null");
		}

		try {
			FileInputStream fileInStream = new FileInputStream(filePath.toString());
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(fileInStream));

			ArrayList<String> toBeSorted = new ArrayList<String>();

			String nextLine = buffReader.readLine();
			while (nextLine != null) {
				toBeSorted.add(nextLine);
				nextLine = buffReader.readLine();
			}

			sort(toBeSorted);
			print(toBeSorted, stdout);

			buffReader.close();

		} catch (IOException e) {
			throw new SortException("IOException");
		}
	}

	/**
	 * Read from stdin, sort the contents lexicographically, print to stdout
	 * 
	 * @param stdin
	 *            An Input Stream used to read the input
	 * @param stdout
	 *            An Output Stream to print the output
	 * 
	 * @throws SortException
	 *             If stdin or stdout is null. Other exceptions caught when
	 *             reading and writing from input and output streams.
	 */
	private void sortFromStdinAndWriteToStdOut(InputStream stdin, OutputStream stdout) throws SortException {

		if (stdin == null || stdout == null) {
			throw new SortException("Null Pointer Exception");
		}

		try {
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(stdin));

			ArrayList<String> toBeSorted = new ArrayList<String>();
			String nextLine = buffReader.readLine();
			while (nextLine != null) {
				toBeSorted.add(nextLine);
				nextLine = buffReader.readLine();
			}

			sort(toBeSorted);
			print(toBeSorted, stdout);

			buffReader.close();

		} catch (IOException e) {
			throw new SortException("IOException");
		}
	}

	/**
	 * Read from file, sort the contents lexicographically while treating the
	 * first word of a line as a number, print to stdout
	 * 
	 * @param filePath
	 *            A Path. Read file from the file path given
	 * @param stdout
	 *            An Output Stream to print the output
	 * 
	 * @throws SortException
	 *             If stdout is null. Other exceptions caught when reading and
	 *             writing from input and output streams.
	 */
	private void numericSortFromFileAndWriteToStdOut(Path filePath, OutputStream stdout) throws SortException {

		if (stdout == null) {
			throw new SortException("Stdout is null");
		}

		try {
			FileInputStream fileInStream = new FileInputStream(filePath.toString());
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(fileInStream));

			ArrayList<NumericString> toBeSorted = new ArrayList<NumericString>();

			String nextLine = buffReader.readLine();

			while (nextLine != null) {
				NumericString toBeAdded = new NumericString(nextLine);
				toBeSorted.add(toBeAdded);
				nextLine = buffReader.readLine();
			}

			sort(toBeSorted);
			print(toBeSorted, stdout);

			buffReader.close();

		} catch (IOException e) {
			throw new SortException("IOException");
		}
	}

	/**
	 * Read from stdin, sort the contents lexicographically while treating the
	 * first word of a line as a number, print to stdout
	 * 
	 * @param stdin
	 *            An Input Stream used to read the input
	 * @param stdout
	 *            An Output Stream to print the output
	 * 
	 * @throws SortException
	 *             If stdin or stdout is null. Other exceptions caught when
	 *             reading and writing from input and output streams.
	 */
	private void numericSortFromStdinAndWriteToStdOut(InputStream stdin, OutputStream stdout) throws SortException {

		if (stdin == null || stdout == null) {
			throw new SortException("Null Pointer Exception");
		}

		try {
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(stdin));
			ArrayList<NumericString> toBeSorted = new ArrayList<NumericString>();

			String nextLine = buffReader.readLine();

			while (nextLine != null) {
				NumericString toBeAdded = new NumericString(nextLine);
				toBeSorted.add(toBeAdded);
				nextLine = buffReader.readLine();
			}

			sort(toBeSorted);
			print(toBeSorted, stdout);

			buffReader.close();

		} catch (IOException e) {
			throw new SortException("IOException");
		}
	}

	private <E> void print(ArrayList<E> content, OutputStream stdout) throws IOException {
		String encoding = "UTF-8";

		int sizeOfContent = content.size();
		for (int currentIndex = 0; currentIndex < sizeOfContent; currentIndex++) {
			stdout.write(content.get(currentIndex).toString().getBytes(encoding));
			stdout.write(System.lineSeparator().getBytes(encoding));
		}

	}

	private <E> void sort(ArrayList<E> toBeSorted) {
		PriorityQueue<E> minHeap = new PriorityQueue<E>();

		while (!toBeSorted.isEmpty()) {
			minHeap.add(toBeSorted.remove(0));
		}

		while (!minHeap.isEmpty()) {
			toBeSorted.add(minHeap.poll());
		}
	}

	/**
	 * Checks if a file is readable.
	 * 
	 * @param filePath
	 *            The path to the file
	 * @return True if the file is readable.
	 * @throws SortException
	 *             If the file is not readable
	 */
	boolean checkIfFileIsReadable(Path filePath) throws SortException {

		if (Files.exists(filePath) && Files.isReadable(filePath)) {
			return true;
		} else {
			throw new SortException("Could not read file");
		}
	}

}

/**
 * Helper Class for sorting with "-n" option on
 *
 */
class NumericString implements Comparable<NumericString> {

	Integer number;
	String content;

	public NumericString(String content) {
		StringBuilder prefixNumber = new StringBuilder("");
		int index = 0;

		while (index < content.length() && Character.isDigit(content.charAt(index))){
			prefixNumber.append(content.charAt(index++));
		}
		
		String number = prefixNumber.toString();
		
		if (("").equals(number)) {
			this.number = null;
		} else {
			this.number = Integer.parseInt(number);
		}
		
		this.content = content.substring(index);
	}

	public Integer getNumber() {
		return this.number;
	}

	public String getContent() {
		return this.getContent();
	}

	@Override
	public int compareTo(NumericString other) {
		if (this.number.compareTo(other.getNumber()) == 0) {
			return this.getContent().compareTo(other.getContent());
		} else {
			return this.number.compareTo(other.getNumber());
		}
	}

}
