package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class CallCommand implements Command {

	// TODO: write test case
	public static final String INVALID_CMD = "Invalid command.";
	String app;
	String cmdline, inputStreamS, outputStreamS;
	String[] argsArray;
	Boolean error;

	public CallCommand(String cmdline) {
		this.cmdline = cmdline;
		app = inputStreamS = outputStreamS = "";
		error = false;
	}

	public CallCommand() {
		this("");
	}

	@Override
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		Vector<String> cmdVector = new Vector<String>();
		if (!splitString(cmdline, cmdVector)) {
			this.app = cmdVector.get(0);
			error = true;
			throw new ShellException(INVALID_CMD);
		}

		String[] cmdTokensArray = cmdVector
				.toArray(new String[cmdVector.size()]);
		this.app = cmdTokensArray[0];
		int nTokens = cmdTokensArray.length;

		// process inputRedir and/or outputRedir
		if (nTokens >= 3) { // last 2 for inputRedir & >outputRedir
			this.inputStreamS = cmdTokensArray[nTokens - 2].trim();
			this.outputStreamS = cmdTokensArray[nTokens - 1].trim();
			this.argsArray = Arrays.copyOfRange(cmdTokensArray, 1,
					cmdTokensArray.length - 2);
		} else {
			this.argsArray = new String[0];
		}
	}

	// Open input stream for redirection
	InputStream openInputRedir(String inputStreamS) throws ShellException {
		File inputFile = new File(inputStreamS);
		FileInputStream fInputStream = null;
		try {
			fInputStream = new FileInputStream(inputFile);
		} catch (FileNotFoundException e) {
			throw new ShellException(e.getMessage());
		}
		return fInputStream;
	}

	// Open output stream for redirection
	OutputStream openOutputRedir(String outputStreamS) throws ShellException {
		File outputFile = new File(outputStreamS);
		FileOutputStream fOutputStream = null;
		try {
			fOutputStream = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			throw new ShellException(e.getMessage());
		}
		return fOutputStream;
	}

	// Splits cmdline to app word, args and redirections, using the extraction
	// methods above
	Boolean splitString(String cmdStr, Vector<String> cmdVector) {
		int endIdx = 0;
		String str = " " + cmdStr + " ";
		try {
			endIdx = extractArgs(str, cmdVector, endIdx);
			endIdx = extractInputRedir(str, cmdVector, endIdx);
			endIdx = extractOutputRedir(str, cmdVector, endIdx);
		} catch (ShellException e) {
			return false;
		}
		// System.out.println(cmdVector.toString());
		if (endIdx != cmdStr.length() + 1) {
			return false;
		}
		return true;
	}

	// Extraction of args from cmd line
	// -Unquoted: any char except for whitespace characters, quotes,
	// newlines, semicolons “;”, “|”, “<” and “>”.
	// -Double quoted: any char except \n, ", `
	// -Single quoted: any char except \n, '
	// -Back quotes in Double Quote for command substitution:
	// "DQ rules `anything but \n` DQ rules"
	int extractArgs(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		String patternDash = "[\\s]+(-[A-Za-z]*)[\\s]";
		String patternUQ = "[\\s]+([^\\s\"'`\\n;|<>]*)[\\s]";
		String patternDQ = "[\\s]+\"([^\\n\"`]*)\"[\\s]";
		String patternSQ = "[\\s]+\'([^\\n']*)\'[\\s]";
		String patternBQ = "[\\s]+(`[^\\n`]*`)[\\s]";
		String patternBQinDQ = "[\\s]+\"([^\\n\"`]*`[^\\n]*`[^\\n\"`]*)\"[\\s]";
		String[] patterns = { patternDash, patternUQ, patternDQ, patternSQ,
				patternBQ, patternBQinDQ };
		String substring;
		int newStartIdx = endIdx, smallestStartIdx, smallestPattIdx, newEndIdx = endIdx;
		do {
			substring = str.substring(newEndIdx);
			smallestStartIdx = -1;
			smallestPattIdx = -1;
			if (substring.trim().startsWith("<")
					|| substring.trim().startsWith(">")) {
				break;
			}
			for (int i = 0; i < patterns.length; i++) {
				Pattern pattern = Pattern.compile(patterns[i]);
				Matcher matcher = pattern.matcher(substring);
				if (matcher.find()
						&& (matcher.start() < smallestStartIdx || smallestStartIdx == -1)) {
					smallestPattIdx = i;
					smallestStartIdx = matcher.start();
				}
			}
			if (smallestPattIdx != -1) { // if a pattern is found
				Pattern pattern = Pattern.compile(patterns[smallestPattIdx]);
				Matcher matcher = pattern.matcher(str.substring(newEndIdx));
				if (matcher.find()) {
					String matchedStr = matcher.group(1);
					newStartIdx = newEndIdx + matcher.start();
					if (newStartIdx != newEndIdx) {
						throw new ShellException(INVALID_CMD);
					} // check if there's any invalid token not detected
					cmdVector.add(matchedStr);
					newEndIdx = newEndIdx + matcher.end() - 1;
				}
			}
		} while (smallestPattIdx != -1);
		return newEndIdx;
	}

	// Extraction of input direction from cmdLine
	// two slots at end of cmdVector reserved for <inputredir and >outredir
	// assume that input redir and output redir are always at the end of the
	// command
	// assume input stream first the output stream if both are in the args
	// even if not found, put in empty strings
	int extractInputRedir(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern inputRedirP = Pattern
				.compile("[\\s]+<[\\s]+(([^\\n\"`'<>]*))[\\s]");
		Matcher inputRedirM = inputRedirP.matcher(str.substring(endIdx));
		String inputRedirS = "";
		if (inputRedirM.find()) {
			inputRedirS = inputRedirM.group(1);
			newEndIdx = endIdx + inputRedirM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		cmdVector.add(inputRedirS);
		return newEndIdx;
	}

	// Extraction of output direction from cmdLine
	int extractOutputRedir(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern outputRedirP = Pattern
				.compile("[\\s]+>[\\s]+(([^\\n\"`'<>]*))[\\s]");
		Matcher outputRedirM = outputRedirP.matcher(str.substring(endIdx));
		String outputRedirS = "";
		if (outputRedirM.find()) {
			outputRedirS = outputRedirM.group(1);
			newEndIdx = endIdx + outputRedirM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		cmdVector.add(outputRedirS);
		return newEndIdx;
	}

	public String getApp() {
		return app;
	}

	public String[] getArgs() {
		return argsArray;
	}

	public String getInputStreamS() {
		return inputStreamS;
	}

	public String getOutputStreamS() {
		return outputStreamS;
	}

	public Boolean isError() {
		return error;
	}

	// TODO: figure out what to do with this
	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
