package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.*;
import sg.edu.nus.comp.cs4218.impl.cmd.PipeCommand;

public class ShellImpl implements Shell {

	@Override
	public void parseAndEvaluate(String cmdline, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		String[] cmdArray = cmdline.split(";");

		for (int i = 0; i < cmdArray.length; i++) {
			String cmd = cmdArray[i].trim(); // trim leading and trailing spaces

			try {
				// look for pipe operator |
				if (cmd.contains("|")) {
					evaluatePipe(cmd);
				} else {
					evaluateCall(cmd, System.in, stdout);
				}
			} catch (IOException | ShellException e) {
				throw new ShellException(e.getMessage());
			} catch (AbstractApplicationException e) {
				throw e;
			}
		}
	}

	// process command
	private void evaluateCall(String cmd, InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException, IOException {
		String[] cmdTokensArray = splitString(cmd), argsArray;
		String app = cmdTokensArray[0];
		int nTokens = cmdTokensArray.length;
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		InputStream inputStream = stdin;
		OutputStream outputStream = stdout;

		if (nTokens >= 3) { // last 2 for inputRedir & >outputRedir
			if (!cmdTokensArray[nTokens - 2].equals("")) {
				String inputStreamS = cmdTokensArray[nTokens - 2].trim();
				File inputFile = new File(inputStreamS);
				fInputStream = new FileInputStream(inputFile);
				inputStream = fInputStream;
			}
			if (!cmdTokensArray[nTokens - 1].equals("")) {
				String outputStreamS = cmdTokensArray[nTokens - 1].trim();
				File outputFile = new File(outputStreamS);
				fOutputStream = new FileOutputStream(outputFile);
				outputStream = fOutputStream;
			}
			argsArray = Arrays.copyOfRange(cmdTokensArray, 1,
					cmdTokensArray.length - 2);
		} else {
			argsArray = new String[0];
		}

		if (("pwd".equals(app))) {
			PwdApplication pwdApp = new PwdApplication();
			pwdApp.run(argsArray, inputStream, outputStream);
		} else if (("cd").equals(app)) {// cd PATH
			CdApplication cdApp = new CdApplication();
			cdApp.run(argsArray, inputStream, outputStream);
		} else if (("ls").equals(app)) {// ls
			LsApplication lsApp = new LsApplication();
			lsApp.run(argsArray, inputStream, outputStream);
		} else if (("cat").equals(app)) {// cat [FILE]...

		} else if (("echo").equals(app)) {// echo [args]... 
			EchoApplication echoApp = new EchoApplication();
			echoApp.run(argsArray, inputStream, outputStream);
		} else if (("head").equals(app)) {// head [OPTIONS] [FILE]

		} else if (("tail").equals(app)) {// tail [OPTIONS] [FILE]

		} else if (("grep").equals(app)) {// grep PATTERN [FILE]...

		} else if (("sed").equals(app)) {// sed REPLACEMENT [FILE]

		} else if (("find").equals(app)) {// find [PATH] ­name PATTERN

		} else if (("wc").equals(app)) {// wc [OPTIONS] [FILE]...

		} else if (("exit").equals(app)) {
			System.out.println("Thank you for using CS4218 Shell!");
			System.exit(0);
		} else if (("test").equals(app)) { // test | test | test;
			TestApplication testApp = new TestApplication();
			testApp.run(argsArray, inputStream, outputStream);
		} else { //invalid command
			throw new ShellException("Invalid command");
		}
	}

	private int extractAppWord(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern appWordP = Pattern.compile("([A-Za-z]*)[\\s]");
		Matcher appWordM = appWordP.matcher(str);
		if (appWordM.find()) // should be got
		{
			String grpStr = appWordM.group(1);
			cmdVector.add(grpStr);
			newEndIdx = endIdx + appWordM.end() - 1;
		}
		if (newEndIdx == -1) { // app word should be found in any case
			throw new ShellException("Invalid command");
		}
		return newEndIdx;
	}

	private int extractArgs(String str, Vector<String> cmdVector, int endIdx) {
		String patternDash = "[\\s]+(-[A-Za-z]*)[\\s]";
		// Unquoted: any char except for whitespace characters, quotes,
		// newlines, semicolons “;”, “|”, “<” and “>”.
		String patternUQ = "[\\s]+([^\\s\"'`\\n;|<>]*)[\\s]";
		// Double quoted: any char except \n, ", `
		String patternDQ = "[\\s]+\"([^\\n\"`]*)\"[\\s]";
		// Single quoted: any char except \n, '
		String patternSQ = "[\\s]+\'([^\\n']*)\'[\\s]";
		// Back quoted: any char except \n,`
		// TODO: change to match specification
		String patternBQ = "[\\s]+`([^\\n`]*)`[\\s]";

		String[] patterns = { patternDash, patternUQ, patternDQ, patternSQ,
				patternBQ };

		int startIdx, smallestStartIdx, smallestPattIdx, newEndIdx = endIdx;
		do {
			startIdx = -1;
			smallestStartIdx = -1;
			smallestPattIdx = -1;
			// loop through and search for all patterns from start of substring
			for (int i = 0; i < patterns.length; i++) {
				Pattern pattern = Pattern.compile(patterns[i]);
				Matcher matcher = pattern.matcher(str.substring(newEndIdx));
				if (matcher.find()) {
					startIdx = matcher.start();
					if (startIdx < smallestStartIdx || smallestStartIdx == -1) {
						smallestPattIdx = i;
						smallestStartIdx = startIdx;
					}
				}
			}
			if (smallestPattIdx != -1) {
				Pattern pattern = Pattern.compile(patterns[smallestPattIdx]);
				Matcher matcher = pattern.matcher(str.substring(newEndIdx));
				if (matcher.find()) {
					String matchedStr = matcher.group(1);
					cmdVector.add(matchedStr.trim());
					newEndIdx = newEndIdx + matcher.end() - 1;
				}
			}
		} while (smallestPattIdx != -1);

		return newEndIdx;
	}

	// two slots at end of cmdVector reserved for <inputredir and >outredir
	// assume input stream first the output stream if both are in the args
	// even if not found, put in empty strings
	private int extractInputRedir(String str, Vector<String> cmdVector,
			int endIdx) throws ShellException {
		int newEndIdx = -1;
		Pattern inputRedirP = Pattern
				.compile("[\\s]+<([\\s]*[A-Za-z0-9\\-.\\\\/]*)[\\s]");
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

	private int extractOutputRedir(String str, Vector<String> cmdVector,
			int endIdx) throws ShellException {
		int newEndIdx = -1;
		Pattern outputRedirP = Pattern
				.compile("[\\s]+>([\\s]*[A-Za-z0-9\\-.\\\\/]*)[\\s]");
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

	// splits string to app word, args and redirections
	private String[] splitString(String cmdStr) throws ShellException {
		int endIdx = 0;
		String str = cmdStr + " ";
		Vector<String> cmdVector = new Vector<String>();

		endIdx = extractAppWord(str, cmdVector, endIdx);
		endIdx = extractArgs(str, cmdVector, endIdx);
		endIdx = extractInputRedir(str, cmdVector, endIdx);
		endIdx = extractOutputRedir(str, cmdVector, endIdx);
		// System.out.println(cmdVector.toString());
		if (endIdx != str.length() - 1) {
			throw new ShellException("Invalid command");
		}

		return cmdVector.toArray(new String[cmdVector.size()]);
	}

	private void evaluatePipe(String cmd) throws AbstractApplicationException,
			ShellException, IOException {
		String[] pipeCmdArray = cmd.split("\\|");

		byte[] buffer = new byte[1024];
		InputStream stdin = new ByteArrayInputStream(buffer);
		OutputStream stdout = new ByteArrayOutputStream();

		for (int i = 0; i < pipeCmdArray.length; i++) {
			evaluateCall(pipeCmdArray[i].trim(), stdin, stdout);
			stdin = new ByteArrayInputStream(
					((ByteArrayOutputStream) stdout).toByteArray());
			stdout = new ByteArrayOutputStream();

			/*
			 * PipeCommand pc = new PipeCommand(); try { pc.evaluate(stdin,
			 * stdout); } catch (AbstractApplicationException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } catch
			 * (ShellException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */

		}
	}

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
				if (readLine == null){
					break;
				}
				shell.parseAndEvaluate(readLine, System.out);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
