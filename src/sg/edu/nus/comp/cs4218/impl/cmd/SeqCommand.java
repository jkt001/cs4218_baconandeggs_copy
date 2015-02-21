package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class SeqCommand implements Command {

	Vector<PipeCommand> pipeCommandList;
	String cmdline;

	public SeqCommand(String cmdline) {
		this.cmdline = cmdline.trim();
		this.pipeCommandList = new Vector<PipeCommand>();
	}

	@Override
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {
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
				pipeCommand.evaluate(stdin, stdout);
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
			//throw new ShellException(EXP_INVALID_SYNTAX);
		}
	}
	
	public Vector<PipeCommand> getPipeCommandList(){ 
		return pipeCommandList;
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
