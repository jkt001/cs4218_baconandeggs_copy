package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Parser;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;


public class ParserTest {
	
	private Parser parser;
	private OutputStream outStream;
	
	@Before
	public void setUp() {
		parser = new Parser();
		outStream = new ByteArrayOutputStream();
	}

	@Test
	public void testParseSingleCommand() throws ShellException, AbstractApplicationException {
		parser.parse("echo this is 4 strings", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(numberComds, 1);
		for (int i = 0; i<numberComds; i++) {
			assertEquals(comds.get(i), "echo");
			assertEquals(args.get(i).length, 4);
		}
	}
	
	@Test
	public void testParseSingleCommandWithQuotations() throws ShellException, AbstractApplicationException {
		parser.parse("echo 'this is one string'", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(numberComds, 1);
		for (int i = 0; i<numberComds; i++) {
			assertEquals(comds.get(i), "echo");
			assertEquals(args.get(i).length, 1);
		}
	}
	
	@Test
	public void testParseSingleCommandWithBackQuote() throws ShellException, AbstractApplicationException {
		parser = new MockParser();
		parser.parse("echo this is `echo a long` sentence", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		String[] expected = {"this", "is", "Mocked Output", "sentence"};
		int numberComds = comds.size();
		assertEquals(numberComds, 1);
		assertEquals(comds.get(0), "echo");
		assertEquals(args.get(0).length, 4);
		for (int j = 0; j <expected.length; j++) {
			assertEquals(expected[j], args.get(0)[j]);
		}
	}
	
	@Test
	public void testParseSingleCommandWithNestedQuotes() throws ShellException, AbstractApplicationException {
		parser = new MockParser();
		parser.parse("echo \"this is space: `echo hi`\"", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(numberComds, 1);
		assertEquals(comds.get(0), "echo");
		assertEquals(args.get(0).length, 1);
		assertEquals(args.get(0)[0], "this is space: Mocked Output");
	}
	
	@Test
	public void testParseSingleCommandWithNestedQuotesButDisabled() throws ShellException, AbstractApplicationException {
		parser = new MockParser();
		parser.parse("echo 'this is space: `echo hi`'", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(numberComds, 1);
		assertEquals(comds.get(0), "echo");
		assertEquals(args.get(0).length, 1);
		assertEquals(args.get(0)[0], "this is space: `echo hi`");
	}
	
	@Test
	public void testParseMultipleCommand() throws ShellException, AbstractApplicationException {
		parser.parse("echo first command; cat second command", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(numberComds, 2);
		for (int i = 0; i<numberComds; i++) {
			if (i==0) {
				assertEquals(comds.get(i), "echo");
				assertEquals(args.get(i).length, 2);	
			} else if (i == 1) {
				assertEquals(comds.get(i), "cat");
				assertEquals(args.get(i).length, 2);
			} else {
				fail("Should not have more than 2 commands");
			}
		}
	}
}
