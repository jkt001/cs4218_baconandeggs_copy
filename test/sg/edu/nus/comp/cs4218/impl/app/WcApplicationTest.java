package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.WcException;
import sg.edu.nus.comp.cs4218.impl.app.WcApplication;

public class WcApplicationTest {
	final static String TEMP_FILE_PATH = "testWcApplication.txt";
	final static String LINE_SEPARATOR = "line.separator";

	/*
	 * * one character, one word, one line - stdin
	 * * two character, two word, one line - stdin
	 * * two word, one line - stdin
	 * * with double spacing, with triple spacing
	 * * with double line
	 * * end with empty space, end with empty line
	 * symbols
	 * * m, w, l, mw, wl, ml, mwl, null
	 * * null args, null stdout
	 * File
	 * Stdin
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try{
			File file = new File(TEMP_FILE_PATH);
			file.createNewFile();
		} catch(SecurityException se){
			fail("Cannot create temporary file to test");
		}
	}

	@Test
	public void testNullArgument(){
		WcApplication myWc = new WcApplication();
		try{
			myWc.run(null,null,new ByteArrayOutputStream());
			fail("Should throw exception");
		}catch(WcException we){
			assertEquals(we.getLocalizedMessage(), "wc: Null arguments");
		}
	}

	@Test
	public void testNullStdout(){
		WcApplication myWc = new WcApplication();
		try{
			String str[] = {TEMP_FILE_PATH};
			myWc.run(str,null,null);
			fail("Should throw exception");
		}catch(WcException we){
			assertEquals(we.getLocalizedMessage(), "wc: OutputStream not provided");
		}
	}

	public void testInvalidArgument(){
		WcApplication myWc = new WcApplication();
		try{
			String str[] = {"a",TEMP_FILE_PATH};
			myWc.run(str,null,new ByteArrayOutputStream());
			fail("Should throw exception");
		}catch(WcException we){
			assertEquals(we.getLocalizedMessage(), "wc: OutputStream not provided");
		}
	}

	@Test
	public void testOneCharacterFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBufferedWriter = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBufferedWriter.write("a");
			myBufferedWriter.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception.");
		}
	}

	@Test
	public void testOneCharacterMFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-m",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception.");
		}
	}

	@Test
	public void testOneCharacterWFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-w",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception.");
		}
	}

	@Test
	public void testOneCharacterLFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-l",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception ");
		}
	}

	@Test
	public void testOneCharacterMWFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-m","-w",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception ");
		}
	}

	@Test
	public void testOneCharacterWLFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-wl",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("1	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception ");
		}
	}

	@Test
	public void testOneCharacterMLFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-m","-l",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1\n",testStr);
		}catch(WcException we){
			fail("Should not throws exception");
		}
	}

	@Test
	public void testOneCharacterMWLFileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFOS;
		try {
			myFOS = new FileOutputStream(new File(TEMP_FILE_PATH));
			BufferedWriter myBW = new BufferedWriter(new OutputStreamWriter(myFOS));
			myBW.write("a");
			myBW.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"-mwl",TEMP_FILE_PATH};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1	1\n",testStr);
		}catch(WcException we){
			fail("Should not throws exception");
		}
	}

	@Test
	public void testOneCharacterStdinInput(){
		WcApplication myWc = new WcApplication();		
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("a".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw any exception");
		}
	}

	@Test
	public void testTwoCharacterStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("3	1	1\n",testStr);
		}catch(WcException we){
			fail("Should not throws exception");
		}
	}

	@Test
	public void testTwoWordStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab bc".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("6	2	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw any exception");
		}
	}

	@Test
	public void testTwoWordDoubleSpacingStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab  bc".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("7	2	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw wc exception");
		}
	}

	@Test
	public void testTwoWordTripleSpacingStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab   bc".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("8	2	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw wc exception");
		}
	}

	@Test
	public void testTwoLineStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "as" + System.getProperty(LINE_SEPARATOR) + "df";
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("6	2	2\n",testStr);
		}catch(WcException we){
			fail("Should not throw wc exception");
		}
	}

	@Test
	public void testContentLineEmptyStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab"+System.getProperty(LINE_SEPARATOR)+System.getProperty(LINE_SEPARATOR)+"bc";
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("7	2	3\n",testStr);
		}catch(WcException we){
			fail("Should not throw wcexception");
		}
	}

	@Test
	public void testEndWithEmptyLineStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab"+System.getProperty(LINE_SEPARATOR)+System.getProperty(LINE_SEPARATOR);//new line and carriage return
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("4	1	2\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}

	@Test
	public void testEndWithEmptySpaceStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab ";
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("4	1	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}

	@Test
	public void testWithSymbolStdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab , bc";
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("8	3	1\n",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}

	@Test
	public void testFuncWordCount(){
		WcApplication myWc = new WcApplication();
		InputStream myInputStream = new ByteArrayInputStream("abc \n".getBytes());

		try {
			int[] count= myWc.wordCount(myInputStream);
			assertEquals(5, count[0]);
			assertEquals(1, count[1]);
			assertEquals(1, count[2]);

		} catch (WcException e) {
			fail("Should not throw exception!");
		}	
	}

	@Test
	public void testFuncParseArgument(){
		WcApplication myWc = new WcApplication();
		String[] args = {"-w","-m", TEMP_FILE_PATH};
		String[] filePath;
		try {
			filePath = myWc.parseArgument(args);
			assertEquals(true, myWc.printChar);
			assertEquals(true, myWc.printWord);
			assertEquals(false, myWc.printLine);
			assertEquals(1, filePath.length);
			assertEquals(TEMP_FILE_PATH, filePath[0]);
		} catch (WcException e) {
			fail("Should not throw exception!");
		}
	}

	@Test
	public void testFuncWriteWordCountsToOutputStream(){
		WcApplication myWc = new WcApplication();
		myWc.printChar = true;
		myWc.printLine = true;
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			myWc.writeWordCountsToOutputStream(new int[]{1,2,3}, myOutputStream);
			assertEquals("1	3\n",myOutputStream.toString());
		} catch (WcException e) {
			fail("Should not throw exception!");
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File file = new File(TEMP_FILE_PATH);
		file.delete();
	}
}
