package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.FindException;

/**
 * The find command recursively searches for files with matching names. It
 * outputs the list of relative paths, each followed by a newline.
 * 
 * <p>
 * <b>Command format:</b> <code>find [PATH] name PATTERN</code>
 * <dl>
 * <dt>PATTERN</dt>
 * <dd>file name with some parts replaced with * (asterisk).</dd>
 * <dt>PATH</dt>
 * <dd>the root directory for search. If not specified, use the current
 * directory.</dd>
 * </dl>
 * </p>
 */
public class FindApplication implements Application {

	/**
	 * Runs the find application with the specified arguments.
	 * 
	 * @param args
	 *            Array of arguments for the application.<br>
	 *            If the directory is omitted, the current directory is used,
	 *            and args should be {&quot;-name&quot;, PATTERN}. <br>
	 *            If the directory is specified, it can come before or after the
	 *            pattern, e.g. {PATH, &quot;-name&quot;, PATTERN} or
	 *            {&quot;-name&quot;, PATTERN, PATHs}. *
	 * @param stdin
	 *            An InputStream. Unused but must be provided.
	 * @param stdout
	 *            An OutputStream. The relative path to the matching files and
	 *            folders will be written to this OutputStream, separated by a
	 *            newline.
	 * 
	 * @throws FindException
	 *             If parameters are invalid or when path specified is invalid.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws FindException {

		checkInputOutputStreamSanity(stdin, stdout);
		checkParametersSanity(args);

		// Parse parameters
		String specifiedPath;
		final String pattern;

		if (args[0].equals("-name")) {
			specifiedPath = ".";

			if (args.length < 2) {
				throw new FindException("Too few parameters");
			}

			pattern = args[1];

			if (args.length == 3) { // Is this correct?
				specifiedPath = args[2];
			}

		} else {

			specifiedPath = args[0];

			if (args.length < 3) {
				throw new FindException("Too few parameters");
			}

			if (!args[1].equals("-name")) {
				throw new FindException("Invalid parameter format");
			}

			pattern = args[2];

		}

		List<String> foundItems = findPatternInPath(specifiedPath, pattern);
		outputItems(stdout, foundItems);

	}

	/**
	 * Writes each string in the List foundItems as a line on stdout
	 * 
	 * @param stdout
	 *            The OutputStream to write the items to
	 * @param foundItems
	 *            The List that will be written to the stdout
	 */
	private void outputItems(OutputStream stdout, List<String> foundItems) {
		final PrintWriter stdoutWriter = new PrintWriter(stdout);

		Collections.sort(foundItems);
		for (String item : foundItems) {
			stdoutWriter.println(item);
		}

		stdoutWriter.flush();
	}

	/**
	 * Finds all the file and folder names that match the pattern specified.
	 * 
	 * @param specifiedPath
	 *            The path to a directory to search in
	 * @param pattern
	 *            The pattern to match the file/folder name against
	 * @return A list of all the matching files/folders
	 * @throws FindException
	 *             If path specified is invalid or there is no permission to
	 *             traverse that directory.
	 */
	private List<String> findPatternInPath(String specifiedPath,
			final String pattern) throws FindException {
		Path basePath = FileSystems.getDefault().getPath(
				Environment.currentDirectory);
		Path resolvedPath = basePath.resolve(specifiedPath);
		Path newAbsolutePath = resolvedPath.normalize();

		if (!Files.exists(newAbsolutePath)) {
			throw new FindException("Path specified is not a valid folder");
		}

		final List<String> foundItems = new LinkedList<String>();

		try {
			Files.walkFileTree(newAbsolutePath, new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult preVisitDirectory(Path dir,
						BasicFileAttributes attrs) throws IOException {

					if (matchFileName(dir, pattern)) {
						Path relativePath = FileSystems.getDefault()
								.getPath(Environment.currentDirectory)
								.relativize(dir);
						foundItems.add(relativePath.toString());
					}

					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file,
						BasicFileAttributes attrs) throws IOException {

					if (matchFileName(file, pattern)) {
						Path relativePath = FileSystems.getDefault()
								.getPath(Environment.currentDirectory)
								.relativize(file);
						foundItems.add(relativePath.toString());
					}
					return FileVisitResult.CONTINUE;
				}

			});
		} catch (IOException e) {
			throw new FindException("Unable to traverse directory specified "
					+ e);
		}
		return foundItems;
	}

	/**
	 * Checks that stdin and stdout are not null
	 * 
	 * @param stdin
	 *            The InputStream to check
	 * @param stdout
	 *            The OutputStream to check
	 * @throws FindException
	 *             If at least one of stdin or stdout is null.
	 */
	private void checkInputOutputStreamSanity(InputStream stdin,
			OutputStream stdout) throws FindException {
		if (stdin == null || stdout == null) {
			throw new FindException("Null input/output stream");
		}
	}

	/**
	 * Check arguments are of the right number and are not null.
	 * 
	 * @param args
	 *            An array of String that are the arguments to the program.
	 * @throws FindException
	 *             If the arguments are invalid
	 */
	private void checkParametersSanity(String[] args) throws FindException {
		if (args == null) {
			throw new FindException("No parameters");
		}

		if (args.length == 0) {
			throw new FindException("No parameters");
		}

		if (args.length == 1) {
			throw new FindException("Too few parameters");
		}

		if (args.length > 3) {
			throw new FindException("Too many parameters");
		}

		if (args.length == 2 && (args[0] == null || args[1] == null)) {
			throw new FindException("Null parameter");
		}

		if (args.length == 3
				&& (args[0] == null || args[1] == null || args[2] == null)) {
			throw new FindException("Null parameter");
		}
	}

	/**
	 * Matches a Path against a pattern
	 * 
	 * @param file
	 *            The Path object to match
	 * @param expression
	 *            The pattern to match against
	 * @return True if it matches, false otherwise
	 */
	boolean matchFileName(Path file, String expression) {

		Path fileName = file.getFileName();
		String fileString = fileName.toString();

		return matchString(fileString, expression);

	}

	/**
	 * Matchs a String against a pattern
	 * 
	 * @param inputString
	 *            The string to match
	 * @param expression
	 *            The pattern to match against. The pattern can contain
	 *            asterisks (*) which is equivalent to one or more wildcard
	 *            characters.
	 * @return True if it matches, false otherwise
	 */
	boolean matchString(String inputString, String expression) {
		String[] expressionParts = expression.split(Pattern.quote("*"), -1);
		// negative number to keep empty substrings

		StringBuffer stringBuf = new StringBuffer();
		for (int i = 0; i < expressionParts.length; i++) {
			if (i > 0) {
				stringBuf.append(".*");
			}
			stringBuf.append(Pattern.quote(expressionParts[i]));
		}

		Pattern pattern = Pattern.compile(stringBuf.toString());
		Matcher matcher = pattern.matcher(inputString);

		return matcher.matches();
	}

}
