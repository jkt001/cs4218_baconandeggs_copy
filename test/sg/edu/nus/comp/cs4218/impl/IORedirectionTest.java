package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;

public class IORedirectionTest {
	
	private Shell shell;
	private ByteArrayOutputStream outputStream;
	private static final String INPUT_FILENAME = "tmp.in";
	private static final String INPUT_CONTENT = "My secret password is 123***";
	private static final File INPUT_FILE = Paths.get(Environment.currentDirectory).resolve(INPUT_FILENAME).toFile();
	
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
	
	@Before
	public void setUp() throws IOException {
		shell = new ShellImpl();
		outputStream = new ByteArrayOutputStream();
		writeToFile(INPUT_CONTENT, INPUT_FILE);
	}
	
	@After
	public void tearDown() {
		shell = null;
		outputStream = null;
		INPUT_FILE.delete();
	}
	
	@Test
	public void testSetup() throws IOException {
		assertTrue(INPUT_FILE.exists());
		assertTrue(Files.isReadable(INPUT_FILE.toPath()));
		assertEquals(contentOfFile(INPUT_FILE), INPUT_CONTENT);
	}
	
	@Test
	public void testOutputRedirection() throws Exception {
		shell.parseAndEvaluate("echo hello world > tmp.out", outputStream);
		String result = outputStream.toString();
		assertEquals("", result);
		File outputFile = Paths.get(Environment.currentDirectory).resolve("tmp.out").toFile();
		assertTrue("Output file gets created", outputFile.exists());
		assertEquals("hello world", contentOfFile(outputFile));
	}
	
	@Test
	@Ignore("Append feature is not implemented in our standard.")
	public void testOutputRedirectionAppend() throws Exception {
		shell.parseAndEvaluate("echo hello world > tmp.out", outputStream);
		shell.parseAndEvaluate("echo chocolate >> tmp.out", outputStream);
		assertEquals("", outputStream.toString());
		File outputFile = Paths.get(Environment.currentDirectory).resolve("tmp.out").toFile();
		assertTrue("Output file gets created", outputFile.exists());
		assertEquals("hello world" + System.lineSeparator() + "chocolate",
			contentOfFile(outputFile));
	}
	
	@Test
	public void testInputRedirection() throws Exception {
		shell.parseAndEvaluate("head < " + INPUT_FILENAME, outputStream);
		String result = outputStream.toString();
		assertEquals(INPUT_CONTENT, result);
	}
	
	@Test
	@Ignore("HEREDOC feature is not implemented in our standard.")
	public void testHereDocumentInputRedirection() throws Exception {
		StringBuilder commandBuilder = new StringBuilder();
		commandBuilder.append("head > output.txt << EOF").append(System.lineSeparator());
		commandBuilder.append("Line 1").append(System.lineSeparator());
		commandBuilder.append("Line 2").append(System.lineSeparator());
		commandBuilder.append("EOF").append(System.lineSeparator());
		shell.parseAndEvaluate(commandBuilder.toString(), outputStream);
		String shellOutput = outputStream.toString();
		assertTrue(shellOutput.isEmpty());
		File outputFile = Paths.get(Environment.currentDirectory).resolve("output.txt").toFile();
		assertTrue(outputFile.exists());
		String expectedResult = "Line 1" + System.lineSeparator() + "Line 2";
		assertEquals(expectedResult, contentOfFile(outputFile));
	}
	
}
