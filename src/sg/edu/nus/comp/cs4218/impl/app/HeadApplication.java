package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.HeadException;

public class HeadApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws HeadException {

		if (args == null || args.length == 0) {
			if (stdin == null || stdout == null) {
				throw new HeadException("Null Pointer Exception");
			}
			try {
				int intCount;
				while ((intCount = stdin.read()) != -1) {
					stdout.write(intCount);
				}
			} catch (Exception e) {
				throw new HeadException("Exception Caught");
			}
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
					readAndWriteToStdout(stdout, numLines, filePath);
				}
			} else {
				throw new HeadException("Invalid Head Command");
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

	private void readAndWriteToStdout(OutputStream stdout,
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
