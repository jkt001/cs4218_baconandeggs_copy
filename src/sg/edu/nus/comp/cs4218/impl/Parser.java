package sg.edu.nus.comp.cs4218.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

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
	
	private enum GlobType {
		ALL, FILE, FOLDER
	}

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
					if (thisChar == '\\' && openQuotation == '"') {
						if (i < cmdline.length()-1) {
							currentWord.append(cmdline.charAt(i+1));
							i = i+1;
						}
					} else {
						currentWord.append(thisChar);
					}
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

		ArrayList<Path> partialDirectories = new ArrayList<Path>();
		Path root = Paths.get(Environment.currentDirectory);
		partialDirectories.add(root);
		if (toAdd.contains("*")) {
			if (toAdd.startsWith(File.separator)) {
				return currentDirectories;
			}
			GlobType gType;
			if (toAdd.endsWith(File.separator)) {
				gType = GlobType.FOLDER;
			} else if(!toAdd.endsWith("*")) {
				gType = GlobType.FILE;
			} else {
				gType = GlobType.ALL;
			}
			String[] subs = toAdd.split(File.separator);
			for (int i = 0; i<subs.length; i++) {
				String sub = subs[i];
				if (sub.contains("*")) {
					if (i == subs.length-1) {
						partialDirectories = updateDirectoriesWithGlob(partialDirectories, sub, gType);
					} else {
						partialDirectories = updateDirectoriesWithGlob(partialDirectories, sub, GlobType.FOLDER);
					}
				} else {
					if (i == subs.length-1) {
						partialDirectories = updateDirectoriesWithoutGlob(partialDirectories, sub, gType);
					} else {
						partialDirectories = updateDirectoriesWithoutGlob(partialDirectories, sub, GlobType.FOLDER);
					}
				}
			}
			for (int i = 0; i<partialDirectories.size(); i++) {
				String relative = new File(root.toUri()).toURI().relativize(new File(partialDirectories.get(i).toUri()).toURI()).getPath();
				currentDirectories.add(relative);
			}
		} else {
			currentDirectories.add(toAdd);
		}
		return currentDirectories;
	}

	private ArrayList<Path> updateDirectoriesWithGlob(ArrayList<Path> toUpdate, String next, GlobType gType) {
		ArrayList<Path> result = new ArrayList<Path>();
		ArrayList<Path> temp = new ArrayList<Path>();
		for (int j = 0; j < toUpdate.size(); j++) {
			temp = getValidGlobPaths(toUpdate.get(j), next, gType);
			for(int i = 0; i < temp.size(); i++) {
				result.add(temp.get(i));
			}
		}
		return result;
	}

	private ArrayList<Path> getValidGlobPaths(Path thisPath, String nextSub, GlobType gType) {
		ArrayList<Path> newPaths = new ArrayList<Path>();
		try {
			File thisDir = new File(thisPath.toUri());
			File[] files = thisDir.listFiles();
			for (File f: files) {
				String regexMatch = regexReplace(nextSub);
				if (Pattern.matches(regexMatch, f.getName())) {
					if ((gType == GlobType.FILE && f.isFile()) || (gType == GlobType.FOLDER && f.isDirectory())
							|| (gType == GlobType.ALL)) {
						newPaths.add(f.toPath());
					}
				}
			}
		} catch (InvalidPathException e) {
			//skip this
		}
		return newPaths;
	}

	public String regexReplace(String toReplace) {
		String temp = toReplace.replaceAll("\\.", "\\\\\\.");
		return temp.replaceAll("\\*", "\\.\\*");
	}

	private ArrayList<Path> updateDirectoriesWithoutGlob(ArrayList<Path> toUpdate, String next, GlobType gType) {
		ArrayList<Path> result = new ArrayList<Path>();
		ArrayList<Path> temp = new ArrayList<Path>();
		for (int j = 0; j < toUpdate.size(); j++) {
			temp = getValidPaths(toUpdate.get(j), next, gType);
			for(int i = 0; i < temp.size(); i++) {
				result.add(temp.get(i));
			}
		}
		return result;
	}

	private ArrayList<Path> getValidPaths(Path thisPath, String nextSub, GlobType gType) {
		ArrayList<Path> newPaths = new ArrayList<Path>();
		try {
			File thisDir = new File(thisPath.toUri());
			File[] files = thisDir.listFiles();
			for (File f: files) {
				if (f.getName().equals(nextSub)) {
					if ((gType == GlobType.FILE && f.isFile()) || (gType == GlobType.FOLDER && f.isDirectory())
							|| (gType == GlobType.ALL)) {
						newPaths.add(f.toPath());
					}
				}
			}
		} catch (InvalidPathException e) {
			//skip this
		}
		return newPaths;
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