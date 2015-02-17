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

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

public class ShellImplTest {
	private ShellImpl shell;
	private String inputLine;
	private OutputStream outputStream;
	private Vector<String> cmdVector;
	private static String testStr = "Testing Stream";
	private static String testFileName = "testShell.txt";
	private static String testFolderName = "testShellFolder";
	private static String validCmdNoExp = "Not supposed to throw exception for valid command.";
	private static String originalFilePath = Environment.currentDirectory;

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
		cmdVector = new Vector<String>();
		outputStream = System.out;
	}

	@After
	public void tearDown() throws Exception {
		removeTestFile(testFileName);
		removeTestFolder(testFolderName);
	}

	public void createTestFile(String fileName) throws IOException {
		Files.write(Paths.get(fileName), testStr.getBytes());
	}

	public void removeTestFile(String fileName) throws IOException {
		File file = new File(fileName);
		file.setWritable(true);
		file.delete();
	}

	public void createTestFolder(String folderName) throws IOException {
		new File(folderName).mkdir();
	}

	public void removeTestFolder(String folderName) throws IOException {
		File file = new File(folderName + "\\\\");

		String[] entries = file.list();
		if (entries != null) {
			for (String s : entries) {
				File currentFile = new File(file.getPath(), s);
				currentFile.delete();
			}
		}

		file.delete();
		Environment.currentDirectory = originalFilePath;
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

	// testing parseAndEvaluate

	@Test
	public void testCat() {
		try {
			createTestFile(testFileName);
			String readLine = "cat " + testFileName;
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFile(testFileName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testCd() {
		try {
			createTestFolder(testFolderName);
			String readLine = "cd " + testFolderName;
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFolder(testFolderName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testEcho() {
		String readLine = "echo " + testStr;
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}
	
	@Test
	public void testEchoWithOutputDir() {
		String readLine = "echo " + testStr + " > " +testFileName;
		try {
			System.out.println(readLine);
			createTestFile(testFileName);
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFile(testFileName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testHead() {
		try {
			createTestFile(testFileName);
			String readLine = "head -n 1" + testFileName;
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFile(testFileName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}
	
	@Test
	public void testHeadWithInputDir() {
		try {
			createTestFile(testFileName);
			String readLine = "head -n 1 < " + testFileName;
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFile(testFileName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testLs() {
		String readLine = "ls";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testPwd() {
		String readLine = "pwd";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testWc() {
		try {
			createTestFile(testFileName);
			String readLine = "wc " + testFileName;
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFile(testFileName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test
	public void testSemicolon() {
		try {
			createTestFile(testFileName);
			createTestFolder(testFolderName);
			String readLine = "wc " + testFileName + ";" + "pwd" + ";" + "cd "
					+ testFolderName + ";";
			shell.parseAndEvaluate(readLine, outputStream);
			removeTestFile(testFileName);
			removeTestFolder(testFolderName);
		} catch (Exception e) {
			fail(validCmdNoExp);
		}
	}

	@Test(expected = ShellException.class)
	public void testInvalidSemicolon() throws IOException, AbstractApplicationException, ShellException {
		createTestFile(testFileName);
		createTestFolder(testFolderName);
		String readLine = "wc " + testFileName + ";" + "pwd" + ";;" + "cd "
				+ testFolderName + ";";
		shell.parseAndEvaluate(readLine, outputStream);
		removeTestFile(testFileName);
		removeTestFolder(testFolderName);
	}

	@Test(expected = ShellException.class)
	public void testInvalidApp() throws IOException,
			AbstractApplicationException, ShellException {
		createTestFile(testFileName);
		String readLine = "notAnApp";
		shell.parseAndEvaluate(readLine, outputStream);
		removeTestFile(testFileName);
	}

	// Testing parsing (extractArgs)
	@Test
	public void testExtractArgsDash() throws ShellException,
			AbstractApplicationException {
		inputLine = "-token1 -token2 -token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "-token1", "-token2", "-token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testSplitStringDash() throws ShellException, AbstractApplicationException {
		inputLine = "-token1 -token2 -token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "-token1", "-token2",
				"-token3", "", "" });
	}

	@Test
	public void testExtractArgsUnquoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "dir/token-2.txt", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testSplitStringUnquoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "", "" });
	}

	@Test
	public void testExtractArgsSingleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "'token1' 'token2' 'token3'";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "token2", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testSplitStringSingleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "\'token1\' \'dir/token-2.txt\' \'token3 token3\'";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3 token3", "", "" });
	}

	@Test
	public void testExtractArgsDoubleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "\"token1\" \"token2\" \"token3\"";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "token2", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testSplitStringDoubleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "\"token1\" \"dir/token-2.txt\" \"token3 token3\"";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3 token3", "", "" });
	}

	@Test
	public void testExtractArgsbackQuotesInDQ() throws ShellException,
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
	public void testSplitStringBackQuotesinDQ() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"token2 `token2.2` token2.3\" token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1",
				"token2 `token2.2` token2.3", "token3", "", "" });
	}

	// Testing for extraction input & output redir streams
	@Test
	public void testExtractInputRedirTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "< inputDir/file.txt";
		shell.extractInputRedir(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "inputDir/file.txt" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testSplitStringInputRedir() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3 < inputDir";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "inputDir", "" });
	}

	@Test
	public void testExtractOutputRedir() throws ShellException,
			AbstractApplicationException {
		inputLine = "> outputDir/file.txt";
		shell.extractOutputRedir(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "outputDir/file.txt" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testSplitStringOutputRedir() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3 > outputDir";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "", "outputDir" });
	}
	
	// Testing for opening of input & output redir streams
	@Test
	public void testOpenInputRedir() throws ShellException, IOException {
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
	public void testOpenInputRedirFail() throws ShellException, IOException {
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
	public void testOpenOutputRedir() throws ShellException, IOException {
		OutputStream myOutputStream;
		try {
			myOutputStream = shell.openOutputRedir(testFileName);
			writeToStream(myOutputStream);
			myOutputStream.close();
		} catch (IOException le) {
			fail("Not supposed to have exception for creating and writing to test file.");
		}
		try {
			String testFileStr = fileToString(testFileName);
			assertEquals(testFileStr, testStr);
			removeTestFile(testFileName);
		} catch (IOException e) {
			fail("Not supposed to have exception for file that exists.");
		}
	}

	@Test(expected = ShellException.class)
	public void testOpenOutputRedirFail() throws ShellException, IOException {
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

	//testing multiple args together
	@Test
	public void testSplitStringMultipleTypesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"dir/token-2.txt\" \'token3\' -token4 \"token5 `token5.2`\" < inputDir.txt > dir/outputDir.txt";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[] { "token1", "dir/token-2.txt",
				"token3", "-token4", "token5 `token5.2`", "inputDir.txt",
				"dir/outputDir.txt" });
	}

	@Test
	public void testExtractArgsMultipleTypesTest() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"dir/token-2.txt\" \'token3\' -token4 \"token5 `token5.2`\"";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
		String[] resultStrArr = { "token1", "dir/token-2.txt",
				"token3", "-token4", "token5 `token5.2`" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}
	
	// Testing splitString for throwing of exceptions
	@Test(expected = ShellException.class)
	public void testSplitStringInvalidDoubleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid double quotes\"\" token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsgInvalidDoubleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid double quotes\"\" token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}

	@Test(expected = ShellException.class)
	public void testSplitStringInvalidSingleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \'invalid single quotes\'\' token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidSingleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \'invalid single quotes\'\' token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}

	@Test(expected = ShellException.class)
	public void testSplitStringInvalidQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid token' token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid token' token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}

	//testing splitString for invalid symbols
	// string containing newlines, semicolons “;”, “|”, “<” and “>”.
	@Test(expected = ShellException.class)
	public void testSplitStringInvalidSemicolon() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2; token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidSemicolon() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2; token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}

	@Test(expected = ShellException.class)
	public void testSplitStringinvalidDivider() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2|token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsinvalidDivider() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2|token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}
	

	@Test(expected = ShellException.class)
	public void testSplitStringInvalidLeftAngleBracket() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2< token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidLeftAngleBracket() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2< token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}


	@Test(expected = ShellException.class)
	public void testSplitStringInvalidRightAngleBracket() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2> token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidRightAngleBracket() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2> token3";
		shell.extractArgs(" " + inputLine + " ", cmdVector, 0);
	}

	//testing processBQ (processing of backquotes for cmd sub)
	@Test
	public void testProcessBQ()
	{
		String[] argsArray = {"echo","this is space `echo \"nbsp\"`","",""};
		try {
			argsArray = shell.processBQ(argsArray);
		} catch (Exception e) {
			fail(validCmdNoExp);
		} 
		assertArrayEquals(argsArray, new String[] { "echo", "this is space nbsp","","" });
	}
	
	//testing processBQ for invalid backquotes placement
	@Test(expected = ShellException.class)
	public void testProcessInvalidBQ() throws AbstractApplicationException, ShellException
	{
		String[] argsArray = {"echo","this is space `echo \"nbsp`","",""};
		argsArray = shell.processBQ(argsArray);
	}
}