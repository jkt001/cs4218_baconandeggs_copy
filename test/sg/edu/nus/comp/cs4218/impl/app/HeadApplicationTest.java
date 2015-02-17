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

import sg.edu.nus.comp.cs4218.exception.HeadException;
import sg.edu.nus.comp.cs4218.impl.app.HeadApplication;

public class HeadApplicationTest {
	private HeadApplication headApp;
	private String[] args;
	private File file;
	static String tempFilePath = "testHead.txt";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		headApp = new HeadApplication();
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
		headApp = null;
		args = null;
		file.delete();
	}

	@Test
	public void testNullInputStreamException() {
		try {
			headApp.run(args, null, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (Exception e) {
			String exceptionMsg = "head: "
					+ "Null Pointer Exception";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileNotExistException() {
		args = new String[1];
		args[0] = "fileNotExist";
		try {
			headApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = "head: " + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileIsDirException() {
		args = new String[1];
		args[0] = "tempHeadDir";

		File fileDir = new File("tempHeadDir");
		fileDir.mkdir();

		try {
			headApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = "head: " + "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}

		fileDir.delete();
	}

	@Test
	public void testInvalidHeadCommandException() {
		args = new String[] { "-n", "2" };

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			headApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = "head: " + "Invalid Head Command";
			assertEquals(exceptionMsg, e.getMessage());
		}

	}

	@Test
	public void testNotANumberException() {
		args = new String[] { "-n", "oooo", tempFilePath };

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			headApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = "head: " + "Invalid command, not a number.";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}
	@Test
	public void testNegativeNumberException() {
		args = new String[] { "-n", "-1", tempFilePath };

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			headApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = "head: " + "Number of lines cannot be negative";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}
	@Test
	public void testReadFromStdin() throws HeadException, IOException {
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(
				"test".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		try {
			headApp.run(args, myInputStream, myOutputStream);
			String expected = "test";
			assertEquals(expected, myOutputStream.toString());
		} catch (HeadException e) {
			fail("Should not throw exception");
		}
	}

	@Test
	public void testReadEmptyFile() throws HeadException,
			IOException {
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		args = new String[] {"-n","10", tempFilePath };

		try {
			headApp.run(args, null, myOutputStream);
			assertEquals("", myOutputStream.toString());
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadZeroLines() throws HeadException,
			IOException {
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

		args = new String[] { "-n", "0",tempFilePath };
		try {
			headApp.run(args, null, myOutputStream);
			assertEquals("", myOutputStream.toString());
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}
	
	@Test
	public void testReadFileLessThanTenLines() throws HeadException,
			IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		// write to temp file to test head reading of file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			for (int intCount = 0; intCount < 4; intCount++) {
				bw.write("aaa dddd ");
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
			expected.append("aaa dddd ");
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		try {
			headApp.run(args, null, myOutputStream);
			assertEquals(expected.toString(), myOutputStream.toString());
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileMoreThanLinesRequired() throws HeadException,
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
				bw.write("aaa dddd ");
				bw.newLine();
			}
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		StringBuilder expected = new StringBuilder();
		for (int i = 0; i < 15; i++) {
			expected.append("aaa dddd ");
			expected.append(System.lineSeparator());
		}

		try {
			headApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(expected.toString(), testStr);
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileLessThanLinesRequired() throws HeadException,
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
			headApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(expected.toString(), testStr);
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileSameAsLineRequired() throws HeadException, IOException {
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
			headApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(System.lineSeparator(), testStr);
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}

	// not working currently due to the set readable
	@Test
	public void testFileNotReadable() throws HeadException, IOException {
		try {

			File file = new File("tempCat.txt");
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
			if (file.exists()) {
				System.out.println("Is Execute allow : " + file.canExecute());
				System.out.println("Is Write allow : " + file.canWrite());
				System.out.println("Is Read allow : " + file.canRead());
			}

			file.setExecutable(false);
			file.setReadable(false);
			file.setWritable(false);

			System.out.println("Is Execute allow : " + file.canExecute());
			System.out.println("Is Write allow : " + file.canWrite());
			System.out.println("Is Read allow : " + file.canRead());

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
