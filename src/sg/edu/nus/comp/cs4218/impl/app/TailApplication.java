package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.TailException;

/**
 * Print last N lines of the file (or input stream). If there are less than N
 * lines, print existing lines without rising an exception.
 * 
 * <p>
 * <b>Command format:</b> <code>tail [OPTIONS] [FILE]</code>
 * <dl>
 * <dt>OPTIONS</dt>
 * <dd>&quot;-n 15&quot; means printing 15 lines. Print last 10 lines if not
 * specified.</dd>
 * <dt>FILE</dt>
 * <dd>name of the file. If not specified, use stdin.</dd>
 * </dl>
 * </p>
 */
public class TailApplication implements Application {

	/**
	 * Runs the tail application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. If a file is to be
	 *            specified, the array should be of size 1 and the element is
	 *            the path to the file. If no files are specified, the array
	 *            should be empty and input is read from stdin.
	 * @param stdin
	 *            An InputStream. The input for the command is read from this
	 *            InputStream if no files are specified.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * 
	 * @throws TailException
	 *             If the file(s) specified do not exist, are unreadable, or an
	 *             I/O exception occurs.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws TailException {

		if (args == null || args.length == 0 || args.length == 2) {
			int numLinesToRead = 0;

			if (args == null || args.length == 0) {
				numLinesToRead = 10;
			} else {
				if (args.length == 2 && args[0].equals("-n")) {
					numLinesToRead = checkNumberOfLinesInput(args[1]);
				} else {
					throw new TailException(
							"Incorrect flag used for reading from stdin");
				}
			}
			readFromStdinAndWriteToStdout(stdout, numLinesToRead, stdin);
		} else {
			int numLines;

			if (args.length == 3 || args.length == 1) {
				if (args.length == 3 && args[0].equals("-n")) {
					numLines = checkNumberOfLinesInput(args[1]);
				} else if (args.length == 1) {
					numLines = 10;
				} else {
					throw new TailException("Incorrect flag used");
				}
			} else {
				throw new TailException("Invalid Tail Command");
			}

			Path currentDir = Paths.get(Environment.currentDirectory);
			int filePosition = 0;
			if (args.length == 3) {
				filePosition = 2;
			}
			Path filePath = currentDir.resolve(args[filePosition]);
			boolean isFileReadable = false;
			isFileReadable = checkIfFileIsReadable(filePath);

			if (isFileReadable) {
				try {
					readFromFileAndWriteToStdout(stdout, numLines, filePath);
				} catch (Exception e) {
					throw new TailException("Exception Caught");
				}
			}
		}
	}

	int checkNumberOfLinesInput(String numLinesString) throws TailException {
		int numLines;

		try {
			numLines = Integer.parseInt(numLinesString);
		} catch (NumberFormatException nfe) {
			throw new TailException("Invalid command, not a number.");
		}

		if (numLines < 0) {
			throw new TailException("Number of lines cannot be negative");
		}

		return numLines;
	}

	void readFromStdinAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, InputStream stdin) throws TailException {

		if (stdin == null || stdout == null) {
			throw new TailException("Null Pointer Exception");
		}

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(
				stdin));
		Queue<String> inputArray = new LinkedList<String>();
		String input = "";
		int intCount = 0;

		try {
			if (numLinesRequired == 0) {
				stdout.write("".getBytes("UTF-8"));
			} else {
				while ((input = buffReader.readLine()) != null) {
					if (intCount == numLinesRequired) {
						inputArray.poll();
						intCount--;
					}
					intCount++;
					inputArray.add(input);
				}
			}
		} catch (Exception e) {
			throw new TailException("Exception caught");
		}

		while (!inputArray.isEmpty()) {
			try {
				if (inputArray.peek().equals("")) {
					inputArray.poll();
					stdout.write(System.lineSeparator().getBytes("UTF-8"));
				} else if (inputArray.size() == 1) {
					stdout.write(inputArray.poll().getBytes("UTF-8"));
				} else {
					stdout.write(inputArray.poll().getBytes("UTF-8"));
					stdout.write(System.lineSeparator().getBytes("UTF-8"));
				}

			} catch (Exception e) {
				throw new TailException("Exception caught");
			}
		}
	}

	void readFromFileAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, Path filePath) throws TailException {

		String encoding = "UTF-8";

		if (stdout == null) {
			throw new TailException("Stdout is null");
		}
		try {
			if (numLinesRequired == 0) {
				stdout.write("".getBytes(encoding));
			} else {
				FileInputStream fileInStream = new FileInputStream(
						filePath.toString());
				BufferedReader buffReader = new BufferedReader(
						new InputStreamReader(fileInStream));

				Queue<String> inputArray = new LinkedList<String>();
				String input = "";
				int intCount = 0;
				while ((input = buffReader.readLine()) != null) {
					if (intCount == numLinesRequired) {
						inputArray.poll();
						intCount--;
					}
					inputArray.add(input);
					intCount++;
				}
				buffReader.close();
				while (!inputArray.isEmpty()) {
					if (inputArray.peek().equals("")) {
						inputArray.poll();
						stdout.write(System.lineSeparator().getBytes(encoding));
					} else if (inputArray.size() == 1) {
						stdout.write(inputArray.poll().getBytes(encoding));
					} else {
						stdout.write(inputArray.poll().getBytes(encoding));
						stdout.write(System.lineSeparator().getBytes(encoding));
					}
				}
			}
		} catch (Exception e) {
			throw new TailException("Exception caught");
		}
	}

	boolean checkIfFileIsReadable(Path filePath) throws TailException {

		if (Files.notExists(filePath)) {
			throw new TailException("No such file exists");
		}
		if (Files.isDirectory(filePath)) {
			throw new TailException("This is a directory");
		}
		if (Files.exists(filePath) && Files.isReadable(filePath)) {
			return true;
		} else {
			throw new TailException("Could not read file");
		}
	}
}
