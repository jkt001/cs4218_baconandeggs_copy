package sg.edu.nus.comp.cs4218.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

/**
 * A parser handles all operations related to command parsing, which includes
 * semicolon and quoting.
 * 
 * @author wilson
 */
public class Parser {

	// Parse & Evaluate shared variables
	private ArrayList<String> comds;
	private ArrayList<String[]> args;
	private ArrayList<InputStream> ins;
	private ArrayList<OutputStream> outs;
	private ArrayList<Integer> pipeIndex;
	private ByteArrayOutputStream prevStream;

	// Parse variables
	private StringBuilder currentWord;
	private ArrayList<String> currentArgs;
	private boolean isWithinQuotes;
	private char openQuotation;
	private boolean isFirstArg;
	private boolean isWrapped;
	private String prevWord;

	public Parser() {
		comds = new ArrayList<String>();
		args = new ArrayList<String[]>();
		ins = new ArrayList<InputStream>();
		outs = new ArrayList<OutputStream>();
		currentWord = new StringBuilder();
		currentArgs = new ArrayList<String>();
		pipeIndex = new ArrayList<Integer>();
		prevStream = new ByteArrayOutputStream();
		isWithinQuotes = false;
		openQuotation = ' ';
		isFirstArg = true;
		isWrapped = false;
		prevWord = " ";
	}

	/**
	 * Parses the given input and stores in class variables for evaluation
	 * 
	 * @param cmdline
	 *            String input from user
	 * 
	 * @param stdout
	 *            Output stream to write to
	 * 
	 * @throws AbstractApplicationException
	 *             If application throws one
	 * 
	 * @throws ShellException
	 *             If no such command is found
	 */
	public void parse(String cmdline, OutputStream stdout) throws ShellException, AbstractApplicationException {
		cmdline = postpendSemicolon(cmdline);

		for (int i = 0; i < cmdline.length(); i++) {
			char thisChar = cmdline.charAt(i);
			if (thisChar == '"' || thisChar == '\'' || thisChar == '`') {
				if (isWithinQuotes) {
					possibleClosureOfQuotation(thisChar);
				} else {
					openQuotation = thisChar;
					isWithinQuotes = true;
				}
			} else {
				if (isWithinQuotes) {
					currentWord.append(thisChar);
				} else {
					if (thisChar == ';') {
						endOfLineParse(stdout, currentWord.toString());
						currentArgs = new ArrayList<String>();
						currentWord = new StringBuilder();
						isFirstArg = true;
					} else if (thisChar == ' ') {
						if (currentWord.length() > 0) {
							if (isFirstArg) {
								isFirstArg = !isFirstArg;
								comds.add(currentWord.toString());
							} else {
								currentArgs.addAll(addToArgs(currentWord.toString()));
							}
							currentWord = new StringBuilder();
						}
					} else if (thisChar == '|') {
						endOfLineParse(stdout, currentWord.toString());
						pipeIndex.add(comds.size() - 1);
						currentArgs = new ArrayList<String>();
						currentWord = new StringBuilder();
						isFirstArg = true;
					} else {
						currentWord.append(thisChar);
					}
				}
			}
		}
	}

	// Handles adding of words to args. Handles globbing is there is a need to
	private ArrayList<String> addToArgs(String toAdd) {
		ArrayList<String> currentDirectories = new ArrayList<String>();
		if (toAdd.contains("*")) {
			boolean startsWithAsterisk = false;
			boolean endsWithAsterisk = false;
			if (toAdd.startsWith("*")) {
				startsWithAsterisk = true;
			}
			if (toAdd.endsWith("*")) {
				endsWithAsterisk = true;
			}
			String[] partsOfPath = toAdd.split("\\*");
			if (partsOfPath.length == 0) {
				currentDirectories = pushAllFiles(currentDirectories, null);
				return currentDirectories;
			}
			System.out.println("here");
			for (int i = 0; i < partsOfPath.length; i++) {
				if (i == 0) {
					if (startsWithAsterisk) {
						currentDirectories = pushAllFilesWithExt(currentDirectories, null, partsOfPath[i]);
					} else {
						if (partsOfPath[i].endsWith(File.pathSeparator)) {
							System.out.println("Should see");
							currentDirectories = pushAllFiles(currentDirectories, partsOfPath[i]);
						} else {
							currentDirectories = pushAllFilesThatStart(currentDirectories, null, partsOfPath[i]);
						}
					}
				} else if (i == partsOfPath.length - 1) {
					if (endsWithAsterisk) {
						currentDirectories = pushAllFilesThatStart(currentDirectories, null, partsOfPath[i]);
					} else {
						currentDirectories = pushAllFilesWithExt(currentDirectories, null, partsOfPath[i]);
					}
				} else {
					currentDirectories = pushAllFiles(currentDirectories, null);
				}
			}
		} else {
			currentDirectories.add(toAdd);
		}
		return currentDirectories;
	}

	private ArrayList<String> pushAllFiles(ArrayList<String> paths, String subDirectory) {
		ArrayList<String> result = new ArrayList<String>();
		Path root = Paths.get(Environment.currentDirectory);
		try {
			if (subDirectory != null) {
				root.resolve(subDirectory);
			}
			File thisDir = new File(root.toUri());
			File[] files = thisDir.listFiles();
			for (File f : files) {
				result.add(f.getPath());
			}
		} catch (InvalidPathException e) {
			return null;
		}
		return result;
	}

	private ArrayList<String> pushAllFilesWithExt(ArrayList<String> paths, String subDirectory, final String ext) {
		ArrayList<String> result = new ArrayList<String>();
		Path root = Paths.get(Environment.currentDirectory);
		try {
			if (subDirectory != null) {
				root.resolve(subDirectory);
			}
			File thisDir = new File(root.toUri());
			File[] files = thisDir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String filename) {
					return filename.endsWith(ext);
				}
			});
			for (File f : files) {
				result.add(f.getPath());
			}
		} catch (InvalidPathException e) {
			return null;
		}
		return result;
	}

	private ArrayList<String> pushAllFilesThatStart(ArrayList<String> paths, String subDirectory, final String start) {
		ArrayList<String> result = new ArrayList<String>();
		Path root = Paths.get(Environment.currentDirectory);
		try {
			if (subDirectory != null) {
				root.resolve(subDirectory);
			}
			File thisDir = new File(root.toUri());
			File[] files = thisDir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String filename) {
					return filename.startsWith(start);
				}
			});
			for (File f : files) {
				result.add(f.getPath());
			}
		} catch (InvalidPathException e) {
			return null;
		}
		return result;
	}

	/**
	 * Postpends the command line with a semicolon
	 * 
	 * @param cmdline
	 *            command line to postpend semicolon to
	 * @return command line with a semicolon all the time
	 */
	private String postpendSemicolon(String cmdline) {
		if (!cmdline.endsWith(";")) {
			cmdline = cmdline + ";";
		}
		return cmdline;
	}

	/**
	 * Handles parsing when there is an open quotation in the string the
	 * preceeds the current character. Actions depend on the type of quotation
	 * there was, as well as what is the current character.
	 * 
	 * @param thisChar
	 *            the current character that we have a possible closure on
	 * @throws AbstractApplicationException
	 *             if the recursive parse encounters one
	 * @throws ShellException
	 *             if the recursive parse encounters one
	 */
	private void possibleClosureOfQuotation(char thisChar) throws ShellException, AbstractApplicationException {
		if (thisChar == openQuotation) {
			if (thisChar == '`') {
				String nextWord = recursivelyParse(currentWord.toString());
				nextWord = nextWord.replace("\n", "").replace("\r", "");
				if (isWrapped) {
					openQuotation = '"';
					isWrapped = false;
					isWithinQuotes = true;
					currentWord = new StringBuilder(prevWord + nextWord);
				} else {
					isWithinQuotes = false;
					currentArgs.add(nextWord);
					currentWord = new StringBuilder();
				}
			} else {
				if (isFirstArg) {
					isFirstArg = !isFirstArg;
					comds.add(currentWord.toString());
				} else {
					currentArgs.add(currentWord.toString());
				}
				isWithinQuotes = false;
				currentWord = new StringBuilder();
			}
		} else if (thisChar == '`' && openQuotation == '"') {
			prevWord = currentWord.toString();
			currentWord = new StringBuilder();
			openQuotation = '`';
			isWrapped = true;
			isWithinQuotes = true;
		} else {
			currentWord.append(thisChar);
			isWithinQuotes = true;
		}
	}

	/**
	 * Parses when end of line is encountered (denoted by ";")
	 * 
	 * @param stdout
	 *            Output stream of the current command
	 */
	private void endOfLineParse(OutputStream stdout, String lastWord) {
		if (isFirstArg) {
			comds.add(lastWord);
		} else {
			if (currentWord.length() > 0) {
				currentArgs.addAll(addToArgs(lastWord));
			}
		}
		String[] arguments = new String[currentArgs.size()];
		arguments = currentArgs.toArray(arguments);
		args.add(arguments);
		outs.add(stdout);
		ins.add(System.in);
	}

	/**
	 * Creates a byte array and recursively parses the command while extracting
	 * the output and inserting it back into the args
	 *
	 * @throws AbstractApplicationException
	 *             if parse throws one
	 * @throws ShellException
	 *             if parse throws one
	 */
	protected String recursivelyParse(String toParse) throws ShellException, AbstractApplicationException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		Parser nextInstance = new Parser();
		nextInstance.parse(toParse, bo);
		nextInstance.evaluate();
		String result = "";
		try {
			result = bo.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Evaluates the results of parsing by checking the comds and giving the
	 * correct arguments and inputstreams/outputstreams
	 * 
	 * @throws ShellException
	 *             if the applications throw one
	 * @throws AbstractApplicationException
	 *             if the applications throw one
	 */
	public void evaluate() throws ShellException, AbstractApplicationException {
		for (int i = 0; i < comds.size(); i++) {
			InputStream in = ins.get(i);
			OutputStream out = outs.get(i);
			if (pipeIndex.contains(i - 1)) {
				in = new ByteArrayInputStream(prevStream.toByteArray());
			}
			if (pipeIndex.contains(i)) {
				prevStream = new ByteArrayOutputStream();
				out = prevStream;
			}
			runApplication(comds.get(i), args.get(i), in, out);
		}
	}

	/**
	 * Runs the application based on the arguments provided. Simply calls the
	 * functionality provided in ShellImpl but is neccessary and protected to
	 * allow stubbing of the method such these applications do not actually run
	 * 
	 * @param cmd
	 *            command to decide which application to run
	 * @param args
	 *            arguments for this command
	 * @param in
	 *            inputstream for this command
	 * @param out
	 *            outputstream for this command
	 * @throws ShellException
	 *             if the application throws one
	 * @throws AbstractApplicationException
	 *             if the application throws one
	 */
	protected void runApplication(String cmd, String[] args, InputStream in, OutputStream out)
			throws ShellException, AbstractApplicationException {
		ShellImpl.runApp(cmd, args, in, out);
	}

	// Testing methods
	public void print() {
		System.out.println("comds = " + comds.size());
		System.out.println("args size= " + args.size());
		System.out.println("ins size =" + ins.size());
		System.out.println("outs.size = " + outs.size());

		for (int i = 0; i < pipeIndex.size(); i++) {
			System.out.println("pipeIndex = " + pipeIndex.get(i));
		}

		for (int i = 0; i < comds.size(); i++) {
			System.out.println(comds.get(i));
			System.out.print("args = ");
			System.out.println(args.get(i).length);
			for (int j = 0; j < args.get(i).length; j++) {
				System.out.println("here" + args.get(i)[j]);
			}
		}
	}

	// Stubbing methods for testing
	public ArrayList<String> getCommands() {
		return comds;
	}

	public ArrayList<String[]> getArguments() {
		return args;
	}

	public ArrayList<InputStream> getInputStreams() {
		return ins;
	}

	public ArrayList<OutputStream> getOutputStreams() {
		return outs;
	}
}