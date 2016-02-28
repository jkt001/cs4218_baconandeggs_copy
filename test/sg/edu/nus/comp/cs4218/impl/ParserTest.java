package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;


public class ParserTest {
	
	private Parser parser;
	private ByteArrayOutputStream outStream;
	
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
			assertEquals("echo", comds.get(i));
			assertEquals(4, args.get(i).length);
		}
	}
	
	@Test
	public void testParseSingleCommandWithQuotations() throws ShellException, AbstractApplicationException {
		parser.parse("echo 'this is one string'", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(1, numberComds);
		for (int i = 0; i<numberComds; i++) {
			assertEquals("echo", comds.get(i));
			assertEquals(1, args.get(i).length);
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
		assertEquals(1, numberComds);
		assertEquals("echo", comds.get(0));
		assertEquals(4, args.get(0).length);
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
		assertEquals(1, numberComds);
		assertEquals("echo", comds.get(0));
		assertEquals(1, args.get(0).length);
		assertEquals("this is space: Mocked Output", args.get(0)[0]);
	}
	
	@Test
	public void testParseSingleCommandWithNestedQuotesButDisabled() throws ShellException, AbstractApplicationException {
		parser = new MockParser();
		parser.parse("echo 'this is space: `echo hi`'", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(1, numberComds);
		assertEquals("echo", comds.get(0));
		assertEquals(1, args.get(0).length);
		assertEquals("this is space: `echo hi`", args.get(0)[0]);
	}
	
	@Test
	public void testParseMultipleCommand() throws ShellException, AbstractApplicationException {
		parser.parse("echo first command; cat second command", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(2, numberComds);
		for (int i = 0; i<numberComds; i++) {
			if (i==0) {
				assertEquals("echo", comds.get(i));
				assertEquals(2, args.get(i).length);	
			} else if (i == 1) {
				assertEquals("cat", comds.get(i));
				assertEquals(2, args.get(i).length);
			} else {
				fail("Should not have more than 2 commands");
			}
		}
	}
	
	@Test
	public void testPipeTwoCommands() throws ShellException, AbstractApplicationException, UnsupportedEncodingException {
		parser = new MockParser();
		parser.parse("echo first command|echo second command", outStream);
		parser.evaluate();

		assertEquals("Mocked OutputMocked Output", outStream.toString("UTF-8")) ;
	}

	@Test
	public void testPipeMultipleCommands() throws ShellException, AbstractApplicationException, UnsupportedEncodingException {
		parser = new MockParser();
		parser.parse("echo first command | echo second command | cat third command", outStream);
		parser.evaluate();

		assertEquals("Mocked OutputMocked OutputMocked Output", outStream.toString("UTF-8")) ;
	}
}
