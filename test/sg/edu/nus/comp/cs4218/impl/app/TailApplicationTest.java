package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.TailException;
import sg.edu.nus.comp.cs4218.impl.app.TailApplication;

public class TailApplicationTest {
	private TailApplication tailApp;
	private String[] args;
	private File file;
	static String tempFilePath = "testTail.txt";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tailApp = new TailApplication();
		args = null;

		try {
			file = new File(tempFilePath);
			file.createNewFile();
		} catch (SecurityException se) {
			fail("Cannot create temporary file to test");
		}

	}

	@After
	public void tearDown() throws Exception {
		tailApp = null;
		args = null;
		file.delete();
	}

	@Test
	public void testNullInputStreamException() {
		try {
			tailApp.run(args, null, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (Exception e) {
			String exceptionMsg = "tail: " + "Null Pointer Exception";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileNotExistException() {
		args = new String[1];
		args[0] = "fileNotExist";
		try {
			tailApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (TailException e) {
			String exceptionMsg = "tail: " + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileIsDirException() {
		args = new String[1];
		args[0] = "tempTailDir";

		File fileDir = new File("tempTailDir");
		fileDir.mkdir();

		try {
			tailApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (TailException e) {
			String exceptionMsg = "tail: " + "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}

		fileDir.delete();
	}

	@Test
	public void testInvalidTailCommandException() {
		args = new String[] { "-n", "2" };

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			tailApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (TailException e) {
			String exceptionMsg = "tail: " + "Invalid Tail Command";
			assertEquals(exceptionMsg, e.getMessage());
		}

	}

	@Test
	public void testNotANumberException() {
		args = new String[] { "-n", "oooo", tempFilePath };

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			tailApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (TailException e) {
			String exceptionMsg = "tail: " + "Invalid command, not a number.";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testNegativeNumberException() {
		args = new String[] { "-n", "-1", tempFilePath };

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			tailApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (TailException e) {
			String exceptionMsg = "tail: "
					+ "Number of lines cannot be negative";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testReadFromStdin() throws TailException, IOException {
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(
				"test".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		try {
			tailApp.run(args, myInputStream, myOutputStream);
			String expected = "test";
			assertEquals(expected, myOutputStream.toString());
		} catch (TailException e) {
			fail("Should not throw exception");
		}
	}

	@Test
	public void testReadEmptyFile() throws TailException, IOException {
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		args = new String[] { "-n", "10", tempFilePath };

		try {
			tailApp.run(args, null, myOutputStream);
			assertEquals("", myOutputStream.toString());
		} catch (TailException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testZeroLines() throws TailException, IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		// write to temp file to test head reading of file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			bw.write("aaa dddd ");
			bw.write(System.lineSeparator());
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		args = new String[] { "-n", "0", tempFilePath };
		try {
			tailApp.run(args, null, myOutputStream);
			assertEquals("", myOutputStream.toString());
		} catch (TailException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileLessThanTenLines() throws TailException,
			IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		// write to temp file to test head reading of file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			for (int intCount = 0; intCount < 4; intCount++) {
				bw.write(intCount +"aaa dddd ");
				bw.write(System.lineSeparator());
				bw.write(System.lineSeparator());
			}
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		args = new String[] { tempFilePath };
		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount + "aaa dddd ");
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		try {
			tailApp.run(args, null, myOutputStream);
			assertEquals(expected.toString(), myOutputStream.toString());
		} catch (TailException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileMoreThanLinesRequired() throws TailException,
			IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[] { "-n", "15", tempFilePath };

		// write to temp file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			for (int i = 0; i < 20; i++) {
				bw.write(i+"aaa dddd ");
				bw.newLine();
			}
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		StringBuilder expected = new StringBuilder();
		for (int i = 5; i < 20; i++) {
			expected.append(i+ "aaa dddd ");
			expected.append(System.lineSeparator());
		}

		try {
			tailApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			System.out.println(testStr);
			assertEquals(expected.toString(), testStr);
		} catch (TailException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileLessThanLinesRequired() throws TailException,
			IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[] { "-n", "15", tempFilePath };

		// write to temp file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			for (int i = 0; i < 10; i++) {
				bw.write("aaa dddd ");
				bw.newLine();
			}
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		StringBuilder expected = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			expected.append("aaa dddd ");
			expected.append(System.lineSeparator());
		}

		try {
			tailApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(expected.toString(), testStr);
		} catch (TailException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileSameAsLineRequired() throws TailException, IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[] { "-n", "1", tempFilePath };

		// write to temp file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			bw.newLine();
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			tailApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(System.lineSeparator(), testStr);
		} catch (TailException e) {
			fail("Should not throw exception");
		}

	}

	// not working currently due to the set readable
	@Test
	public void testFileNotReadable() throws TailException, IOException {
		
		
	}

}
