package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.CatException;

public class FmtApplication implements Application {
	
	private static final int DEFAULT_WIDTH = 80;
	private String residue = "";
	
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) 
			throws AbstractApplicationException {
		
		if (stdout == null) {
			// Throw
		}
		
		if (args == null || args.length == 0) {
			
		} else {
			int numOfFiles = args.length;
			
			if (numOfFiles > 0) {
				List<File> readableFiles = new ArrayList<File>();
				Path currentDir = Paths.get(Environment.currentDirectory);
				for (int i = 0; i < numOfFiles; i++) {
					Path filePath = currentDir.resolve(args[i]);
					if (checkIfFileIsReadable(filePath)) {
						readableFiles.add(filePath.toFile());
					}
				}
				
				try {
					List<String> lineCollections = readAllFilesByLines(readableFiles);
					if (!lineCollections.isEmpty()) {
						List<String> formattedLines = formatLines(lineCollections, DEFAULT_WIDTH);
						for (String line: formattedLines) {
							stdout.write(line.getBytes());
						}
					}
				} catch (IOException e) {
					// Handle??
				}
			}
			
		}
	}
	
	//TODO: throw new exception
	/**
	 * Checks if a file is readable.
	 * 
	 * @param filePath
	 *            The path to the file
	 * @return True if the file is readable.
	 * @throws CatException
	 *             If the file is not readable
	 */
	boolean checkIfFileIsReadable(Path filePath) throws CatException {
		
		if (Files.isDirectory(filePath)) {
			throw new CatException("This is a directory");
		}
		if (Files.exists(filePath) && Files.isReadable(filePath)) {
			return true;
		} else {
			throw new CatException("Could not read file");
		}
	}
	
	List<String> readAllFilesByLines(List<File> files) throws IOException {
		List<String> lineCollections = new ArrayList<String>();
		BufferedReader reader = null;
		
		for (File file: files) {
			reader = new BufferedReader(new FileReader(file));	
			String line;
			while ((line = reader.readLine()) != null) {
				lineCollections.add(line);
			}
		}
		
		if (reader != null) {
			reader.close();
		}

		return lineCollections;
	}
	
	List<String> formatLines(List<String> lineCollections, int targetWidth) {
		List<String> formattedLines = new ArrayList<String>();
		
		for (String line: lineCollections) {
			List<String> wordsChunks = breakLine(residue + line, targetWidth);
			formattedLines.addAll(wordsChunks);
		}
		
		formattedLines.add(removeTrailingSpaces(residue));
		
		return formattedLines;
	}
	
	List<String> breakLine(String line, int targetWidth) {
		List<String> chunksOfWordsList = new ArrayList<>();
		
		if (line.length() <= targetWidth || line.indexOf(' ') == -1) {
			chunksOfWordsList.add(line);
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
	
	String removeTrailingSpaces(String line) {
		return line.replaceFirst("\\s+$", "");
	}
	
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
	
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add("This is aa very-long string but I dunno whether this method is correct or not ");
		int targetWidth = 10;
		
		FmtApplication app = new FmtApplication();
		List<String> res = app.formatLines(s, targetWidth);
		
		for (String string: res) {
			System.out.println(string);
		}
		
	}
}
