package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CdException;
import sg.edu.nus.comp.cs4218.impl.app.CdApplication;

public class CdApplicationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	// Test null parameters
	@Test
	public void testNullParams() {
		CdApplication app = new CdApplication();
		String[] params = null;
		try {
			app.run(params, System.in, System.out);
			fail("Not supposed to succeed.");
		} catch (CdException e) {
			
		}
	}
	
	// Test zero parameters
	@Test
	public void testZeroParams() {
		CdApplication app = new CdApplication();
		String[] params = {};
		try {
			app.run(params, System.in, System.out);
			fail("Not supposed to succeed.");
		} catch (CdException e) {
			
		}
	}
	
	// Test one parameter, but null value
	@Test
	public void testOneNullParams() {
		CdApplication app = new CdApplication();
		String[] params = {null};
		try {
			app.run(params, System.in, System.out);
			fail("Not supposed to succeed.");
		} catch (CdException e) {
			
		}
	}
	
	// Test two parameters
	@Test
	public void testTwoParams() {
		CdApplication app = new CdApplication();
		String[] params = {"a", "b"};
		try {
			app.run(params, System.in, System.out);
			fail("Not supposed to succeed.");
		} catch (CdException e) {
			
		}
	}

	// Test folder that exists, absolute path
	@Test
	public void testRun() {
		testCdExpectSuccess(System.getProperty("user.dir"), "C:\\", "C:\\");
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testRun1a() {
		testCdExpectSuccess(System.getProperty("user.dir"), "C:\\Windows", "C:\\Windows");
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testRun1b() {
		testCdExpectSuccess(System.getProperty("user.dir"), "C:\\Windows\\", "C:\\Windows");
	}
	
	// Test folder that does not exist, absolute path
	@Test
	public void testRun2() {
		testCdExpectFailure(System.getProperty("user.dir"), "C:\\InvalidDir");
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRun3() {
		testCdExpectSuccess("C:\\Windows", "..", "C:\\");
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRun3a() {
		testCdExpectSuccess("C:\\Windows\\System32", "..\\..", "C:\\");
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRun3b() {
		testCdExpectSuccess("C:\\Windows\\System32", "..\\System", "C:\\Windows\\System");
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRun4() {
		testCdExpectSuccess("C:\\Windows", "\\", "C:\\");
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRun4a() {
		testCdExpectSuccess("C:\\Windows", "\\Users", "C:\\Users");
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRun5() {
		testCdExpectSuccess("C:\\", "..", "C:\\");
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRun5a() {
		testCdExpectSuccess("C:\\Windows", "..\\..", "C:\\");
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRun5b() {
		testCdExpectSuccess("C:\\Windows", "\\..", "C:\\");
	}

	private void testCdExpectFailure(String initialDirectory, String cdPath) {
		Environment.currentDirectory = initialDirectory;
		
		CdApplication app = new CdApplication();
		String[] params = {cdPath};
		try {
			app.run(params, System.in, System.out);
			fail("Not supposed to be able to CD to this folder.");
		} catch (CdException e) {
			
		}
		
		assertEquals(initialDirectory, Environment.currentDirectory);
		
	}
	
	private void testCdExpectSuccess(String initialDirectory, String cdPath, String expectedDirectory) {
		Environment.currentDirectory = initialDirectory;
		
		CdApplication app = new CdApplication();
		String[] params = {cdPath};
		try {
			app.run(params, System.in, System.out);
		} catch (CdException e) {
			fail("Not supposed to have exception for folder that exists.");
		}
		
		assertEquals(expectedDirectory, Environment.currentDirectory);
	}

}
