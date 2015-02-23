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

import sg.edu.nus.comp.cs4218.WindowsPermission;
import sg.edu.nus.comp.cs4218.exception.CatException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;

public class CatApplicationTest {
	private CatApplication catApp;
	private String[] args;
	static String tempFilePath = "testCat.txt";
	static String tempFilePath2 = "testCat2.txt";
	private File file;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		catApp = new CatApplication();
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
		catApp = null;
		args = null;
		file.delete();
	}

	@Test
	public void testNullInputStreamException() {
		try {
			catApp.run(args, null, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (Exception e) {
			String exceptionMsg = "cat: " + "Null Pointer Exception";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileNotExistException() {
		args = new String[1];
		args[0] = "fileNotExist";
		try {
			catApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (CatException e) {
			String exceptionMsg = "cat: " + "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}

	@Test
	public void testFileIsDirException() {
		args = new String[1];
		args[0] = "tempCatDir";

		File fileDir = new File("tempCatDir");
		fileDir.mkdir();

		try {
			catApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (CatException e) {
			String exceptionMsg = "cat: " + "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}

		fileDir.delete();
	}

	@Test
	public void testReadFromStdin() throws CatException, IOException {

		ByteArrayInputStream myInputStream = new ByteArrayInputStream(
				"test".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		try {
			catApp.run(args, myInputStream, myOutputStream);
			String expected = "test";
			assertEquals(expected, myOutputStream.toString());
		} catch (CatException e) {
			fail("Should not throw exception");
		}
	}

	@Test
	public void testReadFromFileAndWriteToStdOut() throws CatException,
			IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		// write to temp file to test cat reading of file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			bw.write("aaa dddd ");
			bw.newLine();
			bw.write("abcd e");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		args = new String[] { tempFilePath };
		StringBuilder expected = new StringBuilder();
		expected.append("aaa dddd ");
		expected.append(System.lineSeparator());
		expected.append("abcd e");

		try {
			catApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(expected.toString(), testStr);
		} catch (CatException e) {
			fail("Should not throw exception");
		}

	}

	// yet to create two files and concatenate them
	@Test
	public void testCatTwoFiles() throws CatException, IOException {
		FileOutputStream myFileOutputStream;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		// write to temp file to test cat reading of file
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			bw.write("aaa dddd ");
			bw.newLine();
			bw.write("abcd e");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		args = new String[] { tempFilePath };
		StringBuilder expected = new StringBuilder();
		expected.append("aaa dddd ");
		expected.append(System.lineSeparator());
		expected.append("abcd e");

		try {
			catApp.run(args, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(expected.toString(), testStr);
		} catch (CatException e) {
			fail("Should not throw exception");
		}

	}
	
	@Test
	public void testFileNotReadable() throws CatException, IOException {
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(
				"test".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		
		String testFileData = "aaa dddd " + System.lineSeparator() + "abcd e";
		
		try {

			// Create temporary test file
			File file = new File(tempFilePath2);
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
			
			// Write test data to file
			FileOutputStream myFileOutputStream = new FileOutputStream(file);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					myFileOutputStream));
			bw.write(testFileData);
			bw.close();
			
			// Verify that file is written correctly and CAT works
			args = new String[] {tempFilePath2};
			catApp.run(args, myInputStream, myOutputStream);
			
			assertEquals(testFileData, myOutputStream.toString());

			// Make file not readable
			file.setReadable(false); // Unix
			WindowsPermission.setReadable(file, false); // Windows
			
			// Try to CAT file again			
			args = new String[] {tempFilePath2};
			try {
				catApp.run(args, myInputStream, myOutputStream);
			} catch (CatException e) {
				assertEquals("cat: Could not read file", e.getLocalizedMessage());
			}
			
			file.delete();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
