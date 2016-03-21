package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.impl.app.DateApplication;

/**
 * Integration testing that treats the shell as a black box.
 * Enters a sequence of commands into the shell and inspects 
 * the output. 
 * @author andhieka
 *
 */
public class IntegrationTests {
	
	private Shell shell;
	private ByteArrayOutputStream outputStream;
	private String input2Content;
	private static final String INPUT_FILENAME = "tmp.in";
	private static final String INPUT2_FILENAME = "tmp2.in";
	private static final String INPUT_CONTENT = "My secret password is 123***";
	private static final Integer INPUT2_NUMLINES = 20;
	private static final File INPUT_FILE = Paths.get(Environment.currentDirectory).resolve(INPUT_FILENAME).toFile();
	private static final File INPUT2_FILE = Paths.get(Environment.currentDirectory).resolve(INPUT2_FILENAME).toFile();
	private static final String ENDL = System.lineSeparator();
	private static final File TEMP_DIR = new File("tmp_directory");
	
	private String contentOfFile(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		StringBuilder stringBuilder = new StringBuilder();
		while (reader.ready()) {
			int inputChar = reader.read(); 
			if (inputChar == -1) {
				break;
			}
			stringBuilder.append((char)inputChar);
		}
		return stringBuilder.toString();
	}
	
	private void writeToFile(String content, File file) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(content);
		writer.close();
	}
	
	private String contentOfInput2(Integer lineStart, Integer lineEnd) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = lineStart; i < Math.min(lineEnd, INPUT2_NUMLINES); i++) {
			stringBuilder.append("Line").append(i).append(System.lineSeparator());
		}
		return stringBuilder.toString();
	}
	
	@Before
	public void setUp() throws IOException {
		shell = new ShellImpl();
		outputStream = new ByteArrayOutputStream();
		writeToFile(INPUT_CONTENT, INPUT_FILE);
		input2Content = contentOfInput2(0, INPUT2_NUMLINES);
		writeToFile(input2Content, INPUT2_FILE);
		TEMP_DIR.mkdirs();
		TEMP_DIR.deleteOnExit();
	}
	
	@After
	public void tearDown() {
		shell = null;
		outputStream = null;
		INPUT_FILE.delete();
		INPUT2_FILE.delete();
		TEMP_DIR.delete();
	}
	
	@Test
	public void testSetup() throws IOException {
		assertTrue(INPUT_FILE.exists());
		assertTrue(Files.isReadable(INPUT_FILE.toPath()));
		assertEquals(contentOfFile(INPUT_FILE), INPUT_CONTENT);
	}
	
	@Test
	public void testCat() throws Exception {
		shell.parseAndEvaluate("cat " + INPUT_FILENAME, outputStream);
		String result = outputStream.toString();
		assertEquals(INPUT_CONTENT, result);
	}
	
	@Test
	public void testEcho() throws Exception {
		shell.parseAndEvaluate("echo hello world", outputStream);
		String result = outputStream.toString();
		assertEquals("hello world" + ENDL, result);
	}
	
	@Test
	public void testHead() throws Exception {
		shell.parseAndEvaluate("head -n 5 " + INPUT2_FILENAME, outputStream);
		String result = outputStream.toString();
		assertEquals(contentOfInput2(0,5), result);
	}
	
	@Test
	public void testTail() throws Exception {
		shell.parseAndEvaluate("tail -n 5 " + INPUT2_FILENAME, outputStream);
		String result = outputStream.toString();
		assertEquals(contentOfInput2(INPUT2_NUMLINES - 5, INPUT2_NUMLINES), result);
	}
	
	@Test
	public void testDate() throws Exception {
		Calendar calendar = Calendar.getInstance();
		shell.parseAndEvaluate("date", outputStream);
		String result = outputStream.toString();
		DateApplication dateApplication = new DateApplication();
		
		assertEquals(dateApplication.formatDate(calendar) + ENDL, result);
	}
	
	@Test
	public void testFmt() throws Exception {
		shell.parseAndEvaluate("fmt -w 10 " + INPUT_FILENAME, outputStream);
		String result = outputStream.toString();
		String expected = "My secret" + ENDL + 
				"password" + ENDL +
				"is 123***";
		assertEquals(expected, result);
	}
	
	@Test
	public void testSort() throws Exception {
		writeToFile("10" + ENDL + "1" + ENDL + "2" + ENDL, INPUT_FILE);
		shell.parseAndEvaluate("sort -n " + INPUT_FILENAME, outputStream);
		String result = outputStream.toString();
		String expected = "1" + ENDL + "2" + ENDL + "10" + ENDL;
		assertEquals(expected, result);
	}
	
	@Test
	public void testComm() throws Exception {
		writeToFile("apple" + ENDL, INPUT_FILE);
		writeToFile("banana" + ENDL, INPUT2_FILE);
		shell.parseAndEvaluate("comm " + INPUT_FILENAME + 
				" " + INPUT2_FILENAME, outputStream);
		String result = outputStream.toString();
		String expected = "apple" + ENDL + "\tbanana" + ENDL;
		assertEquals(expected, result);
	}
	
	@Test
	public void testBc() throws Exception {
		shell.parseAndEvaluate("bc 5+5", outputStream);
		String result = outputStream.toString();
		assertEquals("10" + ENDL, result);
	}
	
	@Test
	public void testCal() throws Exception {
		shell.parseAndEvaluate("cal", outputStream);
	}
	
	@Test
	public void testCommandSequenceTwoCommands() throws Exception {
		shell.parseAndEvaluate("echo hello; echo world;", outputStream);
		String result = outputStream.toString();
		assertEquals("hello" + ENDL + "world" + ENDL, result);
	}
	
	@Test
	public void testCommandSequenceThreeCommands() throws Exception {
		shell.parseAndEvaluate("echo hello; echo from; echo the other side;", outputStream);
		String result = outputStream.toString();
		assertEquals("hello" + ENDL + "from" + ENDL + "the other side" + ENDL, result);
	}
	
	@Test
	public void testQuotedString() throws Exception {
		shell.parseAndEvaluate("echo 'cat tmp.in'", outputStream);
		String result = outputStream.toString();
		assertEquals("cat tmp.in" + ENDL, result);
	}
	
	@Test
	public void testNonQuotedString() throws Exception {
		shell.parseAndEvaluate("echo cat tmp.in", outputStream);
		String result = outputStream.toString();
		assertEquals("cat tmp.in" + ENDL, result);
	}
	
	@Test
	public void testCommandSubstitution() throws Exception {
		shell.parseAndEvaluate("echo `cat tmp.in`", outputStream);
		String result = outputStream.toString();
		assertEquals(INPUT_CONTENT + "" + ENDL, result);
	}
	
	@Test
	public void testCommandSubstitutionInDoubleQuote() throws Exception {
		shell.parseAndEvaluate("echo \"Hello! `cat tmp.in`\"", outputStream);
		String result = outputStream.toString();
		assertEquals("Hello! " + INPUT_CONTENT + ENDL, result);
	}
	
	@Test
	public void testBacktickInSingleQuote() throws Exception {
		shell.parseAndEvaluate("echo 'Hello! `cat tmp.in`'", outputStream);
		String result = outputStream.toString();
		assertEquals("Hello! `cat tmp.in`" + ENDL, result);
	}
	
	@Test
	public void testPipeRedirection() throws Exception {
		shell.parseAndEvaluate("cat " + INPUT2_FILENAME + " | head -n 5", outputStream);
		String result = outputStream.toString();
		assertEquals(contentOfInput2(0, 5), result);
	}
	
	@Test
	public void testPipeTwoCommandsNoArgs() throws Exception {
		String[] args = {};
		String output = shell.pipeTwoCommands(args);
		assertEquals("", output);
	}
	
	@Test
	public void testPipeTwoCommandsSuccess() throws Exception {
		String[] args = {"cal 12 2000", "head -n 1"};
		String output = shell.pipeTwoCommands(args);
		assertEquals("   December 2000" + ENDL, output);
	}
	
	@Test
	public void testPipeTwoCommandsExceptionInFirstApp() throws Exception {
		String[] args = {"cal 13 2000", "head -n 1"};
		String output = shell.pipeTwoCommands(args);
		assertEquals("", output);
	}
	
	@Test
	public void testPipeMultipleCommandsNoArgs() throws Exception { 
		String[] args = {};
		String output = shell.pipeMultipleCommands(args);
		assertEquals("", output);
	}
	
	@Test
	public void testPipeMultipleCommandsSuccess() throws Exception {
		String[] args = {"cal 12 2000", "head -n 2", "tail -n 1"};
		String output = shell.pipeMultipleCommands(args);
		assertEquals("Su Mo Tu We Th Fr Sa" + ENDL, output);
	}
	
	@Test
	public void testPipeMultipleCommandsWithException() throws Exception {
		String[] args = {"cal 13 2000", "head -n 2", "tail -n 1"};
		String output = shell.pipeMultipleCommands(args);
		assertEquals("", output);
	}
	
	@Test
	public void testPipeWithException() {
		String[] args = {"cal 13 2000", "head -n 2", "tail -n 1"};
		String output = shell.pipeWithException(args);
		assertEquals("cal: The month specified should be in between 1..12", output);
	}
	
	@Test
	public void testGlobNoPaths() throws Exception {
		String[] args = {"inexistent_directory", "*"};
		String output = shell.globNoPaths(args);
		assertEquals("", output);
	}
	
	@Test
	public void testGlobOneFile() throws Exception {
		File tmpFile = new File("tmp_directory/test.txt");
		tmpFile.createNewFile();
		
		String[] args = {"tmp_directory", "*"};
		String output = shell.globOneFile(args);
		
		assertEquals("tmp_directory/test.txt", output);
		
		tmpFile.delete();
	}
	
	@Test
	public void testGlobFilesDirectories() throws Exception {
		File tmpFile = new File("tmp_directory/test.txt");
		tmpFile.createNewFile();
		
		File tmpDir2 = new File("tmp_directory/test_results");
		tmpDir2.mkdirs();
		
		String[] args = {"tmp_directory", "*"};
		String output = shell.globFilesDirectories(args);
		
		assertEquals("tmp_directory/test.txt tmp_directory/test_results/", output);
		
		tmpDir2.delete();
		tmpFile.delete();
	}
	
	@Test
	public void testGlobMultiLevel() throws Exception {
		File tmpDir = new File("tmp_directory/tmp1");
		tmpDir.mkdirs();
		
		File tmpFileA = new File("tmp_directory/tmp1/A.tmp");
		tmpFileA.createNewFile();
		
		File tmpFileB = new File("tmp_directory/tmp1/B.tmp");
		tmpFileB.createNewFile();
		
		File tmpDir2 = new File("tmp_directory/tmp2");
		tmpDir2.mkdirs();
		
		File tmpFileC = new File("tmp_directory/tmp2/C.tmp");
		tmpFileC.createNewFile();
		
		File tmpFileD = new File("tmp_directory/tmp2/D.tmp");
		tmpFileD.createNewFile();
		
		String[] args = {"tmp_directory", "*", "*"};
		String output = shell.globMultiLevel(args);
		
		assertEquals("tmp_directory/tmp1/A.tmp tmp_directory/tmp1/B.tmp "
				+ "tmp_directory/tmp2/C.tmp tmp_directory/tmp2/D.tmp", output);
		
		tmpFileA.delete();
		tmpFileB.delete();
		tmpFileC.delete();
		tmpFileD.delete();
		tmpDir.delete();
		tmpDir2.delete();
	}
	
	
}
