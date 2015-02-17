package sg.edu.nus.comp.cs4218.impl.app;

import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.FindException;

public class FindApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws FindException {

		boolean isPathDirectory = false;
		String pathDir;
		String pattern;
		String nameFlag;

		if (args == null || args.length == 0) {
			throw new FindException("Invalid Find Command");
		}

		// args = directoryPath, "-name", pattern
		if (args.length == 3) {
			pathDir = args[0];
			nameFlag = args[1];
			pattern = args[2];
		}
		// args = "-name", pattern
		else if (args.length == 2) {
			pathDir = Environment.currentDirectory;
			nameFlag = args[0];
			pattern = args[1];
		} else {
			throw new FindException("Invalid Find Command");
		}
		
		isPathDirectory = checkPathIsDirectory(pathDir);
		if (isPathDirectory) {
			if (nameFlag.equals("-name")) {
				File dir = new File(pathDir);
				listAllDirectories(dir, pattern, stdout, pathDir);
			} else {
				throw new FindException("Invalid Find Command");
			}
		}
	}

	public static void listAllDirectories(File dir, String criteria, OutputStream stdout, String pathDir) throws FindException {
		criteria = criteria.replace("*", ".*");

		final String findExpression = criteria;

		File[] filesArray = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {

				return (new File(dir, name).isDirectory() || name
						.matches(findExpression));
			}
		});

		for (File file : filesArray) {
			if (file.isDirectory()) {
				listAllDirectories(file, criteria, stdout, pathDir);
			} else {
				//System.out.println(file.getAbsolutePath());
				String absolutePath = file.getAbsolutePath();
				String relativePath = absolutePath.substring(pathDir.length()+1);
				//System.out.println("relative path: "+ relativePath);
				try {
					stdout.write(relativePath.getBytes("UTF-8"));
					stdout.write(System.lineSeparator().getBytes("UTF-8"));
				} catch (Exception e) {
					throw new FindException("Exception Caught");
				}
			}
		}
	}

	private boolean checkPathIsDirectory(String directoryPath)
			throws FindException {
		File dirFile = new File(directoryPath);

		if (dirFile.exists()) {
			if (dirFile.isDirectory()) {
				return true;
			} else {
				throw new FindException("Path is not a directory");
			}
		} else {
			throw new FindException("Path do not exist");
		}
	}
}
