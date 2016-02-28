package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.TailException;

public class TailApplicationTest {
	private static final String INPUT_FILE_NAME = "tail_input.txt";
	private static final File INPUT_FILE = Paths.get(Environment.currentDirectory).resolve(INPUT_FILE_NAME).toFile();
	private static final String DUMMY_FILE_NAME = "non_existent_file.xyz";
	private static final File DUMMY_FILE = Paths.get(Environment.currentDirectory).resolve(DUMMY_FILE_NAME).toFile();
	
	private static final String DEFAULT_INPUT_CONTENT = 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit," + System.lineSeparator()
					+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." + System.lineSeparator()
					+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris" + System.lineSeparator()
					+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in" + System.lineSeparator()
					+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla" + System.lineSeparator()
					+ "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" + System.lineSeparator()
					+ "qui officia deserunt mollit anim id est laborum." + System.lineSeparator();
	private static TailApplication tailApplication;
	
	private InputStream emptyInStream;
	private InputStream inStream;
	private OutputStream outStream;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setup() throws IOException {
		initializeTestFiles();
		tailApplication = new TailApplication();
		emptyInStream = new ByteArrayInputStream("".getBytes());
		inStream = new ByteArrayInputStream(DEFAULT_INPUT_CONTENT.getBytes());
		outStream = new ByteArrayOutputStream();
	}
	
	@After
	public void tearDown() throws IOException {
		outStream.close();
		deleteTestFiles();
	}
	
	// Testing setup methods
	@Test
	public void testSetup() throws Exception {
		assertTrue("Input file should exist", INPUT_FILE.exists());
		assertFalse("Dummy file should not exist", DUMMY_FILE.exists());
	}
	
	// Black Box Testing
	@Test(expected=TailException.class)
	public void testTailFromNonExistentFile() throws TailException {
		String[] args = { DUMMY_FILE_NAME };
		tailApplication.run(args, emptyInStream, outStream);
		assertEquals("", outStream.toString());
	}
	
	@Test
	public void testTailFromFile() throws Exception {
		String[] args = { INPUT_FILE_NAME };
		tailApplication.run(args, emptyInStream, outStream);
		String result = outStream.toString();
		assertEquals(DEFAULT_INPUT_CONTENT, result);
	}
	
	@Test
	public void testTailWithASingleNewlineFromInputStream() throws Exception {
		String[] args = {};
		InputStream inStream = new ByteArrayInputStream(System.lineSeparator().getBytes());
		tailApplication.run(args, inStream, outStream);
		String result = outStream.toString();
		assertEquals(System.lineSeparator(), result);
	}
	
	@Test
	public void testTailWithASingleNewlineFromFile() throws Exception {
		String[] args = { INPUT_FILE_NAME };
		writeToTestFile(System.lineSeparator());
		tailApplication.run(args, emptyInStream, outStream);
		String result = outStream.toString();
		assertEquals(System.lineSeparator(), result);
	}
	
	@Test
	public void testTailWithTwoNewlineFromInputStream() throws Exception {
		String[] args = {};
		String inputString = System.lineSeparator() + System.lineSeparator();
		InputStream inStream = new ByteArrayInputStream(inputString.getBytes());
		tailApplication.run(args, inStream, outStream);
		String result = outStream.toString();
		assertEquals(inputString, result);
	}
	
	@Test
	public void testTailWithATwoNewlineFromFile() throws Exception {
		String[] args = { INPUT_FILE_NAME };
		String inputString = System.lineSeparator() + System.lineSeparator();
		writeToTestFile(inputString);
		tailApplication.run(args, emptyInStream, outStream);
		String result = outStream.toString();
		assertEquals(inputString, result);
	}
	
	@Test
	public void testTailWithInputEndingWithNewline() throws Exception {
		String[] args = { INPUT_FILE_NAME };
		tailApplication.run(args, emptyInStream, outStream);
		String result = outStream.toString();
		assertEquals(DEFAULT_INPUT_CONTENT, result);
	}
	
	@Test
	public void testTailFromStandardInput() throws Exception {
		
	}
	
	@Test
	public void testTailWithNShorterThanFileLength() {
		
	}
	
	@Test
	public void testTailWithNEqualToFileLength() {
		
	}
	
	@Test
	public void testTailWithNLongerThanFailLength() {
		
	}
	
	@Test
	public void testTailWithoutN() {
		
	}
	
	@Test
	public void testTailWithZeroN() {
		
	}
	
	@Test
	public void testTailWithNegativeN() {
		
	}
	
	@Test
	public void testTailWithDecimalN() {
		
	}
		
	// Clear box testing
	
	
	
	// Test Setup methods
	private static void initializeTestFiles() throws IOException {
		writeToTestFile(DEFAULT_INPUT_CONTENT);
	}
	
	private static void writeToTestFile(String content) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE));
		writer.write(content);
		writer.close();
	}
	
	private static void deleteTestFiles() throws IOException {
		INPUT_FILE.delete();
	}
	
}
