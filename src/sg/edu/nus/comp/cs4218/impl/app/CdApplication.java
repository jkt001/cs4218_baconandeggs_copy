package sg.edu.nus.comp.cs4218.impl.app;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CdException;

public class CdApplication implements Application {

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
		Path basePath = FileSystems.getDefault().getPath(Environment.currentDirectory);
		Path resolvedPath = basePath.resolve(specifiedPath);
		Path newAbsolutePath = resolvedPath.normalize();
		
		if (!Files.exists(newAbsolutePath)){
			throw new CdException("Path specified is not a valid folder");
		}
		
		// Check if there is valid permissions to cd into the directory
		// (replicating Windows command prompt and UNIX shell behavior)
		//
		// Disabled since this check doesn't work on Windows
		/*
		if (!newAbsolutePath.toFile().canExecute()){
			throw new CdException("Access is denied");
		}
		*/
		
		Environment.currentDirectory = newAbsolutePath.toString();

	}

}
