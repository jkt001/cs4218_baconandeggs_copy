package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.app.Sort;
import sg.edu.nus.comp.cs4218.exception.SortException;

public class SortApplication implements Sort {

	/**
	 * Runs the sort application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. Only one file could be
	 *            specified. If file is specified, the input should be read from
	 *            the file, else, input is read from stdin. If a flag,-n, is
	 *            specified, it will treat the first word as a number and sort
	 *            accordingly. The method will parse the first number that it encounters.
	 *            For example, 123hello will take "123" as the number to be compared
	 *            first in the sorting, as with 123 hello. Then it will compare the string
	 *            "hello" and " hello".
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
				Path filePath = currentDir.resolve(args[0]);

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
			e.getMessage();	
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

	/**
	 * Writes the content to the specified output stream.
	 * 
	 * @param content
	 *            The content to be printed.
	 *        stdout
	 *        	  The output stream that we want to write to.
	 * @throws IOException
	 *             If couldn't write to the specified output stream.
	 */
	private <E> void print(ArrayList<E> content, OutputStream stdout) throws IOException {
		String encoding = "UTF-8";

		int sizeOfContent = content.size();
		for (int currentIndex = 0; currentIndex < sizeOfContent; currentIndex++) {
			stdout.write(content.get(currentIndex).toString().getBytes(encoding));
			stdout.write(System.lineSeparator().getBytes(encoding));
		}

	}

	/**
	 * Sorts the given List. Implements the HeapSort algorithm using
	 * a min-heap priority queue.
	 * 
	 * @param toBeSorted
	 *            The List to be sorted.
	 */
	private <E> void sort(List<E> toBeSorted) {
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
	
	/**
	 * Returns an ordered list of lines containing only simple letters
	 */
	@Override
	public List<String> sortStringsSimple(String[] toSort) {
		ArrayList<String> toBeSorted = new ArrayList<String>();
		for (String lines : toSort) {
			toBeSorted.add(lines);
		}
		sort(toBeSorted);
		return toBeSorted;
	}

	/**
	 * Returns an ordered list of lines containing only capital letters
	 */
	@Override
	public List<String> sortStringsCapital(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing only numbers
	 */
	@Override
	public List<String> sortNumbers(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing only special characters
	 */
	@Override
	public List<String> sortSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters
	 */
	@Override
	public List<String> sortSimpleCapital(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple letters and numbers
	 */
	@Override
	public List<String> sortSimpleNumbers(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple letters and special
	 * characters
	 */
	@Override
	public List<String> sortSimpleSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing capital letters and numbers
	 */
	@Override
	public List<String> sortCapitalNumbers(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing capital letters and special
	 * character
	 */
	@Override
	public List<String> sortCapitalSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing numbers and special
	 * characters
	 */
	@Override
	public List<String> sortNumbersSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters
	 * and numbers
	 */
	@Override
	public List<String> sortSimpleCapitalNumber(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters
	 * and special characters
	 */
	@Override
	public List<String> sortSimpleCapitalSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple letters, numbers and
	 * special characters
	 */
	@Override
	public List<String> sortSimpleNumbersSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing capital letters, numbers and
	 * special characters
	 */
	@Override
	public List<String> sortCapitalNumbersSpecialChars(String[] toSort) {
		return sortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters,
	 * numbers and special characters
	 */
	@Override
	public List<String> sortAll(String[] toSort) {
		return sortStringsSimple(toSort);
	}
	
	/**
	 * Returns an ordered list of lines containing only simple letters,
	 * using the first word as number
	 */
	public List<String> numericalSortStringsSimple(String[] toSort) {
		ArrayList<NumericString> toBeSorted = new ArrayList<NumericString>();
		for (String lines : toSort) {
			toBeSorted.add(new NumericString(lines));
		}
		sort(toBeSorted);
		
		ArrayList<String> toBeReturned = new ArrayList<String>();
		for (NumericString lines : toBeSorted) {
			toBeReturned.add(lines.toString());
		}
		
		return toBeReturned;
	}
	
	/**
	 * Returns an ordered list of lines containing only capital letters,
	 * using the first word as number
	 */
	public List<String> numericalSortStringsCapital(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing only numbers,
	 * using the first word as number
	 */
	public List<String> numericalSortNumbers(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing only special characters,
	 * using the first word as number
	 */
	public List<String> numericalSortSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters,
	 * using the first word as number
	 */
	public List<String> numericalSortSimpleCapital(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple letters and numbers,
	 * using the first word as number
	 */
	public List<String> numericalSortSimpleNumbers(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple letters and special
	 * characters, using the first word as number
	 */
	public List<String> numericalSortSimpleSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing capital letters and numbers,
	 * using the first word as number
	 */
	public List<String> numericalSortCapitalNumbers(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing capital letters and special
	 * character, using the first word as number
	 */
	public List<String> numericalSortCapitalSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing numbers and special
	 * characters, using the first word as number
	 */
	public List<String> numericalSortNumbersSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters
	 * and numbers, using the first word as number
	 */
	public List<String> numericalSortSimpleCapitalNumber(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters
	 * and special characters, using the first word as number
	 */
	public List<String> numericalSortSimpleCapitalSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple letters, numbers and
	 * special characters, using the first word as number
	 */
	public List<String> numericalSortSimpleNumbersSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing capital letters, numbers and
	 * special characters, using the first word as number
	 */
	public List<String> numericalSortCapitalNumbersSpecialChars(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

	/**
	 * Returns an ordered list of lines containing simple and capital letters,
	 * numbers and special characters, using the first word as number
	 */
	public List<String> numericalSortAll(String[] toSort) {
		return numericalSortStringsSimple(toSort);
	}

}


/**
 * Helper Class for sorting with "-n" option on
 *
 */
class NumericString implements Comparable<NumericString> {

	private BigInteger number;
	private String content;

	public NumericString(String content) {
		StringBuilder prefixNumber = new StringBuilder("");
		int index = 0;
		char dash = '-';

		if (content.length() >= 2 && content.charAt(0) == dash && Character.isDigit(content.charAt(1))) {
			prefixNumber.append(dash);
			index++;
		}

		while (index < content.length() && Character.isDigit(content.charAt(index))) {
			prefixNumber.append(content.charAt(index++));
		}

		String number = prefixNumber.toString();

		if (("").equals(number)) {
			this.number = null;
		} else {
			this.number = new BigInteger(number);
		}

		this.content = content.substring(index);
	}

	public BigInteger getNumber() {
		return this.number;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		if (number == null) {
			return content;
		} else {
			return number.toString() + content;
		}
	}

	@Override
	public int compareTo(NumericString other) {
		if (this.number == null && other.getNumber() == null) {
			return this.getContent().compareTo(other.getContent());
		} else if (this.number == null) {
			if (this.getContent().isEmpty()) {
				if (other.getNumber().compareTo(BigInteger.ZERO) < 0) {
					return 1;
				} else {
					return -1;
				}
			} else if (other.getNumber().compareTo(BigInteger.ZERO) <= 0) {
				return 1;
			} else {
				return -1;
			}
		} else if (other.number == null) {
			if (other.getContent().isEmpty()) {
				if (this.getNumber().compareTo(BigInteger.ZERO) < 0) {
					return -1;
				} else {
					return 1;
				}
			} else if (this.getNumber().compareTo(BigInteger.ZERO) <= 0) {
				return -1;
			} else {
				return 1;
			}
		} else if (this.number.compareTo(other.getNumber()) == 0) {
			return this.getContent().compareTo(other.getContent());
		} else {
			return this.number.compareTo(other.getNumber());
		}
	}
	
	@Override
	public String toString() {
		return this.getContent();
	}

}
