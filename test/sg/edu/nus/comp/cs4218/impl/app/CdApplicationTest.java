package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;
import static org.junit.Assume.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

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
		if (isWindows()) {
			testCdExpectSuccess(getUserDir(), "C:\\", "C:\\");
		}else{
			testCdExpectSuccess(getUserDir(), "/", "/");
		}
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testAbsolutePathWithOneFolderThatExists() {
		if (isWindows()) {
			testCdExpectSuccess(getUserDir(), "C:\\Windows", "C:\\Windows");
		}else if (isMac()){
			testCdExpectSuccess(getUserDir(), "/System", "/System");
		}else{
			testCdExpectSuccess(getUserDir(), "/var", "/var");
		}
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testAbsolutePathWithOneFolderWithExtraSlashThatExists() {
		if (isWindows()) {
			testCdExpectSuccess(getUserDir(), "C:\\Windows\\", "C:\\Windows");
		}else if (isMac()){
			testCdExpectSuccess(getUserDir(), "/System/", "/System");
		}else{
			testCdExpectSuccess(getUserDir(), "/var/", "/var");
		}
	}
	
	// Test folder that does not exist, absolute path
	@Test
	public void testNonExistentAbsolutePath() {		
		if (isWindows()) {
			testCdExpectFailure(getUserDir(), "C:\\InvalidDir");
		}else{
			testCdExpectSuccess(getUserDir(), "/BlaaBlaaBlaa", "/BlaaBlaaBlaa");
		}
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathToParent() {
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows", "..", "C:\\");
		}else if (isMac()){
			testCdExpectSuccess("/System/", "..", "/");
		}else{
			testCdExpectSuccess("/var/", "..", "/");
		}
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathUpTwoLevels() {
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows\\System32", "..\\..", "C:\\");
		}else if (isMac()){
			testCdExpectSuccess("/System/Library", "../..", "/");
		}else{
			testCdExpectSuccess("/var/tmp", "../..", "/");
		}
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathToParentAndSubdirectory() {
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows\\System32", "..\\System", "C:\\Windows\\System");
		}else if (isMac()){
			testCdExpectSuccess("/System/Library", "../..", "/"); //TODO: Blaa blaa
		}else{
			testCdExpectSuccess("/var/tmp", "../log", "/var/log");
		}
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRootRelativePath() {		
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows", "\\", "C:\\");
		}else if (isMac()){
			testCdExpectSuccess("/System", "/", "/");
		}else{
			testCdExpectSuccess("/var", "/", "/");
		}
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRootRelativePathWithSubdirectory() {		
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows", "\\Users", "C:\\Users");
		}else if (isMac()){
			testCdExpectSuccess("/System", "/Applications", "/Applications");
		}else{
			testCdExpectSuccess("/var", "/usr", "/usr");
		}
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRoot() {		
		if (isWindows()) {
			testCdExpectSuccess("C:\\", "..", "C:\\");
		}else{
			testCdExpectSuccess("/", "..", "/");
		}
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRootByGoingUpTwoLevels() {
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows", "..\\..", "C:\\");
		}else if (isMac()){
			testCdExpectSuccess("/System", "../..", "/");
		}else{
			testCdExpectSuccess("/var", "../..", "/");
		}
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRootByRootAndParent() {
		if (isWindows()) {
			testCdExpectSuccess("C:\\Windows", "\\..", "C:\\");
		}else if (isMac()){
			testCdExpectSuccess("/System", "/..", "/");
		}else{
			testCdExpectSuccess("/var", "/..", "/");
		}
	}
	
	@Test
	public void testRunCdDirWithNoPermissionsToCdTo() {
				
		if (isWindows()){
			CdApplication app = new CdApplication();
			String[] params = {"C:\\System Volume Information"};
			try {
				app.run(params, System.in, System.out);
			} catch (CdException e) {
				System.out.println(e.getMessage());
			}
			testCdExpectFailure("C:\\", "C:\\System Volume Information");
		}else{
			// Create directory with no permissions to CD into
			// in POSIX operating systems this is denoted by the
			// lack of execute bit on that directory
			
			String tempFolderName = "testCdApplicationTempDir";
			Path tempFolderPath = FileSystems.getDefault().getPath(System.getProperty("user.dir"), tempFolderName);
			
			Set<PosixFilePermission> perms =
				    PosixFilePermissions.fromString("rw-rw----");
				FileAttribute<Set<PosixFilePermission>> attributes =
				    PosixFilePermissions.asFileAttribute(perms);
			try {
				Files.createDirectory(tempFolderPath, attributes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			testCdExpectFailure(".", tempFolderPath.normalize().toString());
			
			try {
				Files.deleteIfExists(tempFolderPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testDirectoryWithNoPermissionsToListContentsOf() {
		if (isWindows()){
			CdApplication app = new CdApplication();
			String[] params = {"C:\\$RECYCLE.BIN"};
			try {
				app.run(params, System.in, System.out);
			} catch (CdException e) {
				System.out.println(e.getMessage());
			}
			testCdExpectSuccess("C:\\", "C:\\$RECYCLE.BIN", "C:\\$RECYCLE.BIN");
		}else{
			// Create directory with no permissions to list contents of
			// in POSIX operating systems this is denoted by the lack of 
			// read bit on that directory
			
			String tempFolderName = "testCdApplicationTempDir";
			Path tempFolderPath = FileSystems.getDefault().getPath(System.getProperty("user.dir"), tempFolderName);
			
			Set<PosixFilePermission> perms =
				    PosixFilePermissions.fromString("-w--w----");
				FileAttribute<Set<PosixFilePermission>> attributes =
				    PosixFilePermissions.asFileAttribute(perms);
			try {
				Files.createDirectory(tempFolderPath, attributes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			testCdExpectSuccess(".", tempFolderPath.normalize().toString(), tempFolderPath.normalize().toString());
			
			try {
				Files.deleteIfExists(tempFolderPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
	
	public boolean isMac(){
		if (System.getProperty("os.name").startsWith("Mac OS X")) {
			return true;
		}
		return false;
	}
	
	public boolean isLinux(){
		if (System.getProperty("os.name").startsWith("Linux")) {
			return true;
		}
		return false;
	}
	
	private String getUserDir() {
		return System.getProperty("user.dir");
	}

}
