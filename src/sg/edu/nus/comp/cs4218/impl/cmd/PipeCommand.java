package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
		
		try {
			stdin.read(byteArray); //this part is ...wrong
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
