package sg.edu.nus.comp.cs4218.impl.app;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CdException;

/**
 * The cd command changes the current working directory.
 * 
 * <p>
 * <b>Command format:</b> <code>cd PATH</code>
 * <dl>
 * <dt>PATH</dt>
 * <dd>relative directory path.</dd>
 * </dl>
 * </p>
 */
public class CdApplication implements Application {

	/**
	 * Runs the cd application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application. Must be an array of
	 *            size 1, with the element containing the path to CD to.
	 * @param stdin
	 *            An InputStream. Unused but must be provided.
	 * @param stdout
	 *            An OutputStream. Unused but must be provided.
	 * 
	 * @throws CdException
	 *             If parameters are invalid or when path specified is invalid
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws CdException {

		if (stdin == null || stdout == null) {
			throw new CdException("Null input/output stream");
		}

		if (args == null) {
			throw new CdException("No parameters");
		}

		if (args.length == 0) {
			throw new CdException("No parameters");
		}

		if (args.length > 1) {
			throw new CdException("Too many parameters");
		}

		if (args[0] == null) {
			throw new CdException("Null parameter");
		}

		String specifiedPath = args[0];
		Path basePath = FileSystems.getDefault().getPath(
				Environment.currentDirectory);
		Path resolvedPath = basePath.resolve(specifiedPath);
		Path newAbsolutePath = resolvedPath.normalize();

		if (Files.notExists(newAbsolutePath)) {
			throw new CdException("Path specified is not a valid folder");
		}

		Environment.currentDirectory = newAbsolutePath.toString();

	}

}
