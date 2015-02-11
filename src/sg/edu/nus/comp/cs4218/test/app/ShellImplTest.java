package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.ShellImpl;

public class ShellImplTest {
	private ShellImpl shell;
	private String inputLine;
	private Vector<String> cmdVector;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		shell = new ShellImpl();
		inputLine = null;
		cmdVector = new Vector<String>();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void createTestFile(String fileName) throws IOException{
        File file = new File(fileName);
        file.createNewFile();
	}

	public void removeTestFile(String fileName) throws IOException{
        File file = new File(fileName);
        file.delete();
	}

	@Test
	public void extractArgsDashTest() throws ShellException, AbstractApplicationException {
		inputLine = "-token1 -token2 -token3";
		shell.extractArgs(" "+inputLine+" ", cmdVector,0);
		String[] resultStrArr = {"-token1", "-token2", "-token3"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}
	
	@Test
	public void dashTest() throws ShellException, AbstractApplicationException {
		inputLine = "-token1 -token2 -token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"-token1", "-token2", "-token3","", ""});
	}
	
	@Test
	public void extractArgsUnquotedTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 token2 token3";
		shell.extractArgs(" "+inputLine+" ", cmdVector,0);
		String[] resultStrArr = {"token1", "token2", "token3"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}
	
	@Test
	public void unquotedTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1", "dir/token-2.txt", "token3","", ""});
	}
	
	@Test
	public void extractArgsSingleQuotedTest() throws ShellException, AbstractApplicationException {
		inputLine = "'token1' 'token2' 'token3'";
		shell.extractArgs(" "+inputLine+" ", cmdVector,0);
		String[] resultStrArr = {"token1", "token2", "token3"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}
	
	@Test
	public void singleQuotesTest() throws ShellException, AbstractApplicationException {
		inputLine = "\'token1\' \'dir/token-2.txt\' \'token3 token3\'";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1", "dir/token-2.txt", "token3 token3","", ""});
	}
	
	@Test
	public void extractArgsDoubleQuotedTest() throws ShellException, AbstractApplicationException {
		inputLine = "\"token1\" \"token2\" \"token3\"";
		shell.extractArgs(" "+inputLine+" ", cmdVector,0);
		String[] resultStrArr = {"token1", "token2", "token3"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}
	
	@Test
	public void doubleQuotesTest() throws ShellException, AbstractApplicationException {
		inputLine = "\"token1\" \"dir/token-2.txt\" \"token3 token3\"";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1", "dir/token-2.txt", "token3 token3","", ""});
	}
	
	@Test
	public void extractArgsbackQuotesInDQTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 \"token2 `token2.2` token2.3\" token3";
		shell.extractArgs(" "+inputLine+" ", cmdVector,0);
		String[] resultStrArr = {"token1","token2 `token2.2` token2.3", "token3"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}
	
	@Test
	public void backQuotesinDQTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 \"token2 `token2.2` token2.3\" token3";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1","token2 `token2.2` token2.3", "token3", "", ""});
	}
	
	@Test
	public void extractInputRedirTest() throws ShellException, AbstractApplicationException {
		inputLine = "<inputDir/file.txt";
		shell.extractInputRedir(" "+inputLine+" ", cmdVector, 0);
		String[] resultStrArr = {"inputDir/file.txt"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}

	@Test
	public void inputRedirTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3 <inputDir";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1", "dir/token-2.txt", "token3","inputDir", ""});
	}
	
	//TODO: testing of input & output streams opening
	@Test
	public void extractOutputRedirTest() throws ShellException, AbstractApplicationException {
		inputLine = ">outputDir/file.txt";
		shell.extractOutputRedir(" "+inputLine+" ", cmdVector, 0);
		String[] resultStrArr = {"outputDir/file.txt"}; 
		Vector<String> resultStrVect = new Vector<String>(Arrays.asList(resultStrArr));
		 assertEquals( cmdVector, resultStrVect );
	}

	@Test
	public void outputRedirTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 dir/token-2.txt token3 >outputDir";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1", "dir/token-2.txt", "token3","", "outputDir"});
	}

	@Test
	public void multipleTypesTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 \"dir/token-2.txt\" \'token3\' -token4 \"token5 `token5.2`\" <inputDir.txt >dir/outputDir.txt";
		String strArray[] = shell.splitString(inputLine);
		assertArrayEquals(strArray, new String[]{"token1", "dir/token-2.txt", "token3", "-token4", "token5 `token5.2`", "inputDir.txt", "dir/outputDir.txt"});
	}
	

	//Testing for throwing of exceptions
	@Test(expected=ShellException.class)
	public void invalidDoubleQuotesTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 \"invalid double quotes\"\" token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected=ShellException.class)
	public void invalidSingleQuotesTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 \'invalid single quotes\'\' token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected=ShellException.class)
	public void invalidQuotesTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 \"invalid token' token3";
		shell.splitString(inputLine);
	}
	
	// invalid unquoted: string containing newlines, semicolons “;”, “|”, “<” and “>”.
	@Test(expected=ShellException.class)
	public void invalidSemicolonTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 token2; token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected=ShellException.class)
	public void invalidDividerTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 token2|token3";
		shell.splitString(inputLine);
	}
	
	@Test(expected=ShellException.class)
	public void invalidLeftAngleBracketTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 token2< token3";
		shell.splitString(inputLine);
	}

	@Test(expected=ShellException.class)
	public void invalidRightAngleBracketTest() throws ShellException, AbstractApplicationException {
		inputLine = "token1 token2> token3";
		shell.splitString(inputLine);
	}


	
	
}
