package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.PwdException;

/**
 * The pwd command reports the current working directory followed by a newline.
 * 
 * <p>
 * <b>Command format:</b> <code>pwd</code>
 * </p>
 */
public class PwdApplication implements Application {

	/**
	 * Runs the pwd application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. For the pwd
	 *            application this should be an empty array.
	 * @param stdin
	 *            An InputStream. Unused but must be provided.
	 * @param stdout
	 *            An OutputStream. The current directory is written to this
	 *            OutputStream.
	 * 
	 * @throws PwdException
	 *             If parameters are invalid or an I/O exception occurs.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws PwdException {

		if (stdin == null || stdout == null) {
			throw new PwdException("Null input/output stream");
		}

		if (args != null && args.length > 0) {
			throw new PwdException("Too many parameters");
		}

		try {
			stdout.write(Environment.currentDirectory.getBytes());
			stdout.write(System.getProperty("line.separator").getBytes());
		} catch (IOException e) {
			throw new PwdException("Unable to print working directory " + e);
		}
	}

}
