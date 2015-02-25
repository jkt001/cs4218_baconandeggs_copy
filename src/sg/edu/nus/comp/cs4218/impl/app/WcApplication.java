package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.exception.WcException;

/**
 * The wc command prints the number of bytes, words, and lines in given files
 * (followed by a newline).
 * 
 * <p>
 * <b>Command format:</b> <code>wc [OPTIONS] [FILE]...</code>
 * <dl>
 * <dt>OPTIONS</dt>
 * <dd>
 * -m : Print only the character counts<br>
 * -w : Print only the word counts<br>
 * -l : Print only the newline counts</dd>
 * <dt>FILE</dt>
 * <dd>the file(s), when no file is present, use stdin.</dd>
 * </dl>
 * </p>
 */
public class WcApplication implements Application {
	boolean printChar = false, printWord = false, printLine = false;

	/**
	 * Runs the wc application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. The element in the
	 *            array can be &quot;-m&quot; (character counts), &quot;-w&quot;
	 *            (word counts) or &quot;-l&quot; (line counts). The array can
	 *            also contain the string to the file(s). If no file is
	 *            specified, input will be read from stdin.
	 * @param stdin
	 *            An InputStream. Input is read from this InputStream if no file
	 *            is specified.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * 
	 * @throws WcException
	 *             If file specified does not exist or no permissions to read
	 *             the file.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws WcException {
		if (args == null) {
			throw new WcException("Null arguments");
		}
		if (stdout == null) {
			throw new WcException("OutputStream not provided");
		}

		String filePath[] = parseArgument(args);

		if (filePath.length == 0) {
			if (stdin == null) {
				throw new WcException("Expected stdin input");
			}
			writeWordCountsToOutputStream(wordCount(stdin), stdout);
		} else {
			try {
				for (int i = 0; i < filePath.length; i++) {

					File file = new File(filePath[i]);
					if (!file.exists()) {
						throw new WcException("File Not Found.");
					}
					if (!file.canRead()) {
						throw new WcException("Don't have read permission");
					}
					InputStream myInputStream = new FileInputStream(file);
					if (filePath.length > 1) {
						stdout.write(filePath[i].getBytes());
						stdout.write("\n".getBytes());
					}
					writeWordCountsToOutputStream(wordCount(myInputStream),
							stdout);
					myInputStream.close();
				}
			} catch (FileNotFoundException e) {
				throw new WcException("File Not Found.");
			} catch (IOException e) {
				throw new WcException("IOException.");
			}
		}
	}

	/**
	 * Write an array of integer separated by tab and end with new line
	 * character to output stream
	 * 
	 * @param counts
	 *            An array of integer to be written to output stream .
	 * @param stdout
	 *            The destination output stream to be written.
	 * 
	 * @throws WcException
	 *             If there is IOException thrown when writing to the output
	 *             stream, it will throw as WcException.
	 */
	void writeWordCountsToOutputStream(int counts[], OutputStream stdout)
			throws WcException {
		String outputStr = "";
		if (printChar) {
			outputStr += counts[0];
		}
		if (printWord) {
			if (outputStr.length() > 0) {
				outputStr += "\t";
			}
			outputStr += counts[1];
		}
		if (printLine) {
			if (outputStr.length() > 0) {
				outputStr += "\t";
			}
			outputStr += counts[2];
		}
		outputStr += "\n";
		try {
			stdout.write(outputStr.getBytes());
		} catch (IOException e) {
			throw new WcException("IOException");
		}
	}

	/**
	 * Parse the array of arguments given to differentiate the option(s) and
	 * file(s) paths. Then set the class variable base on the options.
	 * 
	 * @param args
	 *            An array of string arguments to be parsed.
	 * @return An array of string contains the file(s) path.
	 * 
	 * @throws WcException
	 *             When the flag is invalid(not one of w, m, l)
	 */
	String[] parseArgument(String... args) throws WcException {
		String filePath[] = new String[args.length];
		int pathCount = 0;
		boolean isOptionSet = false;
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("-")) {
				String str = args[i];
				for (int j = 1; j < str.length(); j++) {
					switch (args[i].charAt(j)) {
					case 'm':
						printChar = true;
						isOptionSet = true;
						break;
					case 'w':
						printWord = true;
						isOptionSet = true;
						break;
					case 'l':
						printLine = true;
						isOptionSet = true;
						break;
					default:
						throw new WcException("Invalid flag");
					}
				}
			} else {
				filePath[pathCount++] = args[i];
			}
		}

		if (!isOptionSet) {
			printChar = true;
			printWord = true;
			printLine = true;
		}

		String[] temp = new String[pathCount];
		for (int i = 0; i < pathCount; i++) {
			temp[i] = filePath[i];
		}
		return temp;
	}

	/**
	 * Count the number of bytes, word and lines for the given input stream
	 * 
	 * @param stdin
	 *            An input stream to be counted
	 * @return An integer array of word counts details. First element is number
	 *         of bytes counted. Second element is number of words counted.
	 *         Third element is number of lines counted.
	 * 
	 * @throws WcException
	 *             If there is IOException thrown when reading from the input
	 *             stream, it will throw as WcException.
	 */
	int[] wordCount(InputStream stdin) throws WcException {
		String fileLine;
		int charCount = 0, wordCount = 0, lineCount = 0;
		BufferedReader myBufferedReader = new BufferedReader(
				new InputStreamReader(stdin));
		try {
			while ((fileLine = myBufferedReader.readLine()) != null) {
				for (int i = 0; i < fileLine.length(); i++) {
					charCount++;
					if (Character.isWhitespace(fileLine.charAt(i))
							&& i != fileLine.length() - 1
							&& !Character.isWhitespace(fileLine.charAt(i + 1))) {
						wordCount++;
					}
				}
				if (!"".equals(fileLine)) {
					wordCount++;// last word
				}
				charCount++;// line character
				lineCount++;
			}
		} catch (IOException e) {
			throw new WcException("IOException");
		}
		return new int[] { charCount, wordCount, lineCount };
	}

}
