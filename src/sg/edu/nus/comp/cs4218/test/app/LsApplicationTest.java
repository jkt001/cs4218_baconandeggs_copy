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
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File theDir = new File("testLsApplicationTempDir");
		  if (!theDir.exists()) {
		    boolean result = false;

		    try{
		        theDir.mkdir();

		        File subFile = new File(tempFolderPath,"a.txt");
		        subFile.createNewFile();

		        result = true;
		     } catch(SecurityException se){
		        //handle it
		     }        
		     if(result) {    
	//	       System.out.println("DIR created");  
		     }
		  }
	}



	@Test
	public void testNullArgument(){
		LsApplication myLs = new LsApplication();
		try{
			myLs.run(null,null,null);
			fail("Should throw exception");
		}catch(LsException le){
			assertEquals(le.getLocalizedMessage(), "ls: Null arguments");
		}
	}
	
	@Test
	public void testCurrentDirectory() {
		LsApplication myLs = new LsApplication();
		String[] str = {};
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
			String testStr = myOutputStream.toString();
			assertEquals("bin	README.md	src	"+ tempFolderPath + "\n",testStr);
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
			assertEquals("a.txt\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
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
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		try{
			myLs.run(str, null, myOutputStream);
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
	}
}
