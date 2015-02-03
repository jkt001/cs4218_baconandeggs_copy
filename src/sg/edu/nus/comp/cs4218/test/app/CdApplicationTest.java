package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CdException;
import sg.edu.nus.comp.cs4218.impl.app.CdApplication;

public class CdApplicationTest {
	
	private static final String MESSAGE_FAIL = "Not supposed to succeed.";
	
	CdApplication app;

	@Before
	public void setUp() throws Exception {
		app = new CdApplication();
	}
	
	// Test null parameters
	@Test
	public void testNullParams() {
		CdApplication app = new CdApplication();
		String[] params = null;
		try {
			app.run(params, System.in, System.out);
			fail(MESSAGE_FAIL);
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
			fail(MESSAGE_FAIL);
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
			fail(MESSAGE_FAIL);
		} catch (CdException e) {
			
		}
	}
	
	// Test two parameters
	@Test
	public void testTwoParams() {
		
		String[] params = {"a", "b"};
		try {
			app.run(params, System.in, System.out);
			fail(MESSAGE_FAIL);
		} catch (CdException e) {
			
		}
	}

	// Test folder that exists, absolute path
	@Test
	public void testSimpleAbsolutePathThatExists() {
		assumeTrue(isWindows());
		testCdExpectSuccess(getUserDir(), "C:\\", "C:\\");
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testAbsolutePathWithOneFolderThatExists() {
		assumeTrue(isWindows());
		testCdExpectSuccess(getUserDir(), "C:\\Windows", "C:\\Windows");
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testAbsolutePathWithOneFolderWithExtraSlashThatExists() {
		assumeTrue(isWindows());
		testCdExpectSuccess(getUserDir(), "C:\\Windows\\", "C:\\Windows");
	}
	
	// Test folder that does not exist, absolute path
	@Test
	public void testNonExistentAbsolutePath() {
		assumeTrue(isWindows());
		testCdExpectFailure(getUserDir(), "C:\\InvalidDir");
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathToParent() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows", "..", "C:\\");
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathUpTwoLevels() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows\\System32", "..\\..", "C:\\");
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathToParentAndSubdirectory() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows\\System32", "..\\System", "C:\\Windows\\System");
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRootRelativePath() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows", "\\", "C:\\");
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRootRelativePathWithSubdirectory() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows", "\\Users", "C:\\Users");
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRoot() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\", "..", "C:\\");
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRootByGoingUpTwoLevels() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows", "..\\..", "C:\\");
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRootByRootAndParent() {
		assumeTrue(isWindows());
		testCdExpectSuccess("C:\\Windows", "\\..", "C:\\");
	}
	
	@Test
	public void testRunCdDirWithNoPermissionsToCdTo() {
		assumeTrue(isWindows());
		CdApplication app = new CdApplication();
		String[] params = {"C:\\System Volume Information"};
		try {
			app.run(params, System.in, System.out);
		} catch (CdException e) {
			System.out.println(e.getMessage());
		}
		testCdExpectFailure("C:\\", "C:\\System Volume Information");
	}
	
	@Test
	public void testDirectoryWithNoPermissionsToListContentsOf() {
		assumeTrue(isWindows());
		CdApplication app = new CdApplication();
		String[] params = {"C:\\$RECYCLE.BIN"};
		try {
			app.run(params, System.in, System.out);
		} catch (CdException e) {
			System.out.println(e.getMessage());
		}
		testCdExpectSuccess("C:\\", "C:\\$RECYCLE.BIN", "C:\\$RECYCLE.BIN");		
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
	
	public boolean isWindows(){
		if (System.getProperty("os.name").startsWith("Windows")) {
			return true;
		}
		return false;
	}
	
	private String getUserDir() {
		return System.getProperty("user.dir");
	}

}
