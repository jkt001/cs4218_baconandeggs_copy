package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.*;

/**
 * A Shell is a command interpreter and forms the backbone of the entire
 * program. Its responsibility is to interpret commands that the user type and
 * to run programs that the user specify in her command lines.
 * 
 * <p>
 * <b>Command format:</b>
 * <code>&lt;Pipe&gt; | &lt;Sequence&gt; | &lt;Call&gt;</code>
 * </p>
 */

public class ShellImpl implements Shell {

	public static final String EXP_INVALID_APP = "Invalid app.";
	public static final String EXP_SYNTAX = "Invalid syntax encountered.";
	public static final String EXP_REDIR_PIPE = "File output redirection and "
			+ "pipe operator cannot be used side by side.";
	public static final String EXP_SAME_REDIR = "Input redirection file same "
			+ "as output redirection file.";
	public static final String EXP_STDOUT = "Error writing to stdout.";
	public static final String EXP_NOT_SUPPORTED = " not supported yet";

	/**
	 * Static method to run the application as specified by the application
	 * command keyword and arguments.
	 * 
	 * @param app
	 *            String containing the keyword that specifies what application
	 *            to run.
	 * @param args
	 *            String array containing the arguments to pass to the
	 *            applications for running.
	 * @param inputStream
	 *            InputputStream for the application to get arguments from, if
	 *            needed.
	 * @param outputStream
	 *            OutputStream for the application to print its output to.
	 * 
	 * @throws AbstractApplicationException
	 *             If an exception happens while running any of the
	 *             application(s).
	 * @throws ShellException
	 *             If an unsupported or invalid application command is detected.
	 */
	public static void runApp(String app, String[] argsArray, InputStream inputStream, OutputStream outputStream)
			throws AbstractApplicationException, ShellException {
		Application absApp = null;
		if (("cat").equals(app)) {// cat [FILE]...
			absApp = new CatApplication();
		} else if (("echo").equals(app)) {// echo [args]...
			absApp = new EchoApplication();
		} else if (("head").equals(app)) {// head [OPTIONS] [FILE]
			absApp = new HeadApplication();
		} else if (("tail").equals(app)) {// tail [OPTIONS] [FILE]
			absApp = new TailApplication();
		} else if (("sort").equals(app)) {
			absApp = new SortApplication();
		} else if (("date").equals(app)) {
			absApp = new DateApplication();
		} else if (("fmt").equals(app)) {
			absApp = new FmtApplication();
		} else if (("comm").equals(app)) {
			absApp = new CommApplication();
		} else { // invalid command
			throw new ShellException(app + ": " + EXP_INVALID_APP);
		}
		absApp.run(argsArray, inputStream, outputStream);
	}

	/**
	 * Main method for the Shell Interpreter program.
	 * 
	 * @param args
	 *            List of strings arguments, unused.
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

	/**
	 * Class method for parsing and evaluating a string by input
	 * 
	 * @param cmdline
	 * 				String input from user
	 *  
	 * @param stdout
	 * 				Output stream to write to 
	 *  
	 * @throws AbstractApplicationException
	 *				If application throws one
	 * 
	 * @throws ShellException
	 * 				If no such command is found
	 */
	public void parseAndEvaluate(String cmdline, OutputStream stdout)
			throws AbstractApplicationException, ShellException {
		Parser parser = new Parser();
		parser.parse(cmdline, stdout);
		parser.evaluate();
	}

	/**
	 * Pipes two commands as required by interface. Pipes the output of the first command
	 * into the second command
	 * 
	 *  @param args
	 *  			is taken to the the 2 commands, given as args[0] the first command,
	 *   			and args[1] the second command
	 *  @return 
	 *  			the string output of the computation of these 2 commands, by piping the
	 *  			output stream of the first command, into the second command
	 */
	public String pipeTwoCommands(String[] args) {
		String output = "";
		if (args.length != 2) {
			return output;
		}
		String firstComd = args[0];
		String secondComd = args[1];
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();

		try {
			parseAndEvaluate(firstComd + "|" + secondComd, outStream);
		} catch (AbstractApplicationException | ShellException e1) {
			return output;
		}
		try {
			output = outStream.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			return " ";
		}
		return output;
	}

	/**
	 * Pipes n multiple commands as required by interface. 
	 * Pipes the output of the first command into the second command, and repeats till
	 * the last command
	 * 
	 *  @param args
	 *  			is taken to the the n commands, given as args[0] the first command,
	 *   			,args[1] the second command, ...
	 *  @return 
	 *  			the string output of the computation of these n commands, by piping the
	 *  			output stream of the first command, into the second command
	 */
	public String pipeMultipleCommands(String[] args) {
		String output = " ";
		StringBuilder comd = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			comd.append(args[i]);
			if (i != args.length-1) {
				comd.append('|');
			}
		}
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();

		try {
			parseAndEvaluate(comd.toString(), outStream);
		} catch (AbstractApplicationException | ShellException e1) {
			return output;
		}
		try {
			output = outStream.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			return " ";
		}
		return output;
	}

	/**
	 * Pipes n multiple commands but with as required by interface. 
	 * When an exception is encountered, stop all calculations and return error string
	 * 
	 *  @param args
	 *  			is taken to the the n commands, given as args[0] the first command,
	 *   			,args[1] the second command, ...
	 *  @return 
	 *  			the expected error message
	 */
	public String pipeWithException(String[] args) {
		String output = " ";
		StringBuilder comd = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			comd.append(args[i]);
			if (i != args.length-1) {
				comd.append('|');
			}
		}
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();

		try {
			parseAndEvaluate(comd.toString(), outStream);
		} catch (AbstractApplicationException | ShellException e1) {
			return e1.getMessage();
		}
		try {
			output = outStream.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			return " ";
		}
		return output;
	}

	@Override
	public String globNoPaths(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String globOneFile(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String globFilesDirectories(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String globMultiLevel(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}
}
