package sg.edu.nus.comp.cs4218.impl.cmd;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class CallCommandTest {

	private static CallCommand callCmd;
	private String inputLine;
	private Vector<String> cmdVector;
	final static String TEST_STR = "Testing Stream";
	final static String TEST_FILE_NAME = "testShell.txt";
	final static String TEST_FILE_NAME2 = "testShell2.txt";
	final static String TEST_FOLDER_NAME = "testShellFolder";
	final static String VALID_CMD_NO_EXP = "Not supposed to throw exception "
			+ "for valid command.";
	static final String ERROR_REDIR_IN = "Error opening input stream for "
			+ "redirection.";
	static final String ERROR_REDIR_OUT = "Error opening output stream for "
			+ "redirection.";
	static String originalFilePath;

	@Before
	public void setUp() throws Exception {
		callCmd = new CallCommand();
		cmdVector = new Vector<String>();
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

	// Testing parsing (extractArgs)
	@Test
	public void testExtractArgsDash() {
		inputLine = "-token1 -token2 -token3";
		try {
			callCmd.extractArgs(" " + inputLine + " ", cmdVector);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "-token1", "-token2", "-token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testExtractArgsUnquoted() {
		inputLine = "token1 dir/token-2.txt token3";
		try {
			callCmd.extractArgs(" " + inputLine + " ", cmdVector);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "token1", "dir/token-2.txt", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testExtractArgsSingleQuoted() {
		inputLine = "'token1' 'token2' 'token3'";
		try {
			callCmd.extractArgs(" " + inputLine + " ", cmdVector);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "token1", "token2", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testExtractArgsDoubleQuoted() {
		inputLine = "\"token1\" \"token2\" \"token3\"";
		try {
			callCmd.extractArgs(" " + inputLine + " ", cmdVector);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "token1", "token2", "token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testExtractArgsbackQuotesInDQ() {
		inputLine = "token1 \"token2 `token2.2` token2.3\" token3";
		try {
			callCmd.extractArgs(" " + inputLine + " ", cmdVector);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "token1", "token2 `token2.2` token2.3",
				"token3" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	// Testing for extraction input & output redir streams
	@Test
	public void testExtractInputRedirTest() {
		cmdVector.add("");
		cmdVector.add("");
		inputLine = "< inputDir/file.txt";
		try {
			callCmd.extractInputRedir(" " + inputLine + " ", cmdVector, 0);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "inputDir/file.txt", "" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	@Test
	public void testExtractOutputRedir() {
		cmdVector.add("");
		cmdVector.add("");
		inputLine = "> outputDir/file.txt";
		try {
			callCmd.extractOutputRedir(" " + inputLine + " ", cmdVector, 0);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "", "outputDir/file.txt" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	// testing multiple args together
	@Test
	public void testParse() {
		inputLine = "grep \"interesting string\" < " + TEST_FILE_NAME + " > "
				+ TEST_FILE_NAME2;
		callCmd = new CallCommand(inputLine);

		try {
			callCmd.parse();
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluate() {
		inputLine = "cat < " + TEST_FILE_NAME + " > " + TEST_FILE_NAME2;
		callCmd = new CallCommand(inputLine);

		try {
			createTestFile(TEST_FILE_NAME);
			callCmd.parse();
			callCmd.evaluate(System.in, System.out);
			removeTestFile(TEST_FILE_NAME);
			removeTestFile(TEST_FILE_NAME2);
		} catch (IOException | AbstractApplicationException | ShellException e1) {
			fail(VALID_CMD_NO_EXP);
		}

	}

	@Test
	public void testExtractArgsMultipleTypesTest() {
		inputLine = "token1 \"dir/token-2.txt\" \'token3\' -token4 \"token5 `token5.2`\"";
		try {
			callCmd.extractArgs(" " + inputLine + " ", cmdVector);
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		String[] resultStrArr = { "token1", "dir/token-2.txt", "token3",
				"-token4", "token5 `token5.2`" };
		Vector<String> resultStrVect = new Vector<String>(
				Arrays.asList(resultStrArr));
		assertEquals(cmdVector, resultStrVect);
	}

	// testing for invalid quotes
	@Test(expected = ShellException.class)
	public void testExtractArgsgInvalidDoubleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid double quotes\"\" token3";
		callCmd.extractArgs(" " + inputLine + " ", cmdVector);
	}

	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidSingleQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \'invalid single quotes\'\' token3";
		callCmd.extractArgs(" " + inputLine + " ", cmdVector);
	}

	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidQuoted() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 \"invalid token' token3";
		callCmd.extractArgs(" " + inputLine + " ", cmdVector);
	}

	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidSemicolon() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2; token3";
		callCmd.extractArgs(" " + inputLine + " ", cmdVector);
	}

	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidLeftAngleBracket() throws ShellException,
			AbstractApplicationException {
		inputLine = "token1 token2< token3";
		callCmd.extractArgs(" " + inputLine + " ", cmdVector);
	}

	@Test(expected = ShellException.class)
	public void testExtractArgsInvalidRightAngleBracket()
			throws ShellException, AbstractApplicationException {
		inputLine = "token1 token2> token3";
		callCmd.extractArgs(" " + inputLine + " ", cmdVector);
	}

}
