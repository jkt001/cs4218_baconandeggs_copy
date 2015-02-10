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
		int numOfFiles = args.length;

		if (numOfFiles > 0) {
			Path filePath;
			Path[] filePathArray = new Path[numOfFiles];
			Path currentDir = Paths.get(Environment.currentDirectory);
			boolean isFileReadable = false;

			for (int i = 0; i < numOfFiles; i++) {
				filePath = currentDir.resolve(args[i]);
				// System.out.println(filePath);
				isFileReadable = checkIfFileIsReadable(filePath);
				if (isFileReadable) {
					filePathArray[i] = filePath;
				}
			}
			// file could be read. perform cat command
			if (filePathArray.length != 0) {
				for (int j = 0; j < filePathArray.length; j++) {
					// no redirection
					try {
						byte[] byteFileArray = Files
								.readAllBytes(filePathArray[j]);
						stdout.write(byteFileArray);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		} else {
			// read from stdin
			int intCount;
			try {
				while ((intCount = stdin.read()) != -1) {
					stdout.write(intCount);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private boolean checkIfFileIsReadable(Path filePath) throws CatException {
		if (Files.notExists(filePath)) {
			throw new CatException("No such file exists");
		}
		if (Files.isDirectory(filePath)) {
			throw new CatException(filePath + " is a directory");
		}

		if (Files.isRegularFile(filePath)) {
			if (Files.isReadable(filePath)) {
				if (Files.exists(filePath)) {
					return true;
				}
			} else {
				throw new CatException("No permission to read " + filePath);
			}
		} else {
			throw new CatException(filePath + " is not a regular file");
		}
		return false;
	}
}
