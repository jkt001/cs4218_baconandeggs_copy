package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class PipeCommand implements Command {

	@Override
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		//convert the output stream to the input stream
		ByteArrayOutputStream outByte = (ByteArrayOutputStream)stdout;
		
		byte[] byteArray= outByte.toByteArray();
		System.out.println("byteArray "+new String(byteArray));
		
		stdin = new ByteArrayInputStream (byteArray);
		//stdin.read(byteArray); //this part is ...wrong
		
		InputStreamReader isr = new InputStreamReader(stdin);
		isr.re
		
/*        byte[] buffer = new byte[1024];
        int len;
        try { 
            while ((len = stdin.read(buffer)) != -1) {
                stdout.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new ShellException("Error in pipe");
        }*/

        
		
	}
	
	private boolean finished = false;
	
	public class ThreadedPipe implements Runnable {

		private InputStream in;
		private OutputStream out;
		
		public ThreadedPipe(InputStream inputStream, OutputStream outputStream){
			in = inputStream;
			out = outputStream;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (!finished) {
				try {
					out.write(in.read());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
