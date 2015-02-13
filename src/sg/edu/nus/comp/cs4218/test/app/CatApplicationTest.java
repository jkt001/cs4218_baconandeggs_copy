package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CatException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;

public class CatApplicationTest {
	private CatApplication catApp;
	private String[] args;
	private Path currentDir;

	//private PrintStream stdOut = System.out;
	private ByteArrayOutputStream interceptedValue = new ByteArrayOutputStream();
	private PrintStream interceptingPrintStream = new PrintStream(interceptedValue);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		catApp = new CatApplication();
		args = null;
		currentDir = Paths.get(Environment.currentDirectory);
	}

	@After
	public void tearDown() throws Exception {
		catApp = null;
		args = null;
	}
	
//	@Test
//	public void testNullArgs(){
//		try {
//			catApp.run(args, System.in, System.out);
//			fail("Should have thrown SomeException but did not!");
//		} catch (CatException e) {
//			String exceptionMsg = "cat: "+"Args is null";
//			assertEquals(exceptionMsg, e.getMessage());
//		}
//	}
	
	@Test
	public void testNullInputStream(){
		try{
			catApp.run(args, null, System.out);
			fail("Should have thrown SomeException but did not!");
		}catch (Exception e){
			String exceptionMsg = "cat: "+ "This is a null pointer exception. Not IOException.";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}
	
	@Test
	public void testFileNotExist(){
		args = new String[1];
		args[0] = "fileNotExist.txt";
		try {
			catApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (CatException e) {
			String exceptionMsg = "cat: "+ "No such file exists";
			assertEquals(exceptionMsg, e.getMessage());
		}
	}
	
	@Test
	public void testFileIsDir(){
		args = new String[1];
		args[0] = "tempCatDir";
		File file = new File("tempCatDir");
		file.mkdir();
		try {
			catApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (CatException e) {
			String exceptionMsg = "cat: "+ "This is a directory";
			assertEquals(exceptionMsg, e.getMessage());
		}
		file.delete();
	}
	
	@Test
	public void testFileIsNotReadable(){
		args = new String[1];
		args[0] = "tempCat.txt";
		File file = new File("tempCat.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
			}
		}
		file.setReadable(false,true);
		if(file.canRead()){
			System.out.println("File can be read");
		}else{
			System.out.println("File cannot be read");
		}
		try {
			catApp.run(args, System.in, System.out);
			fail("Should have thrown SomeException but did not!");
		} catch (CatException e) {
			String exceptionMsg = "cat: "+ "Could not read file";
			assertEquals(exceptionMsg, e.getMessage());
		}
		//file.delete();
	}
	
	@Test
	public void testWriteToFile() throws CatException, IOException {
		args = new String[] {currentDir.resolve("littleredridinghood.txt")
				.toString() };
		File out = new File("test.txt");
		out.createNewFile();
		OutputStream stdout = new FileOutputStream(out);
		byte[] expected = Files.readAllBytes(currentDir
				.resolve("littleredridinghood.txt"));
		catApp.run(args, System.in, stdout);
		assertArrayEquals(expected, Files.readAllBytes(Paths.get(out
				.getAbsolutePath())));
		out.delete();
	}
	
	
//	@Test
//	public void testWriteToSystemOut() throws CatException, IOException {
//		 System.setOut(interceptingPrintStream);
//		 catApp.run(args, System.in, System.out);
//		 String expected = "aaa";
//		 assertEquals(expected, interceptedValue.toString());
//		 System.out.flush();
//	}
}
