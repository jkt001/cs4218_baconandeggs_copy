package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

public class PipeCommand implements Command {

	Vector<CallCommand> callCommandList;

	String cmdline;

	public PipeCommand(String cmdline) {
		this.cmdline = cmdline.trim();
		this.callCommandList = new Vector<CallCommand>();
		// System.out.println("pipe:"+cmdline);
	}

	@Override
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

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
				callCommand.evaluate(stdin, stdout);
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

	public Vector<CallCommand> getCallCommandList() {
		return callCommandList;
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
