package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.nio.file.Files;

import org.junit.Before;
import org.junit.Rule;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CommException;

public class CommApplicationTest {
	
	private CommApplication commApp;
	private InputStream inStream;
	private OutputStream outStream;
	
	private static final String LINE_SEPARATOR = System.lineSeparator();
	
	private static final String INPUT_FILENAME_1 = "comm_input_1.txt";
	private static final String INPUT_FILENAME_2 = "comm_input_2.txt";
	
	private static final File INPUT_FILE_1 = Paths.get(Environment.currentDirectory).resolve(INPUT_FILENAME_1).toFile();
	private static final File INPUT_FILE_2 = Paths.get(Environment.currentDirectory).resolve(INPUT_FILENAME_2).toFile();
	
	private static final String INPUT_CONTENT_1 = "apple" + LINE_SEPARATOR 
			+ "banana" + LINE_SEPARATOR 
			+ "eggplant" + LINE_SEPARATOR;
	private static final String INPUT_CONTENT_2 = "apple" + LINE_SEPARATOR
			+ "banana" + LINE_SEPARATOR
			+ "banana" + LINE_SEPARATOR
			+ "zucchini" + LINE_SEPARATOR;
	
	private void writeToInputStream(String content) {
		inStream = new ByteArrayInputStream(content.getBytes());
	}
	
	private void writeToFile(String content, File file) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(content);
		writer.close();
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		commApp = new CommApplication();
		inStream = new ByteArrayInputStream("".getBytes());
		outStream = new ByteArrayOutputStream();
		writeToFile(INPUT_CONTENT_1, INPUT_FILE_1);
		writeToFile(INPUT_CONTENT_2, INPUT_FILE_2);
	}
	
	@After
	public void tearDown() {
		commApp = null;
		inStream = null;
		outStream = null;
		INPUT_FILE_1.delete();
		INPUT_FILE_2.delete();
	}
	
	@Test
	public void testSetup() {
		assertTrue(Files.exists(INPUT_FILE_1.toPath()));
		assertTrue(Files.exists(INPUT_FILE_2.toPath()));
		assertTrue(Files.isReadable(INPUT_FILE_1.toPath()));
		assertTrue(Files.isReadable(INPUT_FILE_2.toPath()));
	}
	
	@Test
	public void testRunCommandZeroArgument() throws Exception {
		thrown.expect(CommException.class);
		thrown.expectMessage("comm: usage: comm [FILE1] FILE2");
		String[] args = { };
		commApp.run(args, inStream, outStream);
	}
	
	@Test
	public void testRunCommandOneArgument() throws Exception {
		String[] args = { INPUT_FILENAME_1 };
		commApp.run(args, inStream, outStream);
	}
	
	@Test
	public void testRunCommandTwoArguments() throws Exception {
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
	}
	
	@Test
	public void testRunCommandThreeArguments() throws Exception {
		thrown.expect(CommException.class);
		thrown.expectMessage("comm: usage: comm [FILE1] FILE2");
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2, "Extra" };
		commApp.run(args, inStream, outStream);
	}
	
	@Test
	public void testUnreadableFile() throws Exception {
		thrown.expect(CommException.class);
		thrown.expectMessage("comm: file is not readable");
		String[] args = { "doesnotexist.txt" };
		commApp.run(args, inStream, outStream);
	}
	
}
