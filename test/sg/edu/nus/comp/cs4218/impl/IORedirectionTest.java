package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;

public class IORedirectionTest {
	
	private Shell shell;
	private ByteArrayOutputStream outputStream;
	
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
		
	}
	
	@Test
	public void testOutputRedirectionAppend() {
		
	}
	
	@Test
	public void testInputRedirection() {
		
	}
	
	@Test
	public void testHereDocumentInputRedirection() {
		
	}
	
}
