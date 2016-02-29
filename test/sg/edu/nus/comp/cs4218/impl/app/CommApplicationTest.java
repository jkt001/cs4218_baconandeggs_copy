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
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private CommApplication commApp;
	private InputStream inStream;
	private OutputStream outStream;
	
	private static final String TAB_CHAR = "\t";
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
	private static final String SAMPLE_RESULT = 
			TAB_CHAR + TAB_CHAR + "apple" + LINE_SEPARATOR +
			TAB_CHAR + TAB_CHAR + "banana" + LINE_SEPARATOR +
			TAB_CHAR + "banana" + LINE_SEPARATOR +
			"eggplant" + LINE_SEPARATOR +
			TAB_CHAR + "zucchini" + LINE_SEPARATOR;
	
	private void writeToInputStream(String content) {
		inStream = new ByteArrayInputStream(content.getBytes());
	}
	
	private void writeToFile(String content, File file) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(content);
		writer.close();
	}
	
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
	
	/**
	 * Unreadable file should display a descriptive error message.
	 * @throws Exception
	 */
	@Test
	public void testUnreadableFile() throws Exception {
		thrown.expect(CommException.class);
		thrown.expectMessage("comm: file is not readable");
		String[] args = { "doesnotexist.txt" };
		commApp.run(args, inStream, outStream);
	}
	
	/**
	 * If the left input file is empty, then the output
	 * should be exactly the same as the right file content.
	 * @throws Exception
	 */
	@Test
	public void testEmptyLeftFile() throws Exception {
		writeToFile("", INPUT_FILE_1);
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		String expected = TAB_CHAR + "apple" + LINE_SEPARATOR
				+ TAB_CHAR + "banana" + LINE_SEPARATOR
				+ TAB_CHAR + "banana" + LINE_SEPARATOR
				+ TAB_CHAR + "zucchini" + LINE_SEPARATOR;
		assertEquals(expected, result);
	}
	
	/**
	 * If the last line does not end with a newline,
	 * the utility should output as is without adding a newline.
	 * @throws Exception
	 */
	@Test
	public void testFileNotEndingWithEndline() throws Exception {
		writeToFile("", INPUT_FILE_1);
		writeToFile("apple" + LINE_SEPARATOR
			+ "banana" + LINE_SEPARATOR
			+ "banana" + LINE_SEPARATOR
			+ "zucchini", INPUT_FILE_2);
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		String expected = TAB_CHAR + "apple" + LINE_SEPARATOR
				+ TAB_CHAR + "banana" + LINE_SEPARATOR
				+ TAB_CHAR + "banana" + LINE_SEPARATOR
				+ TAB_CHAR + "zucchini";
		assertEquals(expected, result);
	}
	
	/**
	 * If the right file is empty, the output should
	 * be exactly the same as the left file content.
	 * @throws Exception
	 */
	@Test
	public void testEmptyRightFile() throws Exception {
		writeToFile("", INPUT_FILE_2);
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		assertEquals(INPUT_CONTENT_1, result);
	}
	
	/**
	 * Running the sample test case from project description.
	 * @throws Exception
	 */
	@Test
	public void testResultOfSampleTestCase() throws Exception {
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		assertEquals(SAMPLE_RESULT, result);
	}
	
	/**
	 * No matter how long the text is, the columns will still be 
	 * separated using one tab character, no less and no more.
	 * @throws Exception
	 */
	@Test
	public void testLongLineOnLeftFile() throws Exception {
		String contentLeft = "A is for the word awesome!" + LINE_SEPARATOR +
				"C is for the food chocolate";
		String contentRight = "Banana" + LINE_SEPARATOR;
		writeToFile(contentLeft, INPUT_FILE_1);
		writeToFile(contentRight, INPUT_FILE_2);
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		StringBuilder expected = new StringBuilder(100);
		expected.append("A is for the word awesome!").append(LINE_SEPARATOR)
			    .append(TAB_CHAR).append("Banana").append(LINE_SEPARATOR)
			    .append("C is for the food chocolate");
		assertEquals(expected.toString(), result);
	}
	
	/**
	 * If a line of text that occurs on the middle of the output
	 * does not end with a newline, then it should appear as is
	 * without the addition of any newline character.
	 * @throws Exception
	 */
	@Test
	public void testRightFileEndingWithoutNewline() throws Exception {
		String contentLeft = "A is for the word awesome!" + LINE_SEPARATOR +
				"C is for the food chocolate";
		String contentRight = "Banana";
		writeToFile(contentLeft, INPUT_FILE_1);
		writeToFile(contentRight, INPUT_FILE_2);
		String[] args = { INPUT_FILENAME_1, INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		StringBuilder expected = new StringBuilder(100);
		expected.append("A is for the word awesome!").append(LINE_SEPARATOR)
		 		.append(TAB_CHAR).append("Banana")
		 		.append("C is for the food chocolate");
		assertEquals(expected.toString(), result);
	}
	
	@Test
	public void testLeftFileFromStandardInput() throws Exception {
		writeToInputStream(INPUT_CONTENT_1);
		String[] args = { INPUT_FILENAME_2 };
		commApp.run(args, inStream, outStream);
		String result = outStream.toString();
		assertEquals(SAMPLE_RESULT, result);
	}
}
