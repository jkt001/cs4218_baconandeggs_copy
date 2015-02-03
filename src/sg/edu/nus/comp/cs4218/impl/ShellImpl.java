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
	public void evaluateCall(String cmd, InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException, IOException {
		String[] cmdTokensArray = splitString(cmd), argsArray;
		String app = cmdTokensArray[0];
		int nTokens = cmdTokensArray.length;
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		InputStream inputStream = stdin;
		OutputStream outputStream = stdout;

		System.out.println(cmdTokensArray[nTokens - 2]
				+ cmdTokensArray[nTokens - 1] + ";");
		if (nTokens >= 3) { // last 2 elements of cmdTokens reserved as
							// <inputRedir & outputRedir
			if (!cmdTokensArray[nTokens - 2].equals("")) {
				String inputStreamS = cmdTokensArray[nTokens - 2].substring(1)
						.trim();
				File inputFile = new File(inputStreamS);
				fInputStream = new FileInputStream(inputFile);
				inputStream = fInputStream;
			}
			if (!cmdTokensArray[nTokens - 1].equals("")) {
				String outputStreamS = cmdTokensArray[nTokens - 1].substring(1)
						.trim();
				File outputFile = new File(outputStreamS);
				fOutputStream = new FileOutputStream(outputFile);
				outputStream = fOutputStream;
			}
			argsArray = Arrays.copyOfRange(cmdTokensArray, 1,
					cmdTokensArray.length - 2);
		} else {
			argsArray = new String[0];
		}

		switch (app) {

		case "pwd": {
			// pw
			PwdApplication pwdApp = new PwdApplication();
			pwdApp.run(argsArray, inputStream, outputStream);
			break;
		}
		case "cd": {
			// cd PATH
			CdApplication cdApp = new CdApplication();
			cdApp.run(argsArray, inputStream, outputStream);
			break;
		}
		case "ls": {
			LsApplication lsApp = new LsApplication();
			lsApp.run(argsArray, inputStream, outputStream);
			break;
		}
		case "cat": {
			// cat [FILE]...
			break;
		}
		case "echo": {
			/*
			 * EchoApplication echoApp = new EchoApplication();
			 * echoApp.run(argsArray, inputStream, outputStream);
			 */
			break;
		}
		case "head": {
			// head [OPTIONS] [FILE]
			break;
		}
		case "tail": {
			// tail [OPTIONS] [FILE]
			break;
		}
		case "grep": {
			// grep PATTERN [FILE]...
			break;
		}
		case "sed": {
			// sed REPLACEMENT [FILE]
			break;
		}
		case "find": {
			// find [PATH] ­name PATTERN
			break;
		}
		case "wc": {
			// wc [OPTIONS] [FILE]...
			break;
		}
		case "exit": {
			System.out.println("Thank you for using CS4218 Shell!");
			System.exit(0);
			break;
		}
		case "test": {
			TestApplication testApp = new TestApplication();
			testApp.run(argsArray, inputStream, outputStream);
			break;
		}
		default: {
			throw new ShellException("Invalid command");
		}
		}
	}

	public int findAppWord(String str, Vector<String> cmdVector, int endIdx)
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

	// for wc -l
	public int findOptWord(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern optionsP = Pattern.compile("[\\s]+(-[A-Za-z])[\\s]");
		Matcher optionsM = optionsP.matcher(str.substring(endIdx));
		if (optionsM.find()) {
			int startIdx = optionsM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			String grpStr = optionsM.group(1);
			cmdVector.add(grpStr);
			newEndIdx = endIdx + optionsM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		return newEndIdx;
	}

	public int findFileWord(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern fileNameP = Pattern
				.compile("[\\s]+([\\sA-Za-z0-9\\-.\\\\/\\*]*)[\\s]");
		Matcher fileNameM = fileNameP.matcher(str.substring(endIdx));
		if (fileNameM.find()) {
			int startIdx = fileNameM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			String grpStr = fileNameM.group(1);
			cmdVector.add(grpStr.trim());
			newEndIdx = endIdx + fileNameM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		return newEndIdx;
	}

	// for find -name
	public int findNameWord(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern dashNameP = Pattern.compile("[\\s]+(-name)[\\s]");
		Matcher dashNameM = dashNameP.matcher(str.substring(endIdx));
		if (dashNameM.find()) {
			int startIdx = dashNameM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			String grpStr = dashNameM.group(1);
			cmdVector.add(grpStr);
			newEndIdx = endIdx + dashNameM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		return newEndIdx;
	}

	public int findDoubleQuoted(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern doubleQuotedP = Pattern
				.compile("[\\s]+(\"[\\s]*[\\sA-Za-z0-9\\-.\\\\/]*[\\s]*\")[\\s]");
		Matcher doubleQuotedM = doubleQuotedP.matcher(str.substring(endIdx));
		if (doubleQuotedM.find()) {
			int startIdx = doubleQuotedM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			String grpStr = doubleQuotedM.group(1);
			cmdVector.add(grpStr);
			newEndIdx = endIdx + doubleQuotedM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		return newEndIdx;
	}

	public int findSingleQuoted(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern singleQuotedP = Pattern
				.compile("[\\s]+(\'[\\s]*[\\sA-Za-z0-9\\-.\\\\/]*[\\s]*\')[\\s]");
		Matcher singleQuotedM = singleQuotedP.matcher(str.substring(endIdx));
		if (singleQuotedM.find()) {
			int startIdx = singleQuotedM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			String grpStr = singleQuotedM.group(1);
			cmdVector.add(grpStr);
			newEndIdx = endIdx + singleQuotedM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		return newEndIdx;
	}

	public int findBackQuoted(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern backQuotedP = Pattern
				.compile("[\\s]+(`[\\s]*[\\sA-Za-z0-9\\-.\\\\/]*[\\s]*`)[\\s]");
		Matcher backQuotedM = backQuotedP.matcher(str.substring(endIdx));
		if (backQuotedM.find()) {
			int startIdx = backQuotedM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			String grpStr = backQuotedM.group(1);
			cmdVector.add(grpStr);
			newEndIdx = endIdx + backQuotedM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		return newEndIdx;
	}

	// two slots at end of cmdVector reserved for <inputredir and >outredir
	// assume input stream first the output stream if both are in the args
	// even if not found, put in empty strings
	public int findInputRedir(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern inputRedirP = Pattern
				.compile("[\\s]+(<[\\s]*[A-Za-z0-9\\-.\\\\/]*)[\\s]");
		Matcher inputRedirM = inputRedirP.matcher(str.substring(endIdx));
		String inputRedirS = "";
		if (inputRedirM.find()) {
			int startIdx = inputRedirM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			inputRedirS = inputRedirM.group(1);
			newEndIdx = endIdx + inputRedirM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		cmdVector.add(inputRedirS);
		return newEndIdx;
	}

	public int findOutputRedir(String str, Vector<String> cmdVector, int endIdx)
			throws ShellException {
		int newEndIdx = -1;
		Pattern outputRedirP = Pattern
				.compile("[\\s]+(>[\\s]*[A-Za-z0-9\\-.\\\\/]*)[\\s]");
		Matcher outputRedirM = outputRedirP.matcher(str.substring(endIdx));
		String outputRedirS = "";
		if (outputRedirM.find()) {
			int startIdx = outputRedirM.start();
			if (startIdx != 0) {
				throw new ShellException("Invalid command");
			}
			outputRedirS = outputRedirM.group(1);
			newEndIdx = endIdx + outputRedirM.end() - 1;
		} else {
			newEndIdx = endIdx;
		}
		cmdVector.add(outputRedirS);
		return newEndIdx;
	}

	// splits string using delimiters
	public String[] splitString(String cmdStr) throws ShellException {
		String str = cmdStr + " ";
		Vector<String> cmdVector = new Vector<String>();
		int endIdx = 0;

		endIdx = findAppWord(str, cmdVector, endIdx);
		endIdx = findOptWord(str, cmdVector, endIdx);
		endIdx = findFileWord(str, cmdVector, endIdx);
		endIdx = findNameWord(str, cmdVector, endIdx);
		endIdx = findDoubleQuoted(str, cmdVector, endIdx);
		endIdx = findSingleQuoted(str, cmdVector, endIdx);
		// TODO: to edit to specifications
		endIdx = findBackQuoted(str, cmdVector, endIdx); 
		endIdx = findInputRedir(str, cmdVector, endIdx);
		endIdx = findOutputRedir(str, cmdVector, endIdx);

		System.out.println(cmdVector.toString());

		if (endIdx != str.length() - 1) {
			throw new ShellException("Invalid command");
		}

		return cmdVector.toArray(new String[cmdVector.size()]);
	}

	public void evaluatePipe(String cmd) throws AbstractApplicationException,
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

	public static void main(String[] vargs) {
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
				shell.parseAndEvaluate(readLine, System.out);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
