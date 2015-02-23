package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.HeadException;
import sg.edu.nus.comp.cs4218.exception.TailException;

public class TailApplication implements Application {

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
							"Invalid Tail Command for reading from stdin");
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
				readFromFileAndWriteToStdout(stdout, numLines, filePath);
			}
		}
	}

	private int checkNumberOfLinesInput(String numLinesString)
			throws TailException {
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

	private void readFromStdinAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, InputStream stdin) throws TailException {

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(
				stdin));
		ArrayList<String> inputArray = new ArrayList<String>();
		String input = "";
		try {
			while ((input = buffReader.readLine()) != null) {
				inputArray.add(input);
			}
		} catch (IOException e) {
			throw new TailException("IO Exception");
		}

		int writePos = 0;
		if (numLinesRequired < inputArray.size()) {
			writePos = inputArray.size() - numLinesRequired;
		}

		for (int intCount = writePos; intCount < inputArray.size(); intCount++) {
			try {
				stdout.write(inputArray.get(intCount).getBytes("UTF-8"));
				stdout.write(System.lineSeparator().getBytes("UTF-8"));
			} catch (Exception e) {
				throw new TailException("Exception caught");
			}
		}
		// int numRead = 0;
		//
		// while (numLinesToRead != numRead) {
		// try {
		// String inputString = buffReader.readLine();
		// stdout.write(inputString.getBytes("UTF-8"));
		// stdout.write("\n".getBytes("UTF-8"));
		// numRead++;
		// } catch (IOException e) {
		// throw new TailException("IO Exception");
		// }
		// }
	}

	private void readFromFileAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, Path filePath) throws TailException {

		String encoding = "UTF-8";
		byte[] byteFileArray;
		int numLinesInFile = 0;
		int readLinePos = 0;
		byte[] toWrite;

		try {

			byteFileArray = Files.readAllBytes(filePath);

			String fileContent = new String(byteFileArray, encoding);

			fileContent = fileContent.replaceAll(System.lineSeparator(), " "
					+ System.lineSeparator());

			String[] spiltFileArray = fileContent.split(System.lineSeparator());

			numLinesInFile = spiltFileArray.length;
			if (numLinesRequired < numLinesInFile) {
				readLinePos = numLinesInFile - numLinesRequired;
			}

			int intCount;
			for (intCount = readLinePos; intCount < numLinesInFile; intCount++) {
				if (spiltFileArray[intCount].equals("")) {
					stdout.write(spiltFileArray[intCount].getBytes(encoding));
				} else {
					int endPos = spiltFileArray[intCount].lastIndexOf(' ');

					toWrite = spiltFileArray[intCount].substring(0, endPos)
							.getBytes(encoding);

					stdout.write(toWrite);
					stdout.write(System.lineSeparator().getBytes(encoding));
				}
			}
		} catch (IOException e) {
			throw new TailException("IO Exception");
		}

	}

	private boolean checkIfFileIsReadable(Path filePath) throws TailException {

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
