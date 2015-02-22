package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.OSCheck;
import sg.edu.nus.comp.cs4218.exception.LsException;
import sg.edu.nus.comp.cs4218.impl.app.LsApplication;

public class LsApplicationTest {
	final static String TEMP_FOLDER_PATH = "testLsApplicationTempDir";
	final static String TEMP_FILE_NAME = "a.txt";
	final static String TEMP_FOLDER_PATH2 = "testLsApplicationTempDir2";
	final static String TEMP_FILE_NAME2 = "b.txt";
	final static String TEMP_FOLDER_PATH3 = "testLsApplicationTempDir3";
	final static String NOT_EXISTS_PATH = "testLsApplicationNotExistsTempDir";
	final static String DIR_NOT_EXIST_MSG = "ls: Directory does not exist";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//testLsApplicationTempDir - a.txt, b.txt
		//testLsApplicationTempDir - b.txt
		//testLsApplicationTempDir3
		File theDir = new File(TEMP_FOLDER_PATH);
		if (!theDir.exists()) {
			try{
				theDir.mkdir();
				File subFile = new File(TEMP_FOLDER_PATH+File.separator+ TEMP_FILE_NAME);
				subFile.createNewFile();
				subFile = new File(TEMP_FOLDER_PATH+File.separator+TEMP_FILE_NAME2);
				subFile.createNewFile();
			} catch(SecurityException se){
				se.printStackTrace();
			}    
		}
		
		File theDir2 = new File(TEMP_FOLDER_PATH2);
		if (!theDir2.exists()) {
			try{
				theDir2.mkdir();
				File subFile = new File(TEMP_FOLDER_PATH2, TEMP_FILE_NAME2);
				subFile.createNewFile();
			} catch(SecurityException se){
				se.printStackTrace();
			}    
		}
		File theDir3 = new File(TEMP_FOLDER_PATH3);
		if (!theDir3.exists()) {
			try{
				theDir3.mkdir();
			} catch(SecurityException se){
				se.printStackTrace();
			}    
		}
	}

	@Test
	public void testNullArgument(){
		LsApplication myLs = new LsApplication();
		try{
			myLs.run(null,null,new ByteArrayOutputStream());
			fail("Should throw exception");
		}catch(LsException le){
			assertEquals("ls: Null arguments", le.getLocalizedMessage());
		}
	}
	
	@Test
	public void testNullStdout(){
		LsApplication myLs = new LsApplication();
		try{
			String str[] = {TEMP_FOLDER_PATH};
			myLs.run(str,null,null);
			fail("Should throw exception");
		}catch(LsException le){
			assertEquals("ls: OutputStream not provided", le.getLocalizedMessage());
		}
	}
	
	@Test
	public void testDirectoryWithoutReadPermission(){
		LsApplication myLs = new LsApplication();
		
		if (OSCheck.isWindows()){
			try{
				String str[] = {"C:\\$RECYCLE.BIN"};
				myLs.run(str,null,new ByteArrayOutputStream());
				fail("Should throw exception");
			}catch(LsException le){
				assertEquals("ls: Permission denied", le.getLocalizedMessage());
			}
			return;
		}
		
		try{
			File file = new File(TEMP_FOLDER_PATH);
			file.setReadable(false);
			String str[] = {TEMP_FOLDER_PATH};
			myLs.run(str,null,new ByteArrayOutputStream());
			fail("Should throw exception");
		}catch(LsException le){
			File file = new File(TEMP_FOLDER_PATH);
			file.setReadable(true);
			assertEquals("ls: Permission denied", le.getLocalizedMessage());
		}
	}

	@Test
	public void testFunctionWriteStringToOutputStream(){
		LsApplication myLs = new LsApplication();
		String str[] = {"a.txt","b.pdf"};
		ByteArrayOutputStream myStream = new ByteArrayOutputStream();
		try {
			myLs.writeStringToOutputStream(str, myStream);
		} catch (LsException e) {
			fail("Not supposed to throw exception.");
		}
		assertEquals("a.txt	b.pdf\n", myStream.toString());
	}
	
	@Test
	public void testFunctionGetListOfFileFromDirectoryWithValidDirectory(){
		LsApplication myLs = new LsApplication();
		try {
			String str[] = myLs.getListOfFileFromDirectory(TEMP_FOLDER_PATH);
			assertEquals(TEMP_FILE_NAME, str[0]);
			assertEquals(TEMP_FILE_NAME2, str[1]);
			assertEquals(2, str.length);
		} catch (LsException e) {
			fail("Not supposed to throw exception.");
		}
	}
	
	@Test
	public void testFunctionGetListOfFileFromDirectoryWithInvalidDirectory(){
		LsApplication myLs = new LsApplication();
		try {
			myLs.getListOfFileFromDirectory(NOT_EXISTS_PATH);
			fail("Should throw exception for folder that does not exists.");
		} catch (LsException e) {
			assertEquals(e.getLocalizedMessage(), DIR_NOT_EXIST_MSG);
		}
	}

	@Test
	public void testDirectoryWithEmptyFile(){
		LsApplication myLs = new LsApplication();
		String[] str = {TEMP_FOLDER_PATH3};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			myLs.run(str, null, myOutputStream);
			assertEquals("",myOutputStream.toString());
		} catch (LsException e) {
			fail("Not supposed to have exception for folder that exists.");
		}
	}
	
	@Test
	public void testFileAsDirectory(){
		LsApplication myLs = new LsApplication();
		String temp = Environment.currentDirectory;
		Environment.currentDirectory += File.separator + TEMP_FOLDER_PATH; 
		String[] str = {TEMP_FILE_NAME};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try {
			myLs.run(str, null, myOutputStream);
			fail("Should throw directory not found exception.");
		} catch (LsException e) {
			assertEquals(e.getLocalizedMessage(), DIR_NOT_EXIST_MSG);
		}
		Environment.currentDirectory = temp;
	}
	
	@Test
	public void testTempDirectoryAsCurrentDirectory() {
		LsApplication myLs = new LsApplication();
		String[] str = {};
		String temp = Environment.currentDirectory;
		Environment.currentDirectory += File.separator + TEMP_FOLDER_PATH; 
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(TEMP_FILE_NAME+"\t"+TEMP_FILE_NAME2+"\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
		}		
		//after test change back current directory
		Environment.currentDirectory = temp;
	}

	@Test
	public void testWithPathArgument(){
		LsApplication myLs = new LsApplication();
		String path = Environment.currentDirectory + File.separator + TEMP_FOLDER_PATH;
		String[] str = {path};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(TEMP_FILE_NAME + "\t" + TEMP_FILE_NAME2 + "\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
		}
	}

	@Test
	public void testMoreThanOnePathArgument(){
		LsApplication myLs = new LsApplication();
		String str[] = {TEMP_FOLDER_PATH,TEMP_FOLDER_PATH2};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		try{
			myLs.run(str,null,myOutputStream);
			String expectedResult = TEMP_FOLDER_PATH + File.separator +":\n" 
									+ TEMP_FILE_NAME + "\t" + TEMP_FILE_NAME2 + "\n" 
									+ "\n"
									+ TEMP_FOLDER_PATH2 + File.separator + ":\n"
									+ TEMP_FILE_NAME2 + "\n" ;
			assertEquals(expectedResult,myOutputStream.toString());
		}catch(LsException le){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testCurrentDirectoryNotExists(){
		LsApplication myLs = new LsApplication();

		String temp = Environment.currentDirectory;
		Environment.currentDirectory += File.separator + NOT_EXISTS_PATH; 
		String[] str = {};
		try{
			myLs.run(str, null, new ByteArrayOutputStream());
			fail("Should throw directory not exist exception");
		}catch(LsException le){
			assertEquals(le.getLocalizedMessage(), DIR_NOT_EXIST_MSG);
		}
		Environment.currentDirectory = temp;

	}

	@Test
	public void testWithPathArgumentDirectoryNotExists(){
		LsApplication myLs = new LsApplication();
		String path = Environment.currentDirectory + File.separator + NOT_EXISTS_PATH;
		String[] str = {path};
		try{
			myLs.run(str, null, new ByteArrayOutputStream());
			fail("Should throw directory not exist exception");
		}catch(LsException le){
			assertEquals(le.getLocalizedMessage(), DIR_NOT_EXIST_MSG);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File theDir = new File(TEMP_FOLDER_PATH);
		if(theDir.exists()){
			File subFile = new File(TEMP_FOLDER_PATH,TEMP_FILE_NAME);
			subFile.delete();
			subFile = new File(TEMP_FOLDER_PATH,TEMP_FILE_NAME2);
			subFile.delete();
			theDir.delete();
		}
		
		File theDir2 = new File(TEMP_FOLDER_PATH2);
		if(theDir2.exists()){
			File subFile = new File(TEMP_FOLDER_PATH2,TEMP_FILE_NAME2);
			subFile.delete();
			theDir2.delete();
		}
		
		File theDir3 = new File(TEMP_FOLDER_PATH3);
		if(theDir3.exists()){
			theDir3.delete();
		}
	}
}
