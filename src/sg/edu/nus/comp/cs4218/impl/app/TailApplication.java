package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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

	private static final String CHARSET_UTF_8 = "UTF-8";

	/**
	 * Runs the tail application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. Only one file could be
	 *            specified. If file is specified, the input should be read from
	 *            the file, else, input is read from stdin. If a flag,-n, is
	 *            specified, it should be accompanied by a number to indicate
	 *            the number of lines. If flag is not specified, the last 10
	 *            lines would be printed.
	 * 
	 * @param stdin
	 *            An InputStream. The input for the command is read from this
	 *            InputStream if no files are specified.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * 
	 * @throws TailException
	 *             If the file specified do not exist, are unreadable, or an I/O
	 *             exception occurs. If the args array do not matches the
	 *             criteria.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws TailException {

		if (args == null || args.length == 0 || args.length == 2) {
			int numLinesToRead = 0;

			if (args == null || args.length == 0) {
				numLinesToRead = 15;
			} else {
				if (args.length == 3 && args[0].equals("--n")) {
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
					numLines = 15;
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

	/**
	 * Parse the number of lines to print from String to int
	 * 
	 * @param numLinesString
	 *            The number of lines received in String
	 * @return numLines 
	 * 		The number of lines received in int
	 * @throws TailException
	 *             If the numLinesString in not an Integer or a negative number.
	 */
	int checkNumberOfLinesInput(String numLinesString) throws TailException {
		int numLines;

		try {
			numLines = Integer.parseInt(numLinesString);
		} catch (NumberFormatException nfe) {
			throw new TailException("Invalid command, not a number.");
		}

		return numLines;
	}

	/**
	 * Read from stdin and output last number of lines specified to stdout
	 * 
	 * @param stdout
	 *            An Output Stream. The output is written to this stream
	 * @param numLinesRequired
	 *            The number of lines required to output as received in the tail
	 *            command or 10 if not specified in the command
	 * @param stdin
	 *            An input Stream. Reading from stdin and not a file
	 * @throws TailException
	 *             If stdin or stdout is null. Other exceptions caught when
	 *             reading and writing from input and output streams.
	 */
	void readFromStdinAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, InputStream stdin) throws TailException {

		if (stdin == null || stdout == null) {
			throw new TailException("Null Pointer Exception");
		}	
		try {
			if (numLinesRequired == 0) {
				stdout.write("".getBytes(CHARSET_UTF_8));
			} else {
				Queue<String> inputArray = getTailOfInputStream(numLinesRequired, stdin);
				flushQueueToOutputStream(inputArray, stdout, CHARSET_UTF_8);
			}
		} catch (Exception e) {
			throw new TailException("Exception caught");
		}
	}

	/**
	 * Read from file and output last number of lines specified to stdout
	 * 
	 * @param stdout
	 *            An Output Stream. The output is written to this stream
	 * @param numLinesRequired
	 *            The number of lines required to output as received in the tail
	 *            command or 10 if not specified in the command
	 * @param filePath
	 *            A Path. Read file from the file path given
	 * @throws TailException
	 *             If stdout is null. Other exceptions caught when
	 *             reading and writing from input and output streams.
	 */
	void readFromFileAndWriteToStdout(OutputStream stdout,
			int numLinesRequired, Path filePath) throws TailException {

		try {
			FileInputStream fileInStream = new FileInputStream(
					filePath.toString());
			readFromStdinAndWriteToStdout(stdout, numLinesRequired, fileInStream);	
		} catch (Exception e) {
			throw new TailException("Exception caught");
		}
	}
	
	/**
	 * Receives a queue of string and prints each one to the specified output stream.
	 * The queue will be empty after being passed to this method.
	 * 
	 * @param inputArray
	 * @param stdout
	 * @param encoding
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	private void flushQueueToOutputStream(Queue<String> inputArray,
			OutputStream stdout, 
			String encoding) throws UnsupportedEncodingException, IOException {
		
		while (!inputArray.isEmpty()) {
			String line = inputArray.poll();
			stdout.write(line.getBytes(encoding));
		}
	}
	
	/**
	 * Reads the input stream and returns a queue containing at most the last N lines
	 * of the input stream.
	 *  
	 * @param numLinesRequired The "N" 
	 * @param inStream
	 * @return
	 * @throws IOException
	 */
	private Queue<String> getTailOfInputStream(int numLinesRequired, InputStream inStream) throws IOException {
		
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(inStream));
		Queue<String> inputArray = new LinkedList<String>();
		StringBuilder stringBuilder = new StringBuilder();
		while (true) {
			int inputChar = buffReader.read();
			if (inputChar != -1) {
				stringBuilder.append((char)inputChar);
			}
			if (inputChar == '\n' || inputChar == -1) {
				if (stringBuilder.length() > 0) {
					if (inputArray.size() == numLinesRequired) {
						inputArray.poll();
					}	
					inputArray.add(stringBuilder.toString());
					stringBuilder.setLength(0);	
				}
				if (inputChar == -1) {
					break;
				}
			}
		}
		buffReader.close();
		return inputArray;
	}

	/**
	 * Checks if a file is readable.
	 * @param filePath
	 * 		The path to the file
	 * @return
	 * 		True if the file is readable.
	 * @throws TailException
	 * 		If the file is not readable
	 */
	boolean checkIfFileIsReadable(Path filePath) throws TailException {
		
		if (Files.exists(filePath) && Files.isReadable(filePath)) {
			return true;
		} else {
			throw new TailException("Could not read file");
		}
	}
}
