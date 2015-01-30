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
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File theDir = new File("testLsApplicationTempDir");
		  // if the directory does not exist, create it
		  if (!theDir.exists()) {
	//	    System.out.println("creating directory: " + theDir);
		    boolean result = false;

		    try{
		        theDir.mkdir();

		        File subFile = new File("testLsApplicationTempDir","a.txt");
		        subFile.createNewFile();

		    	//theDir.createNewFile();
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
//			System.out.print(testStr);
			assertEquals("bin	README.md	src	testLsApplicationTempDir\n",testStr);
		}catch(LsException le){
			fail("Not supposed to have exception for folder that exists.");
		}		
	}
	
	@Test
	public void testTempDirectoryAsCurrentDirectory() {
		LsApplication myLs = new LsApplication();
		String[] str = {};
		String temp = Environment.currentDirectory;
		Environment.currentDirectory += File.separator + "testLsApplicationTempDir"; 
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
		String path = Environment.currentDirectory + File.separator + "testLsApplicationTempDir";
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
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File theDir = new File("testLsApplicationTempDir");
		if(theDir.exists()){
			File subFile = new File("testLsApplicationTempDir","a.txt");
	        subFile.delete();
			theDir.delete();
		}
	}
}
