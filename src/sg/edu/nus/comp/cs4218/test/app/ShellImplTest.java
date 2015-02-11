package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

public class ShellImplTest {
	private ShellImpl shell;
	private String inputLine;
	private String testStr;
	private String testFileName;
	private Vector<String> cmdVector;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		shell = new ShellImpl();
		inputLine = null;
		testStr = "Testing Stream";
		testFileName = "testShell.txt";
		cmdVector = new Vector<String>();
	}

	@After
	public void tearDown() throws Exception {
		removeTestFile(testFileName);
	}

	public void createTestFile(String fileName) throws IOException {
		Files.write(Paths.get(fileName), testStr.getBytes());
	}

	public void removeTestFile(String fileName) throws IOException {
		File file = new File(fileName);
		file.setWritable(true);
		file.delete();
	}

	public void writeToStream(OutputStream myoutputStream) throws IOException {
		myoutputStream.write(testStr.getBytes());
		myoutputStream.flush();
		myoutputStream.close();
	}

	public String fileToString(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		String fileStr = scanner.useDelimiter("\\Z").next();
		scanner.close();

		return fileStr;
	}

	// Testing parsing
	@Test
	public void extractArgsDashTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "-token1 -token2 -token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "-token1", "-token2", "-token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void dashTest() throws ShellException, AbstractApplicationException {
		inputLine = "-token1 -token2 -token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "-token1", "-token2",
				"-token3", "", "" });
	}

	@Test
	public void extractArgsUnquotedTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "dir/token-2.txt", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void unquotedTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "", "" });
	}

	@Test
	public void extractArgsSingleQuotedTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "'token1' 'token2' 'token3'";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "token2", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void singleQuotesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "\'token1\' \'dir/token-2.txt\' \'token3 token3\'";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3 token3", "", "" });
	}

	@Test
	public void extractArgsDoubleQuotedTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "\"token1\" \"token2\" \"token3\"";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "token2", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void doubleQuotesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "\"token1\" \"dir/token-2.txt\" \"token3 token3\"";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3 token3", "", "" });
	}

	@Test
	public void extractArgsbackQuotesInDQTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"token2 `token2.2` token2.3\" token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "token2 `token2.2` token2.3",
				"token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void backQuotesinDQTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"token2 `token2.2` token2.3\" token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1",
				"token2 `token2.2` token2.3", "token3", "", "" });
	}

	// Testing for extraction and opening of input & output streams
	@Test
	public void extractInputRedirTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "<inputDir/file.txt";
		shell.extractInputRedir(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "inputDir/file.txt" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void inputRedirTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3 <inputDir";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "inputDir", "" });
	}

	@Test
	public void openInputRedirTest() throws ShellException, IOException {
		createTestFile(testFileName);

		InputStream myInputStream;
		try {
			myInputStream = shell.openInputRedir(testFileName);
			Scanner scanner = new Scanner(myInputStream,
					StandardCharsets.UTF_8.name());
			String intputSreamStr = scanner.useDelimiter("\\A").next();
			scanner.close();
			assertEquals(intputSreamStr, testStr);
		} catch (ShellException e) {
			fail("Not supposed to have exception for file that exists.");
		}
	}

	@Test(expected = ShellException.class)
	public void openInputRedirFailTest() throws ShellException, IOException {
		// createTestFile(testFileName);
		InputStream myInputStream;

		myInputStream = shell.openInputRedir(testFileName);
		Scanner scanner = new Scanner(myInputStream,
				StandardCharsets.UTF_8.name());
		String intputSreamStr = scanner.useDelimiter("\\A").next();
		scanner.close();
		assertEquals(intputSreamStr, testStr);
	}

	@Test
	public void openOutputRedirTest() throws ShellException, IOException {
		OutputStream myoutputStream;
		try {
			myoutputStream = shell.openOutputRedir(testFileName);
			writeToStream(myoutputStream);
		} catch (IOException le) {
			fail("Not supposed to have exception for creating and writing to test file.");
		}
		try {
			String testFileStr = fileToString(testFileName);
			assertEquals(testFileStr, testStr);
		} catch (IOException e) {
			fail("Not supposed to have exception for file that exists.");
		}
	}

	@Test(expected = ShellException.class)
	public void openOutputRedirFailTest() throws ShellException, IOException {
		createTestFile(testFileName);
		File file = new File(testFileName);
		file.setReadOnly();

		OutputStream myoutputStream;
		myoutputStream = shell.openOutputRedir(testFileName);
		myoutputStream.write(testStr.getBytes());
		myoutputStream.flush();
		myoutputStream.close();
		myoutputStream = null;
	}

	@Test
	public void extractOutputRedirTest() throws ShellException,
			AbstractApplicationException {
		inputLine = ">outputDir/file.txt";
		shell.extractOutputRedir(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "outputDir/file.txt" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void outputRedirTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3 >outputDir";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "", "outputDir" });
	}

	@Test
	public void multipleTypesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"dir/token-2.txt\" \'token3\' -token4 \"token5 `token5.2`\" <inputDir.txt >dir/outputDir.txt";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "-token4", "token5 `token5.2`", "inputDir.txt",
				"dir/outputDir.txt" });
	}

	// Testing for throwing of exceptions
	@Test(expected = ShellException.class)
	public void invalidDoubleQuotesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid double quotes\"\" token3";
		shell.splitString(inputLine);
	}

	@Test(expected = ShellException.class)
	public void invalidSingleQuotesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \'invalid single quotes\'\' token3";
		shell.splitString(inputLine);
	}

	@Test(expected = ShellException.class)
	public void invalidQuotesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid token' token3";
		shell.splitString(inputLine);
	}

	// invalid unquoted: string containing newlines, semicolons “;”, “|”, “<”
	// and “>”.
	@Test(expected = ShellException.class)
	public void invalidSemicolonTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2; token3";
		shell.splitString(inputLine);
	}

	@Test(expected = ShellException.class)
	public void invalidDividerTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2|token3";
		shell.splitString(inputLine);
	}

	@Test(expected = ShellException.class)
	public void invalidLeftAngleBracketTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2< token3";
		shell.splitString(inputLine);
	}

	@Test(expected = ShellException.class)
	public void invalidRightAngleBracketTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2> token3";
		shell.splitString(inputLine);
	}

}
