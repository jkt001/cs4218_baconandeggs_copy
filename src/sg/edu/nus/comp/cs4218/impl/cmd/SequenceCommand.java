package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

/**
 * A Sequence Command is a sub-command consisting of sub-commands, whereby a
 * sub-command can either be a Pipe Command, Call Command or further be another
 * Sequence Command.
 * 
 * <p>
 * <b>Command format:</b>
 * <code>&lt;command&gt ; &lt;command&gt | &lt;command&gt</code>
 * </p>
 */

public class SequenceCommand implements Command {

	public static final String EXP_STDOUT = "Error writing to stdout.";
	public static final String EXP_REDIR_PIPE = "File output redirection and pipe "
			+ "operator cannot be used side by side.";

	Vector<PipeCommand> pipeCommandList;
	String cmdline;

	/**
	 * Constructor for the Sequence Command class.
	 * 
	 * @param cmdline
	 *            String of sub-command to be evaluated.
	 * 
	 */
	public SequenceCommand(String cmdline) {
		this.cmdline = cmdline.trim();
		this.pipeCommandList = new Vector<PipeCommand>();
	}

	/**
	 * Evaluates command using data provided through stdin stream. Writes result
	 * to stdout stream.
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
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {
		InputStream currInputStream = System.in;
		OutputStream currOutputStream = new ByteArrayOutputStream();

		for (int i = 0; i < pipeCommandList.size(); i++) {
			PipeCommand pipeCmd = pipeCommandList.get(i);
			pipeCmd.evaluate(currInputStream, currOutputStream);
			if (i == pipeCommandList.size() - 1) { // last
				ShellImpl.closeOutputStream(currOutputStream);
			} else {// not last: pipe outputStream to inputStream
				currInputStream = ShellImpl
						.outputStreamToInputStream(currOutputStream);
				currOutputStream = new ByteArrayOutputStream();
			}
		}
		ShellImpl.writeToStdout(currOutputStream, stdout);
	}

	/**
	 * Parses the sub-command to break them up into Call Commands by dividers.
	 * 
	 */
	public void parse() {
		// searches for divider
		int indexDivider = -1, strStartIdx = 0, searchStartIdx = 0;
		String rightCmd = cmdline;
		Boolean eval = false;
		PipeCommand pipeCommand;

		do {
			eval = false;
			rightCmd = rightCmd.substring(strStartIdx);
			indexDivider = rightCmd.indexOf('|', searchStartIdx);
			String subCmd = "";
			if (indexDivider > -1) {
				subCmd = rightCmd.substring(0, indexDivider);
			} else {
				subCmd = rightCmd;
			}

			pipeCommand = new PipeCommand(subCmd);

			Boolean isValid = true;
			try {
				pipeCommand.parse();
			} catch (Exception e) {
				isValid = false;
			}

			if (isValid) {
				pipeCommandList.add(pipeCommand);
				strStartIdx = indexDivider + 1;
				searchStartIdx = 0;
				eval = true;
			} else {
				strStartIdx = 0;
				searchStartIdx = indexDivider + 1;
				eval = false;
			}
		} while (indexDivider != -1 && indexDivider != rightCmd.length() - 1);

		if (!eval) {
			pipeCommandList.add(pipeCommand);
		}
	}

	/**
	 * For testing purposes, getting of the list of pipe commands after parsing;
	 * 
	 */
	Vector<PipeCommand> getPipeCommandList() {
		return pipeCommandList;
	}

	/**
	 * Terminates current execution of the command (unused for now)
	 */
	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
