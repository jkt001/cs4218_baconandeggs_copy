package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.cmd.CallCommand;

public class ShellImpl implements Shell {

	static final String INVALID_CMD = "Invalid command.";
	static final String ERROR_REDIR_IN = "Error opening input stream for redirection.";
	static final String ERROR_REDIR_OUT = "Error opening output stream for redirection.";

	@Override
	public void parseAndEvaluate(String cmdline, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		// searches for semicolon
		int indexSemicolon = -1, strStartIdx = 0, searchStartIdx = 0;
		String rightCmd = cmdline;
		Boolean eval = false;
		//TODO: suport pipe
		//TODO: to move this to a seq command?
		do {
			eval = false;
			rightCmd = rightCmd.substring(strStartIdx);
			indexSemicolon = rightCmd.indexOf(';', searchStartIdx);
			String subCmd = "";
			if (indexSemicolon > -1) {
				subCmd = rightCmd.substring(0, indexSemicolon);
			} else {
				subCmd = rightCmd;
			}
			Vector<String> cmdVector = new Vector<String>();
			if (splitString(subCmd, cmdVector)) {
				evaluateCall(cmdVector, System.in, stdout);
				strStartIdx = indexSemicolon + 1;
				searchStartIdx = 0;
				eval = true;
			} else {
				strStartIdx = 0;
				searchStartIdx = indexSemicolon + 1;
				eval = false;
			}
		} while (indexSemicolon != -1
				&& indexSemicolon != rightCmd.length() - 1);

		if (!eval) {
			throw new ShellException(INVALID_CMD);
		}
	}

	// process command
	private void evaluateCall(Vector<String> cmdVector, InputStream stdin,
			OutputStream stdout) throws AbstractApplicationException,
			ShellException {

		String[] cmdTokensArray = cmdVector
				.toArray(new String[cmdVector.size()]), argsArray;
		String app = cmdTokensArray[0];
		int nTokens = cmdTokensArray.length;
		InputStream inputStream = stdin;
		OutputStream outputStream = stdout;

		// process inputRedir and/or outputRedir
		if (nTokens >= 3) { // last 2 for inputRedir & >outputRedir
			if (!cmdTokensArray[nTokens - 2].equals("")) {
				String inputStreamS = cmdTokensArray[nTokens - 2].trim();
				inputStream = openInputRedir(inputStreamS);
			}
			if (!cmdTokensArray[nTokens - 1].equals("")) {
				String outputStreamS = cmdTokensArray[nTokens - 1].trim();
				outputStream = openOutputRedir(outputStreamS);
			}
			argsArray = Arrays.copyOfRange(cmdTokensArray, 1,
					cmdTokensArray.length - 2);
		} else {
			argsArray = new String[0];
		}

		// process backquotes
		argsArray = processBQ(argsArray);
		runApp(app, argsArray, inputStream, outputStream);
		closeDir(inputStream, outputStream);
	}

	private void runApp(String app, String[] argsArray,
			InputStream inputStream, OutputStream outputStream)
			throws AbstractApplicationException, ShellException {
		(new CallCommand(app, argsArray)).evaluate(inputStream, outputStream);
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

	// Closes streams from redir
	private void closeDir(InputStream inputStream, OutputStream outputStream)
			throws ShellException {
		if (inputStream != System.in) {
			try {
				inputStream.close();
			} catch (IOException e) {
				throw new ShellException(e.getMessage());
			}
		}
		if (outputStream != System.out) {
			try {
				outputStream.close();
			} catch (IOException e) {
				throw new ShellException(e.getMessage());
			}
		}
	}

	// Splits cmd line to app word, args and redirections, using the extraction
	// methods above
	Boolean splitString(String cmdStr, Vector<String> cmdVector) {
		int endIdx = 0;
		String str = " " + cmdStr + " ";
		// Vector<String> cmdVector = new Vector<String>();

		// endIdx = extractAppWord(str, cmdVector, endIdx);
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
		// return cmdVector.toArray(new String[cmdVector.size()]);
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

	String[] processBQ(String... argsArray)
			throws AbstractApplicationException, ShellException {
		// echo "this is space `echo "nbsp"`"
		// Back quoted: any char except \n,`
		String[] resultArr = new String[argsArray.length];
		System.arraycopy(argsArray, 0, resultArr, 0, argsArray.length);
		String patternBQ = "`([^\\n`]*)`";
		Pattern patternBQp = Pattern.compile(patternBQ);

		for (int i = 0; i < argsArray.length; i++) {
			Matcher matcherBQ = patternBQp.matcher(argsArray[i]);
			if (matcherBQ.find()) {// found backquoted
				String bqStr = matcherBQ.group(1);
				// cmdVector.add(bqStr.trim());
				// process back quote
				OutputStream bqOutputStream = new ByteArrayOutputStream();
				parseAndEvaluate(bqStr, bqOutputStream);

				ByteArrayOutputStream outByte = (ByteArrayOutputStream) bqOutputStream;
				byte[] byteArray = outByte.toByteArray();
				String bqResult = new String(byteArray).replace("\n", "")
						.replace("\r", "");
				// replace substring of back quote with result
				String replacedStr = argsArray[i].replace("`" + bqStr + "`",
						bqResult);
				resultArr[i] = replacedStr;
			}
		}
		return resultArr;
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

	// TODO: Evaluation of pipe commands
	/*
	 * private void evaluatePipe(String cmd) throws
	 * AbstractApplicationException, ShellException { String[] pipeCmdArray =
	 * cmd.split("\\|");
	 * 
	 * byte[] buffer = new byte[1024]; InputStream stdin = new
	 * ByteArrayInputStream(buffer); OutputStream stdout = new
	 * ByteArrayOutputStream();
	 * 
	 * for (int i = 0; i < pipeCmdArray.length; i++) {
	 * evaluateCall(pipeCmdArray[i].trim(), stdin, stdout); stdin = new
	 * ByteArrayInputStream( ((ByteArrayOutputStream) stdout).toByteArray());
	 * stdout = new ByteArrayOutputStream(); } }
	 */
	public static void main(String... args) {
		ShellImpl shell = new ShellImpl();

		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				System.in));
		String readLine = null;
		String currentDir;

		while (true) {
			try {
				currentDir = Environment.currentDirectory;
				System.out.print(currentDir + ">");
				readLine = bReader.readLine();
				if (readLine == null) {
					break;
				}
				if (("").equals(readLine)) {
					continue;
				}
				shell.parseAndEvaluate(readLine, System.out);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
