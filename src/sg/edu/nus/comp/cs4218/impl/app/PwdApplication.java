package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.CdException;
import sg.edu.nus.comp.cs4218.exception.PwdException;

public class PwdApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException {

		if (args != null && args.length > 0) {
			throw new PwdException("Too many parameters");
		}
		
		try {
			stdout.write(Environment.currentDirectory.getBytes());
			stdout.write(System.getProperty("line.separator").getBytes());
		} catch (IOException e) {
			throw new PwdException("Unable to print working directory");
		}
	}

}
