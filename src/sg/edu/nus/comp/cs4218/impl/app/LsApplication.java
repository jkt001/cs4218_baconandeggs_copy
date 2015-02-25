package sg.edu.nus.comp.cs4218.impl.app;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.LsException;

/**
 * The ls command lists the content of a directory. Prints a list of files and
 * directories separated by tabs and followed by a newline. Does not print files
 * and directories whose names start with dot &quot;.&quot;.
 * 
 * <p>
 * <b>Command format:</b> <code>ls [PATH]</code>
 * <dl>
 * <dt>PATH</dt>
 * <dd>the directory. If not specified, list the current directory.</dd>
 * </dl>
 * </p>
 */
public class LsApplication implements Application {

	/**
	 * Runs the ls application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. If a path is to be
	 *            specified, the array should be of size 1 and the element is
	 *            the desired path. Otherwise, the array should be empty and the
	 *            application lists the contents of the current directory.
	 * @param stdin
	 *            An InputStream. Unused but must be provided.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * 
	 * @throws LsException
	 *             If directory does not exist or no permissions to list
	 *             contents of directory
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws LsException {
		if (args == null) {
			throw new LsException("Null arguments");
		}
		if (stdout == null) {
			throw new LsException("OutputStream not provided");
		}

		if (args.length == 0) {
			String str[] = getListOfFileFromDirectory(Environment.currentDirectory);
			writeStringToOutputStream(str, stdout);
		} else if (args.length == 1) {
			String str[] = getListOfFileFromDirectory(args[0]);
			writeStringToOutputStream(str, stdout);
		} else {
			throw new LsException("More than one path arguments");
		}
	}

	/**
	 * Get list of files and folders in the directory.
	 * 
	 * @param directory
	 *            The directory path to be listed.
	 * @return An array of String that contain the files and folders name in the
	 *         given directory Array is sorted alphabetically
	 * 
	 * @throws LsException
	 *             When the given directory is not valid; When do not have the
	 *             permission to read the directory; When there is exception
	 *             reading the directory.
	 */
	String[] getListOfFileFromDirectory(String directory) throws LsException {
		File theDir = new File(directory);

		if (!theDir.isDirectory()) {
			throw new LsException("Directory does not exist");
		}
		if (!theDir.canRead()) {
			throw new LsException("Permission denied");
		}
		if (theDir.list() == null) {
			throw new LsException("Cannot list files in the directory");
		}

		String[] list = theDir.list();
		Arrays.sort(list);

		return list;
	}

	/**
	 * Write given string array separated by tab and end with new line character
	 * to given output stream. Only write files and folders that does not start
	 * with "."
	 * 
	 * @param str
	 *            An array of string to be write to the output stream.
	 * @param stdout
	 *            The destination output stream to be written.
	 * 
	 * @throws LsException
	 *             If there is IOException thrown when writing to the output
	 *             stream, it will throw as LsException.
	 */
	void writeStringToOutputStream(String[] str, OutputStream stdout)
			throws LsException {
		try {
			if (str.length == 0) {
				stdout.write("".getBytes());
			} else {
				for (int i = 0; i < str.length - 1; i++) {
					if (!str[i].startsWith(".")) {
						stdout.write(str[i].getBytes());
						stdout.write("\t".getBytes());
					}
				}
				stdout.write(str[str.length - 1].getBytes());
				stdout.write("\n".getBytes());
			}
		} catch (IOException e) {
			throw new LsException("IOException");
		}
	}
}