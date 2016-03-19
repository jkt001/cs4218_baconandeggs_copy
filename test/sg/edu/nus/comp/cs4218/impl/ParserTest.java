package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;


public class ParserTest {
	
	private Parser parser;
	private ByteArrayOutputStream outStream;

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Rule
	public TemporaryFolder tFolder = new TemporaryFolder(new File(Paths.get(Environment.currentDirectory).toUri())); 
	
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

	@Test
	public void testExceptionCommands() throws ShellException, AbstractApplicationException, UnsupportedEncodingException {
		thrown.expect(ShellException.class);
		thrown.expectMessage("shell: notacommand: Invalid app.");
		
		parser.parse("notacommand", outStream);
		parser.evaluate();

	}
	@Test
	public void testExceptionCommandsWithPiping() throws ShellException, AbstractApplicationException, UnsupportedEncodingException {
		thrown.expect(ShellException.class);
		thrown.expectMessage("shell: notacommand: Invalid app.");
		
		parser.parse("echo hi | notacommand", outStream);
		parser.evaluate();
	}
	
	@Test
	public void testSpecialCharacterInDoubleQuote() throws ShellException, AbstractApplicationException {
		parser.parse("echo \" hi there \" ", outStream);
		ArrayList<String> comds = parser.getCommands();
		ArrayList<String[]> args = parser.getArguments();
		int numberComds = comds.size();
		assertEquals(numberComds, 1);
		assertEquals("echo", comds.get(0));
		assertEquals(1, args.get(0).length);
		assertEquals(" hi there ", args.get(0)[0]);
	}
	
	@Test
	public void testGlob() throws ShellException, AbstractApplicationException, IOException {
		Path root = Paths.get(Environment.currentDirectory);
		File rootFile = new File(root.toUri());
		tFolder.newFile("TestFile.txt");
		tFolder.newFile("TestFile2.txt");
		tFolder.newFolder("TestFolder");
		String folderPath = tFolder.getRoot().getAbsolutePath();
		String rootPath = rootFile.getAbsolutePath();
		String relative = new File(rootPath).toURI().relativize(new File(folderPath).toURI()).getPath(); 

		String query = "echo " + relative + "*";
		parser.parse(query, outStream);

		ArrayList<String[]> args = parser.getArguments();
		assertEquals(1, args.size());
		assertEquals(3, args.get(0).length);
	}
}
