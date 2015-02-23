package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.FindException;

public class FindApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws FindException {
		
		if (stdin == null || stdout == null) {
			throw new FindException("Null input/output stream");
		}
		
		final PrintWriter stdoutWriter = new PrintWriter(stdout);
		
		checkParametersSanity(args);
		
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
			
		}else{
			
			specifiedPath = args[0];
			
			if (args.length < 3) {
				throw new FindException("Too few parameters");
			}
			
			if (!args[1].equals("-name")){
				throw new FindException("Invalid parameter format");
			}
			
			pattern = args[2];
			
		}
		
		Path basePath = FileSystems.getDefault().getPath(Environment.currentDirectory);
		Path resolvedPath = basePath.resolve(specifiedPath);
		Path newAbsolutePath = resolvedPath.normalize();
		
		if (!Files.exists(newAbsolutePath)){
			throw new FindException("Path specified is not a valid folder");
		}
		
		final List<String> foundItems = new LinkedList<String>();
		
		try {
			Files.walkFileTree(newAbsolutePath, new FileVisitor<Path>(){

				@Override
				public FileVisitResult preVisitDirectory(Path dir,
						BasicFileAttributes attrs) throws IOException {
					
					if (matchFileName(dir, pattern)){
						Path relativePath = FileSystems.getDefault().getPath(Environment.currentDirectory).relativize(dir);
						foundItems.add(relativePath.toString());
					}
					
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file,
						BasicFileAttributes attrs) throws IOException {
					
					if (matchFileName(file, pattern)){
						Path relativePath = FileSystems.getDefault().getPath(Environment.currentDirectory).relativize(file);
						foundItems.add(relativePath.toString());
					}
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path file,
						IOException exc) throws IOException {
					// TODO Auto-generated method stub
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir,
						IOException exc) throws IOException {
					// TODO Auto-generated method stub
					return FileVisitResult.CONTINUE;
				}
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collections.sort(foundItems);
		for(String item : foundItems){
			stdoutWriter.println(item);
		}
		
		stdoutWriter.flush();

	}

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

		if (args.length == 3 && (args[0] == null || args[1] == null || args[2] == null)) {
			throw new FindException("Null parameter");
		}
	}
	
	boolean matchFileName(Path file, String expression){
		
		Path fileName = file.getFileName();
		String fileString = fileName.toString();
		
		return matchString(fileString, expression);
		
	}

	boolean matchString(String inputString, String expression) {
		String[] expressionParts = expression.split(Pattern.quote("*"), -1); // negative number to keep empty substrings
		
		// System.out.println(Arrays.toString(expressionParts));
		
		StringBuffer stringBuf = new StringBuffer();
		for(int i = 0; i<expressionParts.length; i++) {
			if (i > 0) {
				stringBuf.append(".*");
			}
			stringBuf.append(Pattern.quote(expressionParts[i]));
		}
		
		// System.out.println(stringBuf);
		
		Pattern p = Pattern.compile(stringBuf.toString());
		
		Matcher m = p.matcher(inputString);
		
		return m.matches();
	}

}
