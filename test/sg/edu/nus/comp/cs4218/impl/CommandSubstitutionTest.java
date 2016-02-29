package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class CommandSubstitutionTest {
	
	private ShellImpl shell;
	private OutputStream outStream;

	@Before
	public void setUp() {
		shell = new ShellImpl();
		outStream = new ByteArrayOutputStream();
	}
	
	@After
	public void tearDown() throws IOException {
		shell = null;
		outStream.close();
	}
	
	@Test
	public void testSingleCommandSubtitutionAtTheEndOfCommand() 
			throws AbstractApplicationException, ShellException {
		String command = "echo this is `echo a long`";
		String expected = "this is a long" + System.lineSeparator();
		shell.parseAndEvaluate(command, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSingleCommandSubstitutionInTheMiddleOfCommand() 
			throws AbstractApplicationException, ShellException {
		String command = "echo this is `echo a long` sentence";
		String expected = "this is a long sentence" + System.lineSeparator();
		shell.parseAndEvaluate(command, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testMultipleCommandsSubstitution() 
			throws AbstractApplicationException, ShellException {
		String command = "echo this is `echo a long ` `echo sentence`";
		String expected = "this is a long sentence" + System.lineSeparator();
		shell.parseAndEvaluate(command, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testCommandSubstitutionInsideDoubleQoute() 
			throws AbstractApplicationException, ShellException {
		String command = "echo \"`echo a long`\"";
		String expected = "a long" + System.lineSeparator();
		shell.parseAndEvaluate(command, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testCommandSubstitutionInsideSingleQoute() 
			throws AbstractApplicationException, ShellException {
		String command = "echo '`echo a long`'";
		String expected = "`echo a long`" + System.lineSeparator();
		shell.parseAndEvaluate(command, outStream);
		assertEquals(expected, outStream.toString());
	}
}
