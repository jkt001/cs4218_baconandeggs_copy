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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.HeadException;

public class HeadApplicationTest {
	
	private static final String FILE_NAME = "input1.txt";
	private static final String FILE_CONTENT = "TEST";
	private static final Integer NUM_LINES_IN_FILE = 50;
	
	private static final String STDIN_CONTENT = "INPUT";
	private static final Integer NUM_LINES_IN_STDIN = 50;
	
	private static final Integer DEFAULT_NUM_LINES = 10;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private static InputStream inStream;
	
	private HeadApplication headApplication;
	private OutputStream outStream;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		initializeFiles();
		
	}
	
	@Before
	public void setUp() throws IOException {
		headApplication = new HeadApplication();
		outStream = new ByteArrayOutputStream();
		initializeInputStream();
	}

	@Test
	public void testHeadWithStdinAndDefaultNumLines() throws HeadException {
		String expected = generateExpected(STDIN_CONTENT, DEFAULT_NUM_LINES, NUM_LINES_IN_STDIN);
		headApplication.run(null, inStream, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithFileAndDefaultNumLines() throws HeadException {
		String[] args = { FILE_NAME };
		String expected = generateExpected(FILE_CONTENT, DEFAULT_NUM_LINES, NUM_LINES_IN_FILE);
		headApplication.run(args, null, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithStdinAndInputNumLines() throws HeadException {
		int numLinesInput = 5;
		String[] args = { "-n", String.valueOf(numLinesInput) };
		String expected = generateExpected(STDIN_CONTENT, numLinesInput, NUM_LINES_IN_STDIN);
		headApplication.run(args, inStream, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithFileAndInputNumLines() throws HeadException {
		int numLinesInput = 5;
		String[] args = { "-n", String.valueOf(numLinesInput), FILE_NAME };
		String expected = generateExpected(FILE_CONTENT, numLinesInput, NUM_LINES_IN_FILE);
		headApplication.run(args, null, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithStdinShorterThanNumLinesArgs() throws HeadException {
		int numLinesInput = NUM_LINES_IN_STDIN + 1;
		String[] args = { "-n", String.valueOf(numLinesInput) };
		String expected = generateExpected(STDIN_CONTENT, numLinesInput, NUM_LINES_IN_STDIN);
		headApplication.run(args, inStream, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithFileShorterThanNumLinesArgs() throws HeadException {
		int numLinesInput = NUM_LINES_IN_FILE + 1;
		String[] args = { "-n", String.valueOf(numLinesInput), FILE_NAME };
		String expected = generateExpected(FILE_CONTENT, numLinesInput, NUM_LINES_IN_FILE);
		headApplication.run(args, null, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithNullArgs() throws HeadException {
		String expected = generateExpected(STDIN_CONTENT, DEFAULT_NUM_LINES, NUM_LINES_IN_STDIN); 
		headApplication.run(null, inStream, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testHeadWithEmptyArgs() throws HeadException {
		String[] args = {};
		String expected = generateExpected(STDIN_CONTENT, DEFAULT_NUM_LINES, NUM_LINES_IN_STDIN); 
		headApplication.run(args, inStream, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void shouldThrowExceptionWhenStdoutIsNull() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Null Pointer Exception");
	
		headApplication.run(null, inStream, null);
	}
	
	@Test
	public void shouldThrowExceptionWhenNumLinesIsNegative() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Invalid command, not a valid number");
		
		String[] args = {"-n", "-1"};
		headApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionWhenNumLinesIsZero() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Invalid command, not a valid number");
		
		String[] args = {"-n", "0"};
		headApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionWhenNumLinesIsNotAnInteger() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Invalid command, not a number");
		
		String[] args = {"-n", "1.5"};
		headApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionWithStdinAndInvalidOption() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Invalid Head Command for reading from stdin");
		
		String[] args = {"-a", "2"};
		headApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionWithManyArgs() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Invalid Head Command");
		
		String[] args = { "-a", "2", "input.txt", "output.txt", "test.txt" };
		headApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionWithFileAndInvalidOption() throws HeadException {
		thrown.expect(HeadException.class);
		thrown.expectMessage("Incorrect flag used");
		
		String[] args = { "-a", "2", FILE_NAME };
		headApplication.run(args, null, outStream);
	}
	
	@After
	public void tearDown() throws IOException {
		outStream.close();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws IOException {
		deleteAllFiles();
		inStream.close();
	}
	
	private static void initializeFiles() throws IOException {
		BufferedWriter writer;
		File inputFile = Paths.get(Environment.currentDirectory).resolve(FILE_NAME).toFile();
		writer = new BufferedWriter(new FileWriter(inputFile));
		for (int i = 0; i < NUM_LINES_IN_FILE; i++) {
			writer.write(FILE_CONTENT);
			if (i < NUM_LINES_IN_FILE - 1) {
				writer.write(System.getProperty("line.separator"));
			}
		}
		writer.close();
	}
	
	private static void deleteAllFiles() {
		File file = Paths.get(Environment.currentDirectory).resolve(FILE_NAME).toFile();
		file.delete();
	}
	
	private void initializeInputStream() {
		String input = "";
		for (int i = 0; i < NUM_LINES_IN_STDIN; i++) {
			input += STDIN_CONTENT;
			if (i < NUM_LINES_IN_STDIN - 1) {
				input += System.getProperty("line.separator");
			}
		}
		
		inStream = new ByteArrayInputStream(input.getBytes());
	}
	
	/**
	 * Always generate a new line at the end of the result
	 */
	private String generateExpected(String content, int numOfLines, int actualLength) {
		String expected = "";
		numOfLines = Math.min(numOfLines, actualLength);
		for (int i = 0; i < numOfLines; i++) {
			expected += content;
			expected += System.getProperty("line.separator");
		}
		return expected;
	}
	

}
