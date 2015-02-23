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

import sg.edu.nus.comp.cs4218.exception.HeadException;
import sg.edu.nus.comp.cs4218.impl.app.HeadApplication;

public class HeadApplicationTest {

	private HeadApplication headApp;
	private String[] args;
	private File file;
	private ByteArrayOutputStream outStream;
	
	public static String tempFilePath = "testHead.txt";
	public static final String APP_EXCEPTION = "head: ";
	public static final String SHOULDNOT_FAIL = "Should not throw exception";

	@Before
	public void setUp() throws Exception {
		headApp = new HeadApplication();
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

			for (int intCount = 0; intCount < 4; intCount++) {
				buffWriter.write(intCount + " ");
				buffWriter.write(System.lineSeparator());
				buffWriter.write(System.lineSeparator());
			}
			buffWriter.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		headApp = null;
		args = null;
		file.delete();
	}

	@Test
	public void testReadFromStdinAndWriteToStdouNullInputStreamException() {

		try {
			headApp.readFromStdinAndWriteToStdout(System.out, 3, null);
			fail("Should have thrown Null Pointer Exception but did not!");
		} catch (Exception e) {
			String exceptionMsg = APP_EXCEPTION + "Null Pointer Exception";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testInsufficentArgumentsException() {
		
		args = new String[] { "-n" };

		try {
			headApp.run(args, null, outStream);
			fail("Should have thrown exception but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testInvalidArgumentsForStdinException() {

		args = new String[] { "-", "15" };

		try {
			headApp.run(args, System.in, outStream);
			fail("Should have thrown exception but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Invalid Head Command for reading from stdin";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testInvalidHeadCommandException() {

		args = new String[] { "-n", "15", tempFilePath, "lalala" };

		try {
			headApp.run(args, null, outStream);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION + "Invalid Head Command";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testIncorrectFlagUsedException() {

		args = new String[] { "-f", "15", tempFilePath };

		try {
			headApp.run(args, null, outStream);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION + "Incorrect flag used";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileNotExistException() {

		boolean flag = false;
		
		try {
			flag = headApp.checkIfFileIsReadable(Paths.get("fileNotExist"));
			fail("Should have thrown no such file exist exception but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileIsDirException() {

		boolean flag = false;

		File fileDir = new File("tempHeadDir");
		fileDir.mkdir();

		try {
			flag = headApp.checkIfFileIsReadable(Paths.get("tempHeadDir"));
			assertFalse(flag);
			fail("Should have thrown file is directory exception but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION + "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}

		fileDir.delete();
	}

	@Test
	public void testFileIsValid() throws HeadException {

		boolean flag = false;
		try {
			flag = headApp.checkIfFileIsReadable(Paths.get(tempFilePath));
			assertTrue(flag);
		} catch (HeadException e) {
			fail("Path should be valid");
		}
	}

	@Test
	public void testNotANumberException() {

		try {
			int numLines = headApp.checkNumberOfLinesInput("ooo");
			fail("Should have thrown Not a number exception but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Invalid command, not a number.";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testNegativeNumberException() {

		try {
			int numLines = headApp.checkNumberOfLinesInput("-1");
			fail("Should have thrown negative number exception but did not!");
		} catch (HeadException e) {
			String exceptionMsg = APP_EXCEPTION
					+ "Number of lines cannot be negative";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testNumberIsValid() {

		try {
			int numLines = headApp.checkNumberOfLinesInput("10");
			assertEquals(10, numLines);
		} catch (HeadException e) {
			fail("Number should be valid");
		}
	}

	@Test
	public void testReadFromStdinWithNullArgs() throws HeadException,
			IOException {

		String inputString = "1\n" + "2\n" + "3\n" + "4\n" + "5\n" + "6\n"
				+ "7\n" + "8\n" + "9\n" + "10\n";

		ByteArrayInputStream inStream = new ByteArrayInputStream(
				inputString.getBytes("UTF-8"));

		try {
			headApp.run(args, inStream, outStream);
			assertEquals(inputString, outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}
	}

	@Test
	public void testReadFromStdinWithValidNumber() throws HeadException,
			IOException {

		String inputString = "1\n";

		ByteArrayInputStream inStream = new ByteArrayInputStream(
				inputString.getBytes("UTF-8"));

		try {
			headApp.readFromStdinAndWriteToStdout(outStream, 1,
					inStream);
			assertEquals(inputString, outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}
	}

	@Test
	public void testReadFromStdinWithFlag() throws HeadException, IOException {

		String expected = "1\n" + "2\n" + "3\n" + "4\n";
		String inputString = expected + "5\n";

		ByteArrayInputStream inStream = new ByteArrayInputStream(
				inputString.getBytes("UTF-8"));

		args = new String[2];
		args[0] = "-n";
		args[1] = "4";

		try {
			headApp.run(args, inStream, outStream);
			assertEquals(expected, outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}
	}

	@Test
	public void testReadEmptyFile() throws HeadException, IOException {

		File emptyFile = new File("HeadEmptyFileTest.txt");
		emptyFile.createNewFile();

		args = new String[] { "-n", "10", "HeadEmptyFileTest.txt" };

		try {
			headApp.readFromFileAndWriteToStdout(outStream, 10, emptyFile.toPath());
			assertEquals("", outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}
		emptyFile.delete();
	}

	@Test
	public void testReadZeroLines() throws HeadException, IOException {

		args = new String[] { "-n", "0", tempFilePath };

		try {
			
			headApp.readFromFileAndWriteToStdout(outStream, 0, Paths.get(tempFilePath));
			assertEquals("", outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}

	}

	@Test
	public void testReadFileLessThanTenLines() throws HeadException,
			IOException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}


		args = new String[] { tempFilePath };

		try {
			headApp.run(args, null, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}

	}

	@Test
	public void testReadFileMoreThanLinesRequired() throws HeadException,
			IOException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 3; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		args = new String[] { "-n", "6", tempFilePath };

		try {
			headApp.run(args, null, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}

	}

	@Test
	public void testReadFileLessThanLinesRequired() throws HeadException,
			IOException {

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		args = new String[] { "-n", "15", tempFilePath };

		try {
			headApp.run(args, null, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}

	}

	@Test
	public void testReadFileSameAsLineRequired() throws HeadException,
			IOException {

		args = new String[] { "-n", "8", tempFilePath };

		int intCount = 0;
		StringBuilder expected = new StringBuilder();

		for (intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount);
			expected.append(' ');
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		try {
			headApp.run(args, null, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (HeadException e) {
			fail(SHOULDNOT_FAIL);
		}

	}

	@Test
	public void testReadFileAndWriteToStdoutException() throws HeadException,
			IOException {
		args = new String[] { tempFilePath };
		try {
			headApp.readFromFileAndWriteToStdout(null, 10, Paths.get(tempFilePath));;
		} catch (HeadException e) {
			String expected = APP_EXCEPTION + "Stdout is null";
			assertEquals(expected, e.getMessage());
		}

	}

	// not working currently due to the set readable
	// @Test
	// public void testFileNotReadable() throws HeadException, IOException {
	// Path filePath = Files.setAttribute(Paths.get(tempFilePath),
	// "dos:readonly", false);
	// headApp.checkIfFileIsReadable(filePath);
	// boolean flag = false;
	// try {
	// flag = headApp.checkIfFileIsReadable(filePath);
	// fail("Should have thrown file is directory exception but did not!");
	// } catch (HeadException e) {
	// String exceptionMsg = "head: " + "Could not read file";
	// assertEquals(exceptionMsg, e.getMessage());
	// }
	//
	// }

}
