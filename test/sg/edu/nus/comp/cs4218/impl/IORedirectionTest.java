package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;

public class IORedirectionTest {
	
	private Shell shell;
	private ByteArrayOutputStream outputStream;
	
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
	
	@Before
	public void setUp() {
		shell = new ShellImpl();
		outputStream = new ByteArrayOutputStream();
	}
	
	@After
	public void tearDown() {
		shell = null;
		outputStream = null;
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
	public void testInputRedirection() {
		
	}
	
	@Test
	public void testHereDocumentInputRedirection() {
		
	}
	
}
