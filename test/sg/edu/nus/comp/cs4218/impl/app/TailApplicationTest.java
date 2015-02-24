package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.OSCheck;
import sg.edu.nus.comp.cs4218.WindowsPermission;
import sg.edu.nus.comp.cs4218.exception.TailException;
import sg.edu.nus.comp.cs4218.impl.app.TailApplication;

public class TailApplicationTest {

	private TailApplication tailApp;
	private String[] args;
	private File file;
	private ByteArrayOutputStream outStream;
	static String tempFilePath = "testTail.txt";
	private StringBuilder input;
	public static final String APP_EXCEPTION = "tail: ";
	public static final String FAIL_MSG = "Should not throw exception";
	public static final String ENCODING = "UTF-8";

	@Before
	public void setUp() throws Exception {
		tailApp = new TailApplication();
		args = null;
		outStream = new ByteArrayOutputStream();
		try {
			file = new File(tempFilePath);
			file.createNewFile();
		} catch (SecurityException se) {
			fail("Cannot create temporary file to test");
		}

		try {
			FileOutputStream fos = new FileOutputStream(new File(tempFilePath));

			BufferedWriter buffWriter = new BufferedWriter(
					new OutputStreamWriter(fos));

			for (int intCount = 0; intCount < 3; intCount++) {
				buffWriter.write(intCount + " ");
				buffWriter.write(System.lineSeparator());
				buffWriter.write(System.lineSeparator());
			}
			buffWriter.write("abcd");
			buffWriter.write(System.lineSeparator());
			buffWriter.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		input = new StringBuilder();
		for (int i = 1; i <= 9; i++) {
			input.append(i);
			input.append(System.lineSeparator());
		}
		input.append(System.lineSeparator());
	}

	@After
	public void tearDown() throws Exception {
		tailApp = null;
		args = null;
		input = null;
		file.delete();
	}

	@Test
	public void testNullInputStreamForReadingFromStdinException() {

		try {
			tailApp.readFromStdinAndWriteToStdout(outStream, 10, null);
			fail(FAIL_MSG);
		} catch (Exception e) {
			String exceptionMsg = APP_EXCEPTION + "Null Pointer Exception";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testInvalidTailCommandReadingFromStdinException() {
		args = new String[] { "-f", "2" };

		try {
			tailApp.run(args, null, outStream);
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Incorrect flag used for reading from stdin";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testValidCommandRead10LinesFromStdinWithNullArgs()
			throws TailException, IOException {

		ByteArrayInputStream inStream = new ByteArrayInputStream(input
				.toString().getBytes(ENCODING));
		StringBuilder expected = new StringBuilder();
		for (int i = 1; i <= 9; i++) {
			expected.append(i);
			expected.append(System.lineSeparator());
		}
		
		expected.append(System.lineSeparator());
		
		try {
			tailApp.run(args, inStream, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
	}

	@Test
	public void testValidCommandReadFromStdinWithFlag() throws TailException,
			IOException {

		ByteArrayInputStream inStream = new ByteArrayInputStream(input
				.toString().getBytes(ENCODING));
		args = new String[] { "-n", "5" };

		StringBuilder expected = new StringBuilder();
		for (int i = 6; i <= 9; i++) {
			expected.append(i);
			expected.append(System.lineSeparator());
		}
		expected.append(System.lineSeparator());

		try {
			tailApp.run(args, inStream, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
	}

	@Test
	public void testValidCommandReadFromStdinWithFlagLessThanInput()
			throws TailException, IOException {

		ByteArrayInputStream inStream = new ByteArrayInputStream(input
				.toString().getBytes(ENCODING));

		StringBuilder expected = new StringBuilder();
		for (int i = 2; i <= 9; i++) {
			expected.append(i);
			expected.append(System.lineSeparator());
		}
		expected.append(System.lineSeparator());

		try {
			tailApp.readFromStdinAndWriteToStdout(outStream, 9, inStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
	}

	@Test
	public void testValidCommandReadFromStdinWithFlag0Lines()
			throws TailException, IOException {

		ByteArrayInputStream inStream = new ByteArrayInputStream(input
				.toString().getBytes(ENCODING));

		try {
			tailApp.readFromStdinAndWriteToStdout(outStream, 0, inStream);
			assertEquals("", outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
	}

	@Test
	public void testValidCommandReadFromStdinWithFlagMoreThanInput()
			throws TailException, IOException {

		ByteArrayInputStream inStream = new ByteArrayInputStream(input
				.toString().getBytes(ENCODING));

		StringBuilder expected = new StringBuilder();
		for (int i = 1; i <= 9; i++) {
			expected.append(i);
			expected.append(System.lineSeparator());
		}
		expected.append(System.lineSeparator());

		try {
			tailApp.readFromStdinAndWriteToStdout(outStream, 11, inStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
	}

	@Test
	public void testFileNotExistException() {
		boolean flag;
		try {
			flag = tailApp.checkIfFileIsReadable(Paths.get("fileNotExist"));
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileIsDirException() {

		File fileDir = new File("tempTailDir");
		fileDir.mkdir();

		try {
			tailApp.checkIfFileIsReadable(Paths.get("tempTailDir"));
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION + "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}

		fileDir.delete();
	}

	@Test
	public void testFileIsVaild() {

		boolean flag = false;
		try {
			flag = tailApp.checkIfFileIsReadable(Paths.get(tempFilePath));
			assertTrue(flag);
		} catch (TailException e) {

		}
	}

	@Test
	public void testNotANumberException() {

		try {
			tailApp.checkNumberOfLinesInput("oooo");
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Invalid command, not a number.";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testNegativeNumberException() {

		try {
			tailApp.checkNumberOfLinesInput("-1");
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Number of lines cannot be negative";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testNumberIsValid() {
		try {
			int num = tailApp.checkNumberOfLinesInput("10");
			assertEquals(10, num);
		} catch (TailException e) {

		}
	}

	@Test
	public void testReadEmptyFile() throws TailException, IOException {

		File emptyFile = new File("emptyTailFile.txt");
		emptyFile.createNewFile();
		args = new String[] { "-n", "10", "emptyTailFile.txt" };

		try {
			tailApp.run(args, null, outStream);
			assertEquals("", outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
		emptyFile.delete();
	}

	@Test
	public void testInvalidTailCommandReadingFromFileException() {
		args = new String[] { "-n", "2", tempFilePath, "djdjo" };

		try {
			tailApp.run(args, null, outStream);
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Invalid Tail Command";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}
	
	@Test
	public void testIncorrectFlagUsedReadingFromFileException() {
		args = new String[] { "3", "2", tempFilePath};

		try {
			tailApp.run(args, null, outStream);
			fail(FAIL_MSG);
		} catch (TailException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Incorrect flag used";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}
	
	@Test
	public void testZeroLines() throws TailException, IOException {

		args = new String[] { "-n", "0", tempFilePath };
		try {
			tailApp.run(args, null, outStream);
			assertEquals("", outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}

	}

	@Test
	public void testReadFileLessThanTenLines() throws TailException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 3; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}
		expected.append("abcd");

		try {
			tailApp.readFromFileAndWriteToStdout(outStream, 10,
					Paths.get(tempFilePath));
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}

	}

	@Test
	public void testReadFileWithMoreThanLinesRequired() throws TailException,
			IOException {

		StringBuilder expected = new StringBuilder();
		expected.append(System.lineSeparator());
		for (int intCount = 2; intCount < 3; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}
		expected.append("abcd");

		try {
			tailApp.readFromFileAndWriteToStdout(outStream, 4,
					Paths.get(tempFilePath));
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}

	}

	@Test
	public void testReadFileLessThanLinesRequired() throws TailException,
			IOException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 3; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}
		expected.append("abcd");
		try {
			tailApp.readFromFileAndWriteToStdout(outStream, 15,
					Paths.get(tempFilePath));
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}

	}

	@Test
	public void testReadFileSameAsLineRequired() throws TailException,
			IOException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 3; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}
		expected.append("abcd");

		try {
			tailApp.readFromFileAndWriteToStdout(outStream, 7,
					Paths.get(tempFilePath));
			assertEquals(expected.toString(), outStream.toString());
		} catch (TailException e) {
			fail(FAIL_MSG);
		}
	}
	
	@Test
	public void testFileNotReadable() throws TailException, IOException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 3; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}
		expected.append("abcd");

		// Verify that file is written correctly and CAT works
		args = new String[] { tempFilePath };
		tailApp.run(args, null, outStream);

		assertEquals(expected.toString(), outStream.toString());

		// Make file not readable
		file.setReadable(false); // Unix
		if (OSCheck.isWindows()) {
			WindowsPermission.setReadable(file, false); // Windows
		}

		// Try to head file again
		args = new String[] { tempFilePath };
		try {
			tailApp.run(args, null, outStream);
		} catch (TailException e) {
			assertEquals(APP_EXCEPTION +"Could not read file", e.getLocalizedMessage());
		}
	}
}
