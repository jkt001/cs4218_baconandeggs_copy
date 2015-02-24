package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

/**
 * A Pipe Command is a sub-command consisting of sub-commands separated with
 * semicolons, whereby a sub-command can either be a Pipe Command or a Call
 * Command.
 * 
 * <p>
 * <b>Command format:</b> <code>&lt;call&gt ; &lt;pipe&gt</code>
 * </p>
 */

public class PipeCommand implements Command {

	Vector<CallCommand> callCommandList;
	String cmdline;

	/**
	 * Constructor for the Pipe Command class.
	 * 
	 * @param cmdline
	 *            String of sub-command to be evaluated.
	 * 
	 */
	public PipeCommand(String cmdline) {
		this.cmdline = cmdline.trim();
		this.callCommandList = new Vector<CallCommand>();
		// System.out.println("pipe:"+cmdline);
	}

	/**
	 * Evaluates sub-command using data provided through stdin stream. Writes
	 * result to stdout stream.
	 * 
	 * @param stdin
	 *            InputStream to get data from.
	 * @param stdout
	 *            OutputStream to write resultant data to.
	 * 
	 * @throws AbstractApplicationException
	 *             If an exception happens while evaluating the sub-command.
	 * @throws ShellException
	 *             If an exception happens while evaluating the sub-command.
	 */
	@Override
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		InputStream currInputStream;
		OutputStream currOutputStream;

		for (int j = 0; j < callCommandList.size(); j++) {
			CallCommand callCmd = callCommandList.get(j);

			if (j == 0) { // last = write to stdout
				currInputStream = stdin;
			} else { // not last, write to System.out
				currInputStream = System.in;
			}

			if (j == callCommandList.size() - 1) { // last = write to stdout
				currOutputStream = stdout;
			} else { // not last, write to System.out
				currOutputStream = System.out;
			}

			callCmd.evaluate(currInputStream, currOutputStream);
		}
	}

	/**
	 * Parses the sub-command to break them up into Call Commands by semicolons.
	 * 
	 * @throws ShellException
	 *             If an exception happens while parsing the sub-command.
	 */
	public void parse() throws ShellException {

		// searches for semicolon
		int indexSemicolon = -1, strStartIdx = 0, searchStartIdx = 0;
		String rightCmd = cmdline;
		Boolean eval = false;
		CallCommand callCommand;
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

			// send to callCommand
			callCommand = new CallCommand(subCmd);
			Boolean isValid = true;
			try {
				callCommand.parse();
			} catch (Exception e) {
				isValid = false;
			}
			if (isValid) {
				callCommandList.add(callCommand);
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
			callCommandList.add(callCommand);
			throw new ShellException(ShellImpl.EXP_SYNTAX);
		}
	}

	/**
	 * For testing purposes, getting of the list of call commands after parsing;
	 * 
	 */
	Vector<CallCommand> getCallCommandList() {
		return callCommandList;
	}

	/**
	 * Terminates current execution of the command (unused for now)
	 */
	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
