package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.HeadException;

/**
 * Print first N lines of the file (or input stream). If there are less than N
 * lines, print existing lines without rising an exception.
 * 
 * <p>
 * <b>Command format:</b> <code>head [OPTIONS] [FILE]</code>
 * <dl>
 * <dt>OPTIONS</dt>
 * <dd>&quot;-n 15&quot; means printing 15 lines. Print first 10 lines if not
 * specified.</dd>
 * <dt>FILE</dt>
 * <dd>name of the file. If not specified, use stdin.</dd>
 * </dl>
 * </p>
 */
public class HeadApplication implements Application {

	/**
	 * Runs the head application with the specified arguments.
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
	 * @throws HeadException
	 *             If the file(s) specified do not exist, are unreadable, or an
	 *             I/O exception occurs.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws HeadException {

		// head
		if (args == null || args.length == 0 || args.length == 2) {

			if (stdin == null || stdout == null) {
				throw new HeadException("Null Pointer Exception");
			}
			int numLinesToRead = 0;

			if (args == null || args.length == 0) {
				numLinesToRead = 10;
			} else if (args.length == 2 && args[0].equals("-n")) {
				numLinesToRead = checkNumberOfLinesInput(args[1]);
			} else {
				throw new HeadException("Invalid Head Command");
			}
			readFromStdinAndWriteToStdout(stdout, numLinesToRead, stdin);
		} else {
			int numLines;
			if (args.length == 3 || args.length == 1) {
				if ((args.length == 3) && (args[0].equals("-n"))) {
					numLines = checkNumberOfLinesInput(args[1]);
				} else {
					numLines = 10;
				}

				// check file
				Path currentDir = Paths.get(Environment.currentDirectory);
				int filePosition = 0;
				if (args.length == 3) {
					filePosition = 2;
				}
				Path filePath = currentDir.resolve(args[filePosition]);
				boolean isFileReadable = false;
				isFileReadable = checkIfFileIsReadable(filePath);

				if (isFileReadable) {
					readFronFileAndWriteToStdout(stdout, numLines, filePath);
				}
			} else {
				throw new HeadException("Invalid Head Command");
			}
		}
	}

	private void readFromStdinAndWriteToStdout(OutputStream stdout,
			int numLinesToRead, InputStream stdin) throws HeadException {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(
				stdin));
		int numRead = 0;
		while (numLinesToRead != numRead) {
			try {
				String inputString = buffReader.readLine();
				stdout.write(inputString.getBytes("UTF-8"));
				stdout.write("\n".getBytes("UTF-8"));
				numRead++;
			} catch (IOException e) {
				throw new HeadException("IO Exception");
			}
		}
	}

	private int checkNumberOfLinesInput(String numLinesString)
			throws HeadException {
		int numLines;
		try {
			numLines = Integer.parseInt(numLinesString);
		} catch (NumberFormatException nfe) {
			throw new HeadException("Invalid command, not a number.");
		}

		if (numLines < 0) {
			throw new HeadException("Number of lines cannot be negative");
		}

		return numLines;
	}

	private void readFronFileAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, Path filePath) throws HeadException {
		String encoding = "UTF-8";
		byte[] byteFileArray;
		int numLinesToWrite = 0;
		byte[] toWrite;

		try {

			byteFileArray = Files.readAllBytes(filePath);

			String fileContent = new String(byteFileArray, encoding);

			fileContent = fileContent.replaceAll(System.lineSeparator(), " "
					+ System.lineSeparator());

			String[] spiltFileArray = fileContent.split(System.lineSeparator());

			if (numLinesRequired > spiltFileArray.length) {
				numLinesToWrite = spiltFileArray.length;
			} else {
				numLinesToWrite = numLinesRequired;
			}

			int intCount = 0;
			while (intCount != numLinesToWrite) {

				if (spiltFileArray[intCount].equals("")) {
					stdout.write(spiltFileArray[intCount].getBytes(encoding));
				} else {
					int endPos = spiltFileArray[intCount].lastIndexOf(' ');
					toWrite = spiltFileArray[intCount].substring(0, endPos)
							.getBytes(encoding);
					stdout.write(toWrite);
					stdout.write(System.lineSeparator().getBytes(encoding));
				}
				intCount++;
			}
		} catch (IOException e) {
			throw new HeadException("IOException");
		}

	}

	private boolean checkIfFileIsReadable(Path filePath) throws HeadException {
		if (Files.notExists(filePath)) {
			throw new HeadException("No such file exists");
		}
		if (Files.isDirectory(filePath)) {
			throw new HeadException("This is a directory");
		}
		if (Files.exists(filePath) && Files.isReadable(filePath)) {
			return true;
		} else {
			throw new HeadException("Could not read file");
		}
	}
}
