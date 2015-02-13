package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.WcException;
import sg.edu.nus.comp.cs4218.impl.app.WcApplication;

public class WcApplicationTest {
	static String tempFilePath = "testWcApplication.txt";

	/*
	 * one character, one word, one line
	 * two character, two word, two line
	 * with double spacing, with triple spacing
	 * with double line
	 * end with empty space, end with empty line
	 * symbols
	 * * m, w, l, mw, wl, ml, mwl, null
	 * * null
	 * File
	 * Stdin
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try{
			File file = new File(tempFilePath);
			file.createNewFile();
		} catch(SecurityException se){
			fail("Cannot create temporary file to test");
		}
	}

	@Test
	public void testNullArgument(){
		WcApplication myWc = new WcApplication();
		try{
			myWc.run(null,null,null);
			fail("Should throw exception");
		}catch(WcException we){
			assertEquals(we.getLocalizedMessage(), "wc: Null arguments");
		}
	}

	@Test
	public void testOneCharacter_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_M_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"m",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_W_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"w",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_L_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"l",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_MW_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"m","w",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_WL_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"w","l",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("1	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_ML_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"m","l",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_MWL_FileInput(){
		WcApplication myWc = new WcApplication();
		FileOutputStream myFileOutputStream;
		try {
			myFileOutputStream = new FileOutputStream(new File(tempFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			bw.write("a");
			bw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] str = {"m","w","l",tempFilePath};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,null,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testOneCharacter_StdinInput(){
		WcApplication myWc = new WcApplication();		
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("a".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("2	1	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}

	@Test
	public void testTwoCharacter_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("3	1	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testTwoWord_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab bc".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("6	2	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}

	@Test
	public void testTwoWord_DoubleSpacing_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab  bc".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("7	2	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testTwoWord_TripleSpacing_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		ByteArrayInputStream myInputStream = new ByteArrayInputStream("ab   bc".getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("8	2	1",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testTwoLine_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab"+System.getProperty("line.separator")+"bc";
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("6	2	2",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	@Test
	public void testThreeLine_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab"+System.getProperty("line.separator")+System.getProperty("line.separator")+"bc";
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("7	2	3",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	/*
	@Test
	public void testEndWithEmptyLine_StdinInput(){
		WcApplication myWc = new WcApplication();
		String[] str = {};
		String inputStr = "ab"+System.getProperty("line.separator");
		ByteArrayInputStream myInputStream = new ByteArrayInputStream(inputStr.getBytes());
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myWc.run(str,myInputStream,myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("4	1	2",testStr);
		}catch(WcException we){
			fail("Should not throw exception");
		}
	}
	*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File file = new File(tempFilePath);
		file.delete();

	}
}
