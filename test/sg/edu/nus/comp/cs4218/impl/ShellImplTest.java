package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

public class ShellImplTest {
	private static ShellImpl shell;
	private static OutputStream outputStream;
	final static String TEST_STR = "Testing Stream";
	final static String TEST_FILE_NAME = "testShell.txt";
	final static String TEST_FILE_NAME2 = "testShell2.txt";
	final static String TEST_FOLDER_NAME = "testShellFolder";
	final static String VALID_CMD_NO_EXP = "Not supposed to throw exception for valid command.";
	final static String VALID_FILE_NO_EXP = "Not supposed to have exception for valid file.";
	final static String READONLY_EXP = "Supposed to have exception opening outputstream to read-only file.";
	static String originalFilePath;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		shell = new ShellImpl();
		outputStream = System.out;
		createTestFile(TEST_FILE_NAME);
		createTestFolder(TEST_FOLDER_NAME);
		originalFilePath = Environment.currentDirectory;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		removeTestFile(TEST_FILE_NAME);
		removeTestFolder(TEST_FOLDER_NAME);
	}

	public static void createTestFile(String fileName) throws IOException {
		Files.write(Paths.get(fileName), TEST_STR.getBytes());
	}

	public static void removeTestFile(String fileName) throws IOException {
		File file = new File(fileName);
		file.setWritable(true);
		file.delete();
	}

	public static void createTestFolder(String folderName) throws IOException {
		new File(folderName).mkdir();
	}

	public static void removeTestFolder(String folderName) throws IOException {
		File file = new File(folderName);

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
		myoutputStream.write(TEST_STR.getBytes());
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
	public void testPECat() {
		try {
			String readLine = "cat " + TEST_FILE_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPECd() {
		try {
			String readLine = "cd " + TEST_FOLDER_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
		Environment.currentDirectory = originalFilePath;
	}

	@Test
	public void testPEEcho() {
		String readLine = "echo " + TEST_STR;
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithDoubleQuotes() {
		String readLine = "echo \"" + TEST_STR + "\"";
		try {
			System.out.println(readLine);
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithSemiColonInDoubleQuotes() {
		String readLine = "echo \"" + TEST_STR + "; " + TEST_STR + "\";";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithDividerInDoubleQuotes() {
		String readLine = "echo \"" + TEST_STR + "| " + TEST_STR + "\";";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithSingleQuotes() {
		String readLine = "echo '" + TEST_STR + "'";
		try {
			System.out.println(readLine);
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithSemiColonInSingleQuotes() {
		String readLine = "echo '" + TEST_STR + "; " + TEST_STR + "';";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithDividerInSingleQuotes() {
		String readLine = "echo '" + TEST_STR + "| " + TEST_STR + "';";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithOutputDir() {
		String readLine = "echo " + TEST_STR + " > " + TEST_FILE_NAME;
		try {
			System.out.println(readLine);
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithBackQuotes() {
		String readLine = "echo `echo " + TEST_STR + "`";
		try {
			System.out.println(readLine);
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithDoubleQuotesInBackQuotes() {
		String readLine = "echo `echo \"" + TEST_STR + "\"`";
		try {
			System.out.println(readLine);
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEEchoWithSemicolonInBackQuotes() {
		String readLine = "echo `echo " + TEST_STR + ";ls;`";
		try {
			System.out.println(readLine);
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEFind() {
		String readLine = "find -name *";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}

	}

	@Test
	public void testPEHead() {
		try {
			String readLine = "head -n 1 " + TEST_FILE_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testHeadWithInputDir() {
		try {
			String readLine = "head -n 1 < " + TEST_FILE_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPETail() {
		try {
			String readLine = "tail -n 1 " + TEST_FILE_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testTailWithInputDir() {
		try {
			String readLine = "head -n 1 < " + TEST_FILE_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPELs() {
		String readLine = "ls";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testPEPwd() {
		String readLine = "pwd";
		try {
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void tesPEtWc() {
		try {
			String readLine = "wc " + TEST_FILE_NAME;
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testSemicolon() {
		try {
			String readLine = "wc " + TEST_FILE_NAME + ";" + "pwd" + ";"
					+ "cd " + TEST_FOLDER_NAME + ";";
			shell.parseAndEvaluate(readLine, outputStream);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
		Environment.currentDirectory = originalFilePath;
	}

	@Test(expected = ShellException.class)
	public void testInvalidSemicolons() throws IOException,
			AbstractApplicationException, ShellException {
		String readLine = "wc " + TEST_FILE_NAME + ";" + "pwd" + ";;" + "cd "
				+ TEST_FOLDER_NAME + ";";
		shell.parseAndEvaluate(readLine, outputStream);
	}

	@Test(expected = ShellException.class)
	public void testInvalidApp() throws IOException,
			AbstractApplicationException, ShellException {

		String readLine = "notAnApp";
		shell.parseAndEvaluate(readLine, outputStream);

	}

	@Test(expected = ShellException.class)
	public void testExtraInputDir() throws IOException,
			AbstractApplicationException, ShellException {
		String readLine = "cat < " + TEST_FILE_NAME + " < " + TEST_FILE_NAME2;
		shell.parseAndEvaluate(readLine, outputStream);
	}

	@Test(expected = ShellException.class)
	public void testExtraOutputDir() throws IOException,
			AbstractApplicationException, ShellException {
		String readLine = "cat > " + TEST_FILE_NAME + " > " + TEST_FILE_NAME2;
		shell.parseAndEvaluate(readLine, outputStream);
	}

	@Test(expected = ShellException.class)
	public void testSameInputOutputDir() throws IOException,
			AbstractApplicationException, ShellException {
		String readLine = "cat < " + TEST_FILE_NAME + " > " + TEST_FILE_NAME;
		shell.parseAndEvaluate(readLine, outputStream);
	}
	
	// Testing for opening of input & output redir streams
	@Test
	public void testOpenInputRedir() {
		InputStream myInputStream;
		try {
			myInputStream = ShellImpl.openInputRedir(TEST_FILE_NAME);
			Scanner scanner = new Scanner(myInputStream,
					StandardCharsets.UTF_8.name());
			String intputSreamStr = scanner.useDelimiter("\\A").next();
			scanner.close();
			assertEquals(intputSreamStr, TEST_STR);
		} catch (ShellException e) {
			fail(VALID_FILE_NO_EXP);
		}
	}

	@Test(expected = ShellException.class)
	public void testOpenInputRedirFail() throws ShellException, IOException {
		// createTestFile(testFileName);
		InputStream myInputStream;

		myInputStream = ShellImpl.openInputRedir("invalid" + TEST_FILE_NAME);
		Scanner scanner = new Scanner(myInputStream,
				StandardCharsets.UTF_8.name());
		String intputSreamStr = scanner.useDelimiter("\\A").next();
		scanner.close();
		assertEquals(intputSreamStr, TEST_STR);
	}

	@Test
	public void testOpenOutputRedir() {
		OutputStream myOutputStream;
		try {
			myOutputStream = ShellImpl.openOutputRedir(TEST_FILE_NAME);
			writeToStream(myOutputStream);
			myOutputStream.close();
		} catch (IOException | ShellException le) {
			fail(VALID_FILE_NO_EXP);
		}
		try {
			String testFileStr = fileToString(TEST_FILE_NAME);
			assertEquals(testFileStr, TEST_STR);
		} catch (IOException e) {
			fail(VALID_FILE_NO_EXP);
		}
	}

	@Test(expected = ShellException.class)
	public void testOpenOutputRedirFail() throws ShellException {
		File file = new File(TEST_FILE_NAME);
		file.setReadOnly();
		Boolean exceptionThrown = false;
		OutputStream myoutputStream;
		String errorMsg = "";
		try {
			myoutputStream = ShellImpl.openOutputRedir(TEST_FILE_NAME);
			myoutputStream.write(TEST_STR.getBytes());
			myoutputStream.flush();
			myoutputStream.close();
			myoutputStream = null;
		} catch (ShellException | IOException e) {
			errorMsg = e.getMessage();
			exceptionThrown = true;
		}

		file.setWritable(true);

		if (exceptionThrown) {
			throw new ShellException(errorMsg);
		} else {
			fail(READONLY_EXP);
		}
	}

	// testing processBQ (processing of backquotes for cmd sub)
	@Test
	public void testProcessBQ() {
		String[] argsArray = { "echo", "this is space `echo \"nbsp\"`", "", "" };
		try {
			argsArray = ShellImpl.processBQ(argsArray);
		} catch (Exception e) {
			fail(VALID_CMD_NO_EXP);
		}
		assertArrayEquals(argsArray, new String[] { "echo",
				"this is space nbsp", "", "" });
	}

	// testing processBQ for invalid backquotes placement
	@Test(expected = ShellException.class)
	public void testProcessInvalidBQ() throws AbstractApplicationException,
			ShellException {
		String[] argsArray = { "echo",
				"this is wrong because `echo \"missing2ndDoubleQuote`", "", "" };
		argsArray = ShellImpl.processBQ(argsArray);
	}
}