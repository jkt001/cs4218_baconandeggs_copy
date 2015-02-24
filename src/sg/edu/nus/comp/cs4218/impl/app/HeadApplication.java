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

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.HeadException;

public class HeadApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws HeadException {

		if (args == null || args.length == 0 || args.length == 2) {
			int numLinesToRead = 0;

			if (args == null || args.length == 0) {
				numLinesToRead = 10;
			} else {
				if (args.length == 2 && args[0].equals("-n")) {
					numLinesToRead = checkNumberOfLinesInput(args[1]);
				} else {
					throw new HeadException(
							"Invalid Head Command for reading from stdin");
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
					throw new HeadException("Incorrect flag used");
				}
			} else {
				throw new HeadException("Invalid Head Command");
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

	void readFromStdinAndWriteToStdout(OutputStream stdout, int numLinesToRead,
			InputStream stdin) throws HeadException {

		if (stdin == null || stdout == null) {
			throw new HeadException("Null Pointer Exception");
		}

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(
				stdin));

		int numRead = 0;

		while (numLinesToRead != numRead) {
			try {
				String inputString = buffReader.readLine();
				stdout.write(inputString.getBytes("UTF-8"));
				if(numLinesToRead == numRead){
					break;
				}
				stdout.write(System.lineSeparator().getBytes("UTF-8"));
				//stdout.write("\n".getBytes("UTF-8"));
				numRead++;
			} catch (IOException e) {
				throw new HeadException("IO Exception");
			}
		}
	}

	int checkNumberOfLinesInput(String numLinesString) throws HeadException {
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

	void readFromFileAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, Path filePath) throws HeadException {

		String encoding = "UTF-8";

		if (stdout == null) {
			throw new HeadException("Stdout is null");
		}
		
		try {
			FileInputStream fileInStream = new FileInputStream(filePath.toString());
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(fileInStream));
			
			int numLinesWrote = 0;
			String input= "";
			while((input = buffReader.readLine())!= null){
				if(numLinesWrote == numLinesRequired){
					break;
				}
				stdout.write(input.getBytes(encoding));
				stdout.write(System.lineSeparator().getBytes(encoding));
				numLinesWrote++;
			}
			buffReader.close();
			
		} catch (IOException e) {
			throw new HeadException("IOException");
		}

	}

	boolean checkIfFileIsReadable(Path filePath) throws HeadException {
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
