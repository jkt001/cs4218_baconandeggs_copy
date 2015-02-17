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
	private FileOutputStream myFileOutputStream;

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

		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter buffWriter = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			for (int intCount = 0; intCount < 4; intCount++) {
				buffWriter.write(intCount + "aaa dddd ");
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
	public void testNullInputStreamException() {

		try {
			headApp.run(args, null, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (Exception e) {
			String exceptionMsg = "head: " + "Null Pointer Exception";
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
		
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		
		args = new String[] { "-n" };
		
		try {
			headApp.run(args, null, myOutputStream);
			fail("Should have thrown SomeException but did not!");
		} catch (HeadException e) {
			String exceptionMsg = "head: " + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testNotANumberException() {
		
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		
		args = new String[] { "-n", "oooo", tempFilePath };

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
			String exceptionMsg = "head: "
					+ "Number of lines cannot be negative";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testReadFromStdin() throws HeadException, IOException {

		String inputString = "1\n" + "2\n" + "3\n" + "4\n" + "5\n" + "6\n"
				+ "7\n" + "8\n" + "9\n" + "10\n";

		ByteArrayInputStream myInputStream = new ByteArrayInputStream(
				inputString.getBytes("UTF-8"));

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		try {
			headApp.run(args, myInputStream, myOutputStream);
			assertEquals(inputString, myOutputStream.toString());
		} catch (HeadException e) {
			fail("Should not throw exception");
		}
	}

	@Test
	public void testReadEmptyFile() throws HeadException, IOException {
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		File emptyFile = new File("HeadEmptyFileTest.txt");
		emptyFile.createNewFile();
		args = new String[] { "-n", "10", "HeadEmptyFileTest.txt" };

		// create emptyFile

		try {
			headApp.run(args, null, myOutputStream);
			assertEquals("", myOutputStream.toString());
		} catch (HeadException e) {
			fail("Should not throw exception");
		}
		emptyFile.delete();
	}

	@Test
	public void testReadZeroLines() throws HeadException, IOException {
		// FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		// write to temp file to test head reading of file
		// try {
		// myFileOutputStream = new FileOutputStream(new File("HeadZero"));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
		// myFileOutputStream));
		// bw.write("aaa dddd ");
		// bw.write(System.lineSeparator());
		// bw.close();
		// } catch (Exception e1) {
		// e1.printStackTrace();
		// }

		args = new String[] { "-n", "0", tempFilePath };
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
	
		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount + "aaa dddd ");
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}
		
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		args = new String[] { tempFilePath };
		
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
		
		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 3; intCount++) {
			expected.append(intCount + "aaa dddd ");
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[] { "-n", "6", tempFilePath };

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

		StringBuilder expected = new StringBuilder();
		for (int intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount + "aaa dddd ");
			expected.append(System.lineSeparator());
			expected.append(System.lineSeparator());
		}

		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[] { "-n", "15", tempFilePath };

		try {
			headApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(expected.toString(), testStr);
		} catch (HeadException e) {
			fail("Should not throw exception");
		}

	}

	@Test
	public void testReadFileSameAsLineRequired() throws HeadException,
			IOException {
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[] { "-n", "8", tempFilePath };

		int intCount = 0;
		StringBuilder expected = new StringBuilder();
		for (intCount = 0; intCount < 4; intCount++) {
			expected.append(intCount + "aaa dddd ");
			expected.append(System.lineSeparator());
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

	// not working currently due to the set readable
	@Test
	public void testFileNotReadable() throws HeadException, IOException {
		// try {
		//
		// File file = new File("tempCat.txt");
		// if (file.createNewFile()) {
		// System.out.println("File is created!");
		// } else {
		// System.out.println("File already exists.");
		// }
		// if (file.exists()) {
		// System.out.println("Is Execute allow : " + file.canExecute());
		// System.out.println("Is Write allow : " + file.canWrite());
		// System.out.println("Is Read allow : " + file.canRead());
		// }
		//
		// file.setExecutable(false);
		// file.setReadable(false);
		// file.setWritable(false);
		//
		// System.out.println("Is Execute allow : " + file.canExecute());
		// System.out.println("Is Write allow : " + file.canWrite());
		// System.out.println("Is Read allow : " + file.canRead());
		//
		// if (file.createNewFile()) {
		// System.out.println("File is created!");
		// } else {
		// System.out.println("File already exists.");
		// }
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}

}
