package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CatException;

public class CatApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws CatException {

		if (args == null || args.length == 0) {
			int intCount;

			try {
				while ((intCount = stdin.read()) != -1) {
					stdout.write(intCount);
				}
			} catch (IOException exIO) {
				throw new CatException(
						"Could not read input stream or write to output stream");
			} catch (NullPointerException exNull) {
				throw new CatException(
						"This is a null pointer exception. Not IOException.");
			} catch (Exception ex) {
				throw new CatException("This is an exception yet to be caught.");
			}
		}

		int numOfFiles = args.length;

		if (numOfFiles > 0) {
			Path filePath;
			Path[] filePathArray = new Path[numOfFiles];
			Path currentDir = Paths.get(Environment.currentDirectory);
			boolean isFileReadable = false;

			for (int i = 0; i < numOfFiles; i++) {
				filePath = currentDir.resolve(args[i]);
				isFileReadable = checkIfFileIsReadable(filePath);
				if (isFileReadable) {
					filePathArray[i] = filePath;
				}
			}

			// file could be read. perform cat command
			if (filePathArray.length != 0) {
				for (int j = 0; j < filePathArray.length; j++) {
					try {
						byte[] byteFileArray = Files
								.readAllBytes(filePathArray[j]);
						stdout.write(byteFileArray);
					} catch (IOException e) {
						throw new CatException(
								"Could not write to output stream");
					}
				}

			}
		}
	}

	private boolean checkIfFileIsReadable(Path filePath) throws CatException {
		if (Files.notExists(filePath)) {
			throw new CatException("No such file exists");
		}
		if (Files.isDirectory(filePath)) {
			throw new CatException("This is a directory");
		}
		if (Files.exists(filePath)&&Files.isReadable(filePath)) {
			return true;
		} else {
			throw new CatException("Could not read file");
		}
	}
}
