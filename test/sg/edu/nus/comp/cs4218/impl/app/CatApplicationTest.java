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
import sg.edu.nus.comp.cs4218.exception.CatException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;

public class CatApplicationTest {
	private CatApplication catApp;
	private String[] args;
	static String tempFilePath1 = "testCat.txt";
	static String tempFilePath2 = "testCat2.txt";
	private File tempFile1;
	private File tempFile2;
	private ByteArrayOutputStream outStream;

	public static final String APP_EXCEPTION = "cat: ";
	public static final String FAIL_MSG = "Should not throw exception";

	@Before
	public void setUp() throws Exception {
		catApp = new CatApplication();
		args = null;

		try {
			tempFile1 = new File(tempFilePath1);
			tempFile1.createNewFile();
			tempFile2 = new File(tempFilePath2);
			tempFile2.createNewFile();
		} catch (SecurityException se) {
			fail("Cannot create temporary file to test");
		}

		outStream = new ByteArrayOutputStream();

		// write to temp file to test cat reading of one file
		try {
			FileOutputStream fos = new FileOutputStream(new File(tempFilePath1));
			BufferedWriter buffWriter = new BufferedWriter(
					new OutputStreamWriter(fos));
			buffWriter.write("aaa dddd ");
			buffWriter.newLine();
			buffWriter.write("abcd e");
			buffWriter.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// write to temp file to test cat reading of two files
		try {
			FileOutputStream fos = new FileOutputStream(new File(tempFilePath2));
			BufferedWriter buffWriter = new BufferedWriter(
					new OutputStreamWriter(fos));
			buffWriter.write("1");
			buffWriter.newLine();
			buffWriter.write("2");
			buffWriter.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		catApp = null;
		args = null;
		tempFile1.delete();
		tempFile2.delete();
	}

	@Test
	public void testNullInputStreamException() {
		try {
			catApp.run(args, null, System.out);
			fail(FAIL_MSG);
		} catch (Exception e) {
			String exceptionMsg = APP_EXCEPTION + "Null Pointer Exception";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileNotExistException() {

		try {
			catApp.checkIfFileIsReadable(Paths.get("fileNotExist"));
			fail(FAIL_MSG);
		} catch (CatException e) {
			String exceptionMsg = APP_EXCEPTION + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileIsDirException() {
		File fileDir = new File("tempCatDir");
		fileDir.mkdir();

		try {
			catApp.checkIfFileIsReadable(Paths.get("tempCatDir"));
			fail(FAIL_MSG);
		} catch (CatException e) {
			String exceptionMsg = APP_EXCEPTION + "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}

		fileDir.delete();
	}

	@Test
	public void testReadFromStdin() throws CatException, IOException {

		ByteArrayInputStream inputStream = new ByteArrayInputStream(
				"test".getBytes());

		try {
			catApp.run(args, inputStream, outStream);
			String expected = "test";
			assertEquals(expected, outStream.toString());
		} catch (CatException e) {
			fail(FAIL_MSG);
		}
	}

	@Test
	public void testReadFromFileAndWriteToStdOut() throws CatException,
			IOException {

		args = new String[] { tempFilePath1 };
		StringBuilder expected = new StringBuilder();
		expected.append("aaa dddd ");
		expected.append(System.lineSeparator());
		expected.append("abcd e");

		try {
			catApp.run(args, null, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (CatException e) {
			fail(FAIL_MSG);
		}

	}

	// yet to create two files and concatenate them
	@Test
	public void testCatTwoFiles() throws CatException, IOException {

		args = new String[] { tempFilePath1, tempFilePath2 };
		StringBuilder expected = new StringBuilder();
		expected.append("aaa dddd ");
		expected.append(System.lineSeparator());
		expected.append("abcd e");
		expected.append("1");
		expected.append(System.lineSeparator());
		expected.append("2");

		try {
			catApp.run(args, null, outStream);
			assertEquals(expected.toString(), outStream.toString());
		} catch (CatException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testFileNotReadable() throws CatException, IOException {

		String testFileData = "1" + System.lineSeparator() + "2";

		// Verify that file is written correctly and CAT works
		args = new String[] { tempFilePath2 };
		catApp.run(args, null, outStream);

		assertEquals(testFileData, outStream.toString());

		// Make file not readable
		tempFile2.setReadable(false); // Unix
		if (OSCheck.isWindows()) {
			WindowsPermission.setReadable(tempFile2, false); // Windows
		}

		// Try to CAT file again
		args = new String[] { tempFilePath2 };
		try {
			catApp.run(args, null, outStream);
		} catch (CatException e) {
			assertEquals(APP_EXCEPTION +"Could not read file", e.getLocalizedMessage());
		}
	}
}
