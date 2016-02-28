package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.exception.CommException;

public class CommApplicationTest {
	
	private CommApplication commApp;
	private InputStream inStream;
	private OutputStream outStream;
	
	private static final String LINE_SEPARATOR = System.lineSeparator();
	
	private static final String INPUT_FILENAME_1 = "comm_input_1.txt";
	private static final String INPUT_FILENAME_2 = "comm_input_2.txt";
	
	private static final String INPUT_CONTENT_1 = "apple" + LINE_SEPARATOR 
			+ "banana" + LINE_SEPARATOR 
			+ "eggplant" + LINE_SEPARATOR;
	private static final String INPUT_CONTENT_2 = "apple" + LINE_SEPARATOR
			+ "banana" + LINE_SEPARATOR
			+ "banana" + LINE_SEPARATOR
			+ "zucchini" + LINE_SEPARATOR;
	
	private void writeToInputStream(String content) {
		inStream = new ByteArrayInputStream(content.getBytes());
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp() {
		commApp = new CommApplication();
		inStream = new ByteArrayInputStream("".getBytes());
		outStream = new ByteArrayOutputStream();
	}
	
	@After
	public void tearDown() {
		commApp = null;
		inStream = null;
		outStream = null;
	}
	
	@Test
	public void testRunCommandZeroArgument() throws Exception {
		thrown.expect(CommException.class);
		thrown.expectMessage("comm: Usage: comm [FILE1] FILE2");
		String[] args = { };
		commApp.run(args, inStream, outStream);
	}
	
	@Test
	public void testRunCommandOneArgument() {
		
	}
	
	@Test
	public void testRunCommandTwoArguments() {
		
	}
	
	@Test
	public void testRunCommandThreeArguments() {
		
	}
	
}
