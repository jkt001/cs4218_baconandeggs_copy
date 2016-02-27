package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CatException;
import sg.edu.nus.comp.cs4218.exception.FmtException;

public class FmtApplication implements Application {
	
	private static final int DEFAULT_WIDTH = 80;
	private String residue = "";
	
	/**
	 * Runs the cat application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. Each array element is
	 *            the path to a file. If no files are specified stdin is used.
	 * @param stdin
	 *            An InputStream. The input for the command is read from this
	 *            InputStream if no files are specified.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * 
	 * @throws CatException
	 *             If the file(s) specified do not exist or are unreadable.
	 */
	
	/**
	 * Runs the fmt application with the specified arguments.
	 * 
	 * @param args Array of arguments for the application. 
	 * 			   First argument could be -w, followed by the targetWidth as second argument. 
	 * 			   Else, it can just contain a list of files. If no files are specified stdin is used.
	 * @param stdin
	 *            An InputStream. The input for the command is read from this
	 *            InputStream if no files are specified.
	 * @param stdout
	 *            An OutputStream. The output of the command is written to this
	 *            OutputStream.
	 * @throws FmtException
	 *             If there is an error.         
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) 
			throws FmtException {
		
		if (stdout == null) {
			throw new FmtException("Null Pointer Exception");
		}
		
		if (args == null || args.length == 0) {
			readFromStdinAndWriteToStdout(stdin, DEFAULT_WIDTH, stdout);
		} else if (args.length == 1 && args[0].equals("-w")) {
			throw new FmtException("Invalid width for -w option");
		} else if (args.length == 2 && args[0].equals("-w")) {
			int targetWidth = checkWidthInput(args[1]);
			readFromStdinAndWriteToStdout(stdin, targetWidth, stdout);
		} else {
			int targetWidth = DEFAULT_WIDTH;
			int numOfFiles = args.length;
			int startFile = 0;
			
			if (args[0].equals("-w")) {
				targetWidth = checkWidthInput(args[1]);
				numOfFiles -= 2;
				startFile += 2;
			}
			
			if (numOfFiles > 0) {
				List<File> readableFiles = new ArrayList<File>();
				Path currentDir = Paths.get(Environment.currentDirectory);
				for (int i = 0; i < numOfFiles; i++) {
					Path filePath = currentDir.resolve(args[startFile + i]);
					if (checkIfFileIsReadable(filePath)) {
						readableFiles.add(filePath.toFile());
					}
				}
				
				readFromFilesAndWriteToStdout(readableFiles, targetWidth, stdout);
			}
		}
	}
	/**
	 * Reads from the input stream and output the result to OutputStream once formatting is done.
	 * 
	 * @param stdin InputStream
	 * @param targetWidth The targetWidth specifying number of characters in a line
	 * @param stdout OutputStream
	 * @throws FmtException If there is an error
	 */
	void readFromStdinAndWriteToStdout(InputStream stdin, int targetWidth, OutputStream stdout) 
			throws FmtException {
		if (stdin == null || stdout == null) {
			throw new FmtException("Null Pointer Exception");
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(stdin));
		String line;
		try {
			while((line = reader.readLine()) != null) {
				resetResidue();
				List<String> wordChunks = breakLine(line, targetWidth);
				for (int i = 0; i < wordChunks.size(); i++) {
					stdout.write(wordChunks.get(i).getBytes());
					if (i < wordChunks.size() - 1) {
						stdout.write(System.getProperty("line.separator").getBytes());
					}
				}
				
				if (!removeTrailingSpaces(residue).isEmpty()) {
					stdout.write(System.getProperty("line.separator").getBytes());
					stdout.write(removeTrailingSpaces(residue).getBytes());
				}		
			}
			reader.close();
		} catch (IOException e) {
			throw new FmtException("IO Exception");
		}
	}
	
	/**
	 * Reads from a list of files and output the result to OutputStream once formatting is done.
	 * 
	 * @param files The list of files to be formatted
	 * @param targetWidth The targetWidth specifying number of characters in a line
	 * @param stdout OutputStream
	 * @throws FmtException If there is an error
	 */
	void readFromFilesAndWriteToStdout(List<File> files, int targetWidth, OutputStream stdout) 
			throws FmtException {
		if (files == null || stdout == null) {
			throw new FmtException("Null Pointer Exception");
		}
		
		try {
			List<String> accumulatedResult = processEachFile(files, targetWidth);
			for (int i = 0; i < accumulatedResult.size(); i++) {
				stdout.write(accumulatedResult.get(i).getBytes());
				if (i < accumulatedResult.size() - 1) {
					stdout.write(System.getProperty("line.separator").getBytes());
				}
			}
			
		} catch (IOException e) {
			throw new FmtException("IO Exception");
		}
	}
	
	/**
	 * 
	 * @param width The width received in the command arguments as String
	 * @return The width in Integer format
	 * @throws FmtException If width is not an Integer, or if width is 0 or a negative number
	 */
	int checkWidthInput(String width) throws FmtException {
		int widthValue;
		try {
			widthValue = Integer.parseInt(width);
			if (widthValue <= 0) {
				throw new FmtException("Invalid command, not a number");
			}
		} catch (NumberFormatException e) {
			throw new FmtException("Invalid command, not a number");
		}
		return widthValue;
	}
	
	/**
	 * Checks if a file is readable.
	 * 
	 * @param filePath The path to the file
	 * @return True if the file is readable.
	 * @throws FmtException If the file is not readable
	 */
	boolean checkIfFileIsReadable(Path filePath) throws FmtException {	
		if (Files.isDirectory(filePath)) {
			throw new FmtException("This is a directory");
		}
		if (Files.exists(filePath) && Files.isReadable(filePath)) {
			return true;
		} else {
			throw new FmtException("Could not read file");
		}
	}
	
	/**
	 * Format each of the file based on the targetWidth
	 * 
	 * @param files List of files to be formatted
	 * @param targetWidth The targetWidth specifying number of characters in a line
	 * @return A complete formatted list of words combined in all files
	 * @throws IOException If there is a problem in opening and reading a file
	 */
	List<String> processEachFile(List<File> files, int targetWidth) throws IOException {
		List<String> accumulatedResult = new ArrayList<String>();
		BufferedReader reader = null;
		
		for (File file: files) {
			List<String> lineCollections = new ArrayList<String>();
			reader = new BufferedReader(new FileReader(file));	
			String line;
			while ((line = reader.readLine()) != null) {
				lineCollections.add(line);
			}
			
			List<String> formattedLines = formatLines(lineCollections, targetWidth);
			accumulatedResult.addAll(formattedLines);
		}
		
		if (reader != null) {
			reader.close();
		}

		return accumulatedResult;
	}
	
	/**
	 * Format lines based on the targetWidth
	 * 
	 * @param lineCollections The line collections in a single file
	 * @param targetWidth The target width
	 * @return The list containing lines whose width are formatted 
	 */
	List<String> formatLines(List<String> lineCollections, int targetWidth) {
		resetResidue();
		List<String> formattedLines = new ArrayList<String>();
		
		List<String> paragraphs = accumulateIntoParagraphs(lineCollections);
		for (String line: paragraphs) {
			if (line.isEmpty() && !removeTrailingSpaces(residue).isEmpty()) {
				formattedLines.add(removeTrailingSpaces(residue));
				formattedLines.add(line);
				resetResidue();
			} else {
				List<String> wordsChunks = breakLine(residue + line, targetWidth);
				if (wordsChunks != null) {
					formattedLines.addAll(wordsChunks);
				}
			}
		}
		
		if (!removeTrailingSpaces(residue).isEmpty()) {
			formattedLines.add(removeTrailingSpaces(residue));
		}
		
		return formattedLines;
	}
	
	/**
	 * Accumulate String in adjacent lines (those not separated by 2 new lines) to form a list of paragraphs.
	 * 
	 * @param lineCollections The lines to be accumulated into paragraphs.
	 * @return paragraphs The accumulated adjacent lines.
	 */
	List<String> accumulateIntoParagraphs(List<String> lineCollections) {
		List<String> paragraphs = new ArrayList<String>();
		String combinedLines = "";
		for (String line: lineCollections) {
			if (line.trim().isEmpty()) {
				paragraphs.add(combinedLines);
				paragraphs.add(line);
				combinedLines = "";
			} else {
				if (!combinedLines.isEmpty() && 
						!combinedLines.endsWith(" ")) {
					combinedLines += " ";
				}
				combinedLines += line;
			}
		}
		
		if (!combinedLines.isEmpty()) {
			paragraphs.add(combinedLines);
		}
		
		return paragraphs;
	}
	
	/**
	 * Break a string in a line into several parts based on the specified targetWidth, and saves the residue
	 * 
	 * @param line A sentence in a line to be broken down into several parts
	 * @param targetWidth The target width
	 * @return The list containing parts of the sentence
	 */
	List<String> breakLine(String line, int targetWidth) {
		List<String> chunksOfWordsList = new ArrayList<>();
		
		if (line.length() <= targetWidth || line.indexOf(' ') == -1) {
			 chunksOfWordsList.add(removeTrailingSpaces(line));
			 return chunksOfWordsList;
		}
		
		String remainingLine = line;
		PairOfWordsChunk wordsChunk;
		while (remainingLine.length() > targetWidth) {
			wordsChunk = breakChunkOfWordsIntoTwoParts(remainingLine, targetWidth);
			chunksOfWordsList.add(removeTrailingSpaces(wordsChunk.getFirstChunk()));
			remainingLine = wordsChunk.getSecondChunk();
		}
		
		residue = remainingLine;
		
		return chunksOfWordsList;
	}
	
	/**
	 * Break up words into two parts, at the nearest spacing in between words that are less than the targetWidth
	 * 
	 * @param words The words to be broken into two chunks
	 * @param targetWidth The targetWidth
	 * @return A pair of words chunk 
	 */
	PairOfWordsChunk breakChunkOfWordsIntoTwoParts(String words, int targetWidth) {
		int indexOfSpace = words.indexOf(' ');
		int prevIndexOfSpace = words.indexOf(' ');
		while (indexOfSpace >= 0 && indexOfSpace <= targetWidth) {
			prevIndexOfSpace = indexOfSpace;
			indexOfSpace = words.indexOf(' ',  indexOfSpace + 1);
		}
		
		String firstChunk = words.substring(0, prevIndexOfSpace + 1);
		String secondChunk = words.substring(prevIndexOfSpace + 1, words.length());
		
		return new PairOfWordsChunk(firstChunk, secondChunk);
	}
	
	/**
	 * Remove trailing spaces of a given String
	 * 
	 * @param line The String in which the trailing spaces are to be removed 
	 * @return The String after the trailing spaces at the end of the String is removed or 
	 * 		   the same String if there are no trailing spaces
	 */
	String removeTrailingSpaces(String line) {
		return line.replaceFirst("\\s+$", "");
	}
	
	/**
	 * Reset residue instance variable
	 */
	void resetResidue() {
		residue = "";
	}
	
	/**
	 * Get residue instance variable. Used in unit testing.
	 * 
	 * @return residue
	 */
	String getResidue() {
		return residue;
	}
	
	/**
	 * A class that represents a pair of word chunks, each containing a phrase
	 */
	class PairOfWordsChunk {
		private final String firstChunk;
		private final String secondChunk;
		
		public PairOfWordsChunk(String firstChunk, String secondChunk) {
			this.firstChunk = firstChunk;
			this.secondChunk = secondChunk;
		}
		
		String getFirstChunk() {
			return firstChunk;
		}
		
		String getSecondChunk() {
			return secondChunk;
		}
	}
}
