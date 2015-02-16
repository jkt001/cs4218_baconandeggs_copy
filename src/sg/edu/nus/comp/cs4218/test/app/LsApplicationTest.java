package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.LsException;
import sg.edu.nus.comp.cs4218.impl.app.LsApplication;

public class LsApplicationTest {
	static String tempFolderPath = "testLsApplicationTempDir";
	static String tempFileName = "a.txt";
	static String tempFolderPath2 = "testLsApplicationTempDir2";
	static String tempFileName2 = "b.txt";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File theDir = new File(tempFolderPath);
		if (!theDir.exists()) {
			try{
				theDir.mkdir();
				File subFile = new File(tempFolderPath, tempFileName);
				subFile.createNewFile();
			} catch(SecurityException se){
				se.printStackTrace();
			}    
		}
		
		File theDir2 = new File(tempFolderPath2);
		if (!theDir2.exists()) {
			try{
				theDir2.mkdir();
				File subFile = new File(tempFolderPath2, tempFileName2);
				subFile.createNewFile();
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
			assertEquals(le.getLocalizedMessage(), "ls: Null arguments");
		}
	}
	
	@Test
	public void testNullStdout(){
		LsApplication myLs = new LsApplication();
		try{
			String str[] = {tempFolderPath};
			myLs.run(str,null,null);
			fail("Should throw exception");
		}catch(LsException le){
			assertEquals(le.getLocalizedMessage(), "ls: OutputStream not provided");
		}
	}

	/*	@Test
	public void testFunctionWriteStringToOutputStream(){
		LsApplication myLs = new LsApplication();
		String str[] = {"a.txt","b.pdf"};
		ByteArrayOutputStream myStream = new ByteArrayOutputStream();
		myLs.writeStringToOutputStream(str, myStream);
		assertEquals("a.txt	b.pdf\n", myStream.toString());
	}
	
	@Test
	public void testFunctionGetListOfFileFromDirectoryWithValidDirectory(){
	}
	@Test
	public void testFunctionGetListOfFileFromDirectoryWithInvalidDirectory(){
	}
	 */
	
	@Test
	public void testCurrentDirectory() {
		LsApplication myLs = new LsApplication();
		String[] str = {};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("bin	README.md	src	"+ tempFolderPath + "\t" + tempFolderPath2 + "\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
		}		
	}

	@Test
	public void testTempDirectoryAsCurrentDirectory() {
		LsApplication myLs = new LsApplication();
		String[] str = {};
		String temp = Environment.currentDirectory;
		Environment.currentDirectory += File.separator + tempFolderPath; 
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("a.txt\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
		}		
		//after test change back current directory
		Environment.currentDirectory = temp;
	}

	@Test
	public void testWithPathArgument(){
		LsApplication myLs = new LsApplication();
		String path = Environment.currentDirectory + File.separator + tempFolderPath;
		String[] str = {path};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals(tempFileName + "\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
		}
	}

	@Test
	public void testMoreThanOnePathArgument(){
		LsApplication myLs = new LsApplication();
		String str[] = {tempFolderPath,tempFolderPath2};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();

		try{
			myLs.run(str,null,myOutputStream);
			String expectedResult = tempFolderPath + File.separator +":\n" 
									+ tempFileName + "\n" 
									+"\n"
									+ tempFolderPath2 + File.separator + ":\n"
									+ tempFileName2 + "\n" ;
			assertEquals(expectedResult,myOutputStream.toString());
		}catch(LsException le){
			fail("Should not throw exception");
		}
	}
	
	@Test
	public void testCurrentDirectoryNotExists(){
		LsApplication myLs = new LsApplication();

		String temp = Environment.currentDirectory;
		Environment.currentDirectory += File.separator + "testLsApplicationNotExistTempDir"; 
		String[] str = {};
		try{
			myLs.run(str, null, new ByteArrayOutputStream());
			fail("Should throw directory not exist exception");
		}catch(LsException le){
			assertEquals(le.getLocalizedMessage(), "ls: Directory does not exist");
		}
		Environment.currentDirectory = temp;

	}

	@Test
	public void testWithPathArgumentDirectoryNotExists(){
		LsApplication myLs = new LsApplication();
		String path = Environment.currentDirectory + File.separator + "testLsApplicationNotExistsTempDir";
		String[] str = {path};
		try{
			myLs.run(str, null, new ByteArrayOutputStream());
			fail("Should throw directory not exist exception");
		}catch(LsException le){
			assertEquals(le.getLocalizedMessage(), "ls: Directory does not exist");
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File theDir = new File(tempFolderPath);
		if(theDir.exists()){
			File subFile = new File(tempFolderPath,"a.txt");
			subFile.delete();
			theDir.delete();
		}
		
		File theDir2 = new File(tempFolderPath2);
		if(theDir2.exists()){
			File subFile = new File(tempFolderPath2,"b.txt");
			subFile.delete();
			theDir2.delete();
		}
	}
}
