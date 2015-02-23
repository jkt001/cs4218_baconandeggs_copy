package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;
import sg.edu.nus.comp.cs4218.impl.app.CdApplication;
import sg.edu.nus.comp.cs4218.impl.app.EchoApplication;
import sg.edu.nus.comp.cs4218.impl.app.FindApplication;
import sg.edu.nus.comp.cs4218.impl.app.HeadApplication;
import sg.edu.nus.comp.cs4218.impl.app.LsApplication;
import sg.edu.nus.comp.cs4218.impl.app.PwdApplication;
import sg.edu.nus.comp.cs4218.impl.app.TailApplication;
import sg.edu.nus.comp.cs4218.impl.app.WcApplication;
import sg.edu.nus.comp.cs4218.impl.cmd.CallCommand;
import sg.edu.nus.comp.cs4218.impl.cmd.PipeCommand;
import sg.edu.nus.comp.cs4218.impl.cmd.SeqCommand;

public class ShellImpl implements Shell {

	public static final String EXP_INVALID_APP = "Invalid app.";
	public static final String EXP_SYNTAX = "Invalid syntax encountered.";
	public static final String EXP_REDIR_PIPE = "File output redirection and pipe operator cannot be used side by side.";
	public static final String EXP_SAME_REDIR = "Input redirection file same as output redirection file.";
	public static final String EXP_STDOUT = "Error writing to stdout.";
	public static final String EXP_NOT_SUPPORTED = " not supported yet";

	@Override
	public void parseAndEvaluate(String cmdline, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		SeqCommand seqCmd = new SeqCommand(cmdline);
		seqCmd.evaluate(System.in, stdout);
		runCmdline(seqCmd, stdout);
	}

	void runCmdline(SeqCommand seqCommand, OutputStream stdout)
			throws AbstractApplicationException, ShellException {
		InputStream inputStream = System.in, currInputStream = inputStream;
		OutputStream outputStream = stdout, currOutputStream = outputStream;
		Vector<PipeCommand> pipeCommandList = seqCommand.getPipeCommandList();
		for (int i = 0; i < pipeCommandList.size(); i++) {
			PipeCommand pipeCommand = pipeCommandList.get(i);
			Vector<CallCommand> callCommandList = pipeCommand
					.getCallCommandList();
			for (int j = 0; j < callCommandList.size(); j++) {
				CallCommand callCommand = callCommandList.get(j);
				if (callCommand.isError()) {
					throw new ShellException(callCommand.getErrorMsg());
				}
				String app = callCommand.getApp();
				String inputStreamS = callCommand.getInputStreamS();
				String outputStreamS = callCommand.getOutputStreamS();
				String[] argsArray = processBQ(callCommand.getArgs());
				if (("").equals(inputStreamS)) {// empty
					currInputStream = inputStream;
				} else { // not empty
					currInputStream = openInputRedir(inputStreamS);
				}
				if (("").equals(outputStreamS)) { // empty
					if (j == callCommandList.size() - 1) { // last
						currOutputStream = new ByteArrayOutputStream();
					} else { // not last, write to stdout
						currOutputStream = outputStream;
					}
				} else {
					currOutputStream = openOutputRedir(outputStreamS);
				}
				runApp(app, argsArray, currInputStream, currOutputStream);
				closeInputStream(currInputStream);
				if (j != callCommandList.size() - 1) { // not last->close
														// outputstream
					closeOutputStream(currOutputStream);
				}
			}
			if (i == pipeCommandList.size() - 1) { // last
				closeOutputStream(currOutputStream);
			} else {// not last: pipe outputStream to inputStream
				inputStream = outputStreamToInputStream(currOutputStream);
				currOutputStream = new ByteArrayOutputStream();
			}
		}
		writeToStdout(currOutputStream, stdout);
	}

	// Open fileinputStream for redirection
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

	// Open fileoutputstream for redirection
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
				//System.out.println("backquote" + bqStr);
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

	private void runApp(String app, String[] argsArray,
			InputStream inputStream, OutputStream outputStream)
			throws AbstractApplicationException, ShellException {
		Application absApp = null;
		if (("pwd".equals(app))) {
			absApp = new PwdApplication();
		} else if (("cd").equals(app)) {// cd PATH
			absApp = new CdApplication();
		} else if (("ls").equals(app)) {// ls
			absApp = new LsApplication();
		} else if (("cat").equals(app)) {// cat [FILE]...
			absApp = new CatApplication();
		} else if (("echo").equals(app)) {// echo [args]...
			absApp = new EchoApplication();
		} else if (("head").equals(app)) {// head [OPTIONS] [FILE]
			absApp = new HeadApplication();
		} else if (("tail").equals(app)) {// tail [OPTIONS] [FILE]
			absApp = new TailApplication();
		} else if (("grep").equals(app)) {// grep PATTERN [FILE]...
			throw new ShellException(app + EXP_NOT_SUPPORTED);
			// absApp = new GrepApplication();
		} else if (("sed").equals(app)) {// sed REPLACEMENT [FILE]
			throw new ShellException(app + EXP_NOT_SUPPORTED);
			// absApp = new SedApplication();
		} else if (("find").equals(app)) {// find [PATH] ­name PATTERN
			absApp = new FindApplication();
		} else if (("wc").equals(app)) {// wc [OPTIONS] [FILE]...
			absApp = new WcApplication();
		} else { // invalid command
			throw new ShellException(app + ": " + EXP_INVALID_APP);
		}
		absApp.run(argsArray, inputStream, outputStream);
	}

	// Helper methods for converting streams
	// Closes streams from redirection
	private void closeInputStream(InputStream inputStream)
			throws ShellException {
		if (inputStream != System.in) {
			try {
				inputStream.close();
			} catch (IOException e) {
				throw new ShellException(e.getMessage());
			}
		}
	}

	private void closeOutputStream(OutputStream outputStream)
			throws ShellException {
		if (outputStream != System.out) {
			try {
				outputStream.close();
			} catch (IOException e) {
				throw new ShellException(e.getMessage());
			}
		}
	}

	private InputStream outputStreamToInputStream(OutputStream outputStream)
			throws ShellException {
		if (outputStream instanceof FileOutputStream) {
			throw new ShellException(EXP_REDIR_PIPE);
		}
		return new ByteArrayInputStream(
				((ByteArrayOutputStream) outputStream).toByteArray());
	}

	private void writeToStdout(OutputStream outputStream, OutputStream stdout)
			throws ShellException {
		if (outputStream instanceof FileOutputStream) {
			return;
		}
		try {// pipe last outputStream to stdout
			stdout.write(((ByteArrayOutputStream) outputStream).toByteArray());
		} catch (IOException e) {
			throw new ShellException(EXP_STDOUT);
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
