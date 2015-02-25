package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.FolderUtility;
import sg.edu.nus.comp.cs4218.FolderUtility.*;
import sg.edu.nus.comp.cs4218.exception.FindException;

public class FindApplicationTest {

	private static final String TEST_FOLDER = "testFindApplicationFolder";

	FindApplication app;

	private ByteArrayInputStream inputStream;

	private ByteArrayOutputStream outputStream;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Create test folder to "find" stuff in
		
		FolderUtility.generate(TEST_FOLDER, 
				new TestFolder("Folder",
						new TestFile("a.txt", ""),
						new TestFile("b stuff.txt", ""),
						new TestFile("c.txt", "")
				),
				new TestFolder("Folder2",
						new TestFile("d.txt", ""),
						new TestFile("e stuff.txt", ""),
						new TestFile("f.txt", ""),
						new TestFolder("Folder2a",
								new TestFile("j.txt", ""),
								new TestFile("k stuff.txt", ""),
								new TestFile("l.txt", "")
						)
				),
				new TestFolder("Folder 3",
						new TestFile("g.txt", ""),
						new TestFile("h.txt", ""),
						new TestFile("i.txt", "")
				)
			);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Delete test folder
		FolderUtility.delete(TEST_FOLDER);
	}

	@Before
	public void setUp() throws Exception {
		app = new FindApplication();

		inputStream = new ByteArrayInputStream("test".getBytes());
		outputStream = new ByteArrayOutputStream();
	}

	// Test null parameters
	@Test(expected = FindException.class)
	public void testNullParams() throws FindException {
		String[] params = null;
		app.run(params, inputStream, outputStream);
	}

	// Test zero parameters
	@Test(expected = FindException.class)
	public void testZeroParams() throws FindException {
		String[] params = {};
		app.run(params, inputStream, outputStream);
	}

	// Test one parameter, but null value
	@Test(expected = FindException.class)
	public void testOneNullParams() throws FindException {
		String[] params = { null };
		app.run(params, inputStream, outputStream);
	}

	// Test two parameters, with null value
	@Test(expected = FindException.class)
	public void testTwoNullParams() throws FindException {
		String[] params = { null, null };
		app.run(params, inputStream, outputStream);
	}

	// Test two parameters, with null value
	@Test(expected = FindException.class)
	public void testTwoNullParamsA() throws FindException {
		String[] params = { "A", null };
		app.run(params, inputStream, outputStream);
	}

	// Test two parameters, with null value
	@Test(expected = FindException.class)
	public void testTwoNullParamsB() throws FindException {
		String[] params = { null, "B" };
		app.run(params, inputStream, outputStream);
	}

	// Test two parameters, but invalid
	@Test(expected = FindException.class)
	public void testTwoNullParamsWithInvalidSecondParameter()
			throws FindException {
		String[] params = { "src", "-name" };
		app.run(params, inputStream, outputStream);
	}

	// Test three null parameters
	@Test(expected = FindException.class)
	public void testThreeNullParams() throws FindException {
		String[] params = { null, null, null };
		app.run(params, inputStream, outputStream);
	}

	// Test four null parameters
	@Test(expected = FindException.class)
	public void testFourNullParams() throws FindException {
		String[] params = { null, null, null, null };
		app.run(params, inputStream, outputStream);
	}

	/*
	 * Test matcher code
	 */

	@Test
	public void testMatchStringWithNoAsterisk() {
		assertTrue(app.matchString("hello1", "hello1"));
	}

	@Test
	public void testMatchStringWithAsteriskAtStart() {
		assertTrue(app.matchString("hello2", "*llo2"));
	}

	@Test
	public void testMatchStringWithAsteriskAtEnd() {
		assertTrue(app.matchString("hello3", "hel*"));
	}

	@Test
	public void testMatchStringWithAsteriskAtMiddle() {
		assertTrue(app.matchString("hello4", "h*o4"));
	}

	@Test
	public void testMatchStringWithAsteriskOnly() {
		assertTrue(app.matchString("hello5", "*"));
	}

	/*
	 * Test find in a valid directory
	 */

	// Match folder name
	@Test
	public void testFindMatchFolderName() throws FindException {
		String[] params = { TEST_FOLDER, "-name", "Folder*" };
		app.run(params, inputStream, outputStream);

		String[] expectedOutput = {
				TEST_FOLDER + File.separator + "Folder",
				TEST_FOLDER + File.separator + "Folder2",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "Folder2a", TEST_FOLDER + File.separator + "Folder 3" };

		checkOutput(expectedOutput, outputStream);
	}

	@Test
	public void testFindMatchFolderNameWithSpace() throws FindException {

		String[] params = { TEST_FOLDER, "-name", "Folder *" };
		app.run(params, inputStream, outputStream);

		String[] expectedOutput = { TEST_FOLDER + File.separator + "Folder 3" };

		checkOutput(expectedOutput, outputStream);
	}

	// Match file name
	@Test
	public void testFindMatchFileName() throws FindException {
		String[] params = { TEST_FOLDER, "-name", "*stuff*" };
		app.run(params, inputStream, outputStream);

		String[] expectedOutput = {
				TEST_FOLDER + File.separator + "Folder" + File.separator + "b stuff.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "e stuff.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "Folder2a" + File.separator + "k stuff.txt" };

		checkOutput(expectedOutput, outputStream);
	}

	// Match file extension
	@Test
	public void testFindMatchFileExtension() throws FindException {
		String[] params = { TEST_FOLDER, "-name", "*.txt" };
		app.run(params, inputStream, outputStream);

		String[] expectedOutput = {
				TEST_FOLDER + File.separator + "Folder" + File.separator + "a.txt",
				TEST_FOLDER + File.separator + "Folder" + File.separator + "b stuff.txt",
				TEST_FOLDER + File.separator + "Folder" + File.separator + "c.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "d.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "e stuff.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "f.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "Folder2a" + File.separator + "j.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "Folder2a" + File.separator + "k stuff.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "Folder2a" + File.separator + "l.txt",
				TEST_FOLDER + File.separator + "Folder 3" + File.separator + "g.txt",
				TEST_FOLDER + File.separator + "Folder 3" + File.separator + "h.txt",
				TEST_FOLDER + File.separator + "Folder 3" + File.separator + "i.txt", };

		checkOutput(expectedOutput, outputStream);
	}

	// Match both
	@Test
	public void testFindMatchFileAndFolderName() throws FindException {
		String[] params = { TEST_FOLDER, "-name", "*a*" };
		app.run(params, inputStream, outputStream);

		String[] expectedOutput = {
				TEST_FOLDER + File.separator + "Folder" + File.separator + "a.txt",
				TEST_FOLDER + File.separator + "Folder2" + File.separator + "Folder2a" };
		if (TEST_FOLDER.contains("a")) {
			expectedOutput = Arrays.copyOf(expectedOutput,
					expectedOutput.length + 1);
			expectedOutput[expectedOutput.length - 1] = TEST_FOLDER;
		}

		checkOutput(expectedOutput, outputStream);
	}

	/*
	 * Test find in an invalid directory
	 */

	@Test(expected = FindException.class)
	public void testFindInInvalidDir() throws FindException {
		String[] params = { "someNonExistentFolder", "-name", "*" };
		app.run(params, inputStream, outputStream);
	}

	/*
	 * Utility methods for the above tests
	 */

	private void checkOutput(String[] expectedOutput,
			ByteArrayOutputStream outputStream) {
		String[] actualOutput = outputStream.toString().split("\\r?\\n");

		// We sort the actual and expected, so that we only check the contents
		// are the same
		// The ordering of the find application is not important
		Arrays.sort(actualOutput);
		Arrays.sort(expectedOutput);
		Assert.assertArrayEquals(expectedOutput, actualOutput);
	}

}
