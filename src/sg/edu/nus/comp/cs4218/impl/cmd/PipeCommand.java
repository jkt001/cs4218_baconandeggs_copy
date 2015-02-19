package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class PipeCommand implements Command {

	// TODO: write test case
	static final String INVALID_CMD = "Invalid command.";
	Vector<CallCommand> callCommandList;

	String cmdline;

	public PipeCommand(String cmdline) {
		this.cmdline = cmdline;
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
			CallCommand callCommand = new CallCommand(subCmd);
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
			throw new ShellException(INVALID_CMD);
		}
	}
	
	public Vector<CallCommand> getCallCommandList() {
		return callCommandList;
	}

	/*
	 * //convert the output stream to the input stream ByteArrayOutputStream
	 * outByte = (ByteArrayOutputStream)stdout;
	 * 
	 * byte[] byteArray= outByte.toByteArray();
	 * System.out.println("byteArray "+new String(byteArray));
	 * 
	 * stdin = new ByteArrayInputStream (byteArray);
	 */
	// stdin.read(byteArray); //this part is ...wrong

	/*
	 * byte[] buffer = new byte[1024]; int len; try { while ((len =
	 * stdin.read(buffer)) != -1) { stdout.write(buffer, 0, len); } } catch
	 * (IOException e) { throw new ShellException("Error in pipe"); }
	 */
	private boolean finished = false;

	public class ThreadedPipe implements Runnable {

		private final InputStream inputStream;
		private final OutputStream outputStream;

		public ThreadedPipe(InputStream inputStream, OutputStream outputStream) {
			this.inputStream = inputStream;
			this.outputStream = outputStream;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (!finished) {
				try {
					outputStream.write(inputStream.read());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// TODO: figure out what to do with this
	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
