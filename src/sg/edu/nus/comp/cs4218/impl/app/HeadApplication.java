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
		if (args.length == 3 || args.length == 1) {
			// args.length = 3: -n,15,file
			// args.length = 1 : file
			// file and option exist
			// check if options is in the correct format
			int numLines;
			if ((args.length == 3) && (args[0].equals("-n"))) {
				// number of lines is specified
				try {
					numLines = Integer.parseInt(args[1]);
				} catch (NumberFormatException nfe) {
					throw new HeadException("Invalid command, not a number." + System.getProperty("line.separator")+nfe);
				}
			} else {
				numLines = 10;
			}

			// check file
			Path currentDir = Paths.get(Environment.currentDirectory);
			Path filePath = currentDir.resolve(args[2]);
			boolean isFileReadable = false;
			isFileReadable = checkIfFileIsReadable(filePath);
			if (isFileReadable) {
				readAndWriteToStdout(stdout, numLines, filePath);
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

	}

	private void readAndWriteToStdout(OutputStream stdout, int numLines,
			Path filePath) {
		byte[] byteFileArray;
		int numLinesToWrite = 0;
		try {
			byteFileArray = Files.readAllBytes(filePath);
			String fileContent = new String(byteFileArray, "UTF-8");
			String spiltFileContent = System.getProperty("line.separator");
			String[] spiltFileArray = fileContent.split(spiltFileContent);

			if (numLines > spiltFileArray.length) {
				numLinesToWrite = spiltFileArray.length;
			} else{
				numLinesToWrite = numLines;
			}
			int intCount = 0;
			while (intCount != numLinesToWrite) {
				byte[] toWrite;
					toWrite = spiltFileArray[intCount].getBytes("UTF-8");
					stdout.write(toWrite);
					intCount++;
				}

				// System.out.println(spiltFileContentArray[i]);
				intCount++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	private boolean checkIfFileIsReadable(Path filePath) throws HeadException {
		if (Files.notExists(filePath)) {
			throw new HeadException("No such file exists");
		}
		if (Files.isDirectory(filePath)) {
			throw new HeadException(filePath + " is a directory");
		}

		if (Files.isRegularFile(filePath)) {
			if (Files.isReadable(filePath)) {
				if (Files.exists(filePath)) {
					return true;
				}
			} else {
				throw new HeadException("No permission to read " + filePath);
			}
		} else {
			throw new HeadException(filePath + " is not a regular file");
		}
		return false;
	}
}
