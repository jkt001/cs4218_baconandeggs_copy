package sg.edu.nus.comp.cs4218.impl.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.PriorityQueue;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.app.Comm;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.CommException;

public class CommApplication implements Comm {
	
	private InputStream leftInputStream;
	private InputStream rightInputStream;
	
	
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws CommException {
		try {
			if (args.length == 2) {
				leftInputStream = inputStreamFromFileName(args[0]);
				rightInputStream = inputStreamFromFileName(args[1]);
			} else if (args.length == 1) {
				leftInputStream = stdin;
				rightInputStream = inputStreamFromFileName(args[0]);
			} else {
				throw new CommException("usage: comm [FILE1] FILE2");
			}
		} catch (CommException ce) {
			throw ce;
		} catch (Exception e) {
			throw new CommException(e.getMessage());
		}
		
	}

	private InputStream inputStreamFromFileName(String fileName) throws CommException, FileNotFoundException {
		Path currentDir = Paths.get(Environment.currentDirectory);
		Path filePath = currentDir.resolve(fileName);
		checkIfFileIsReadable(filePath, true);
		return new FileInputStream(filePath.toString());
	}
	
	private boolean checkIfFileIsReadable(Path filePath) {
		return Files.exists(filePath) && Files.isReadable(filePath);
	}
	
	private boolean checkIfFileIsReadable(Path filePath, boolean raiseException) throws CommException {
		boolean isReadable = checkIfFileIsReadable(filePath);
		if (!isReadable && raiseException) {
			throw new CommException("file is not readable");
		}
		return isReadable;
	}
	
	@Override
	public String commNoMatches(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commOnlyFirst(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commOnlySecond(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commBothMathches(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String commAllMatches(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Sorts an array list of comparable elements.
	 * @param toBeSorted
	 */
	private <E> void sort(ArrayList<E> toBeSorted) {
		PriorityQueue<E> minHeap = new PriorityQueue<E>();

		while (!toBeSorted.isEmpty()) {
			minHeap.add(toBeSorted.remove(0));
		}

		while (!minHeap.isEmpty()) {
			toBeSorted.add(minHeap.poll());
		}
	}

}
