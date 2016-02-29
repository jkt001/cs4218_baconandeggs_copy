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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;

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
	public void testCat() throws Exception {
		shell.parseAndEvaluate("cat " + INPUT_FILENAME, outputStream);
		String result = outputStream.toString();
		assertEquals(INPUT_CONTENT, result);
	}
	
}
