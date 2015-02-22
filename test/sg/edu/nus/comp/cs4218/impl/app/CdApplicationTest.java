package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;
import static sg.edu.nus.comp.cs4218.OSCheck.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.WindowsPermission;
import sg.edu.nus.comp.cs4218.exception.CdException;
import sg.edu.nus.comp.cs4218.impl.app.CdApplication;

public class CdApplicationTest {
	
	private static final String PROPERTY_USER_DIR = System.getProperty("user.dir");
	
	private static final String PARENT_DIR = "..";
	private static final String WIN_GRANDPARENT = "..\\..";
	private static final String UNIX_GRANDPARENT = "../..";

	private static final String UNIX_VAR_DIR = "/var";
	private static final String MAC_SYSTEM_DIR = "/System";
	private static final String WIN_WINDOWS_DIR = "C:\\Windows";
	private static final String UNIX_ROOT = "/";
	private static final String WIN_DRIVE_ROOT = "C:\\";
	
	CdApplication app;

	@Before
	public void setUp() throws Exception {
		// Set current directory to standard current working directory
		Environment.currentDirectory = PROPERTY_USER_DIR;
		
		app = new CdApplication();
	}
	
	@After
	public void tearDown() throws Exception {
		// Set current directory to standard current working directory
		Environment.currentDirectory = PROPERTY_USER_DIR;
	}


	// Test folder that exists, absolute path
	@Test
	public void testSimpleAbsolutePathThatExists() {
		if (isWindows()) {
			testCdExpectSuccess(getUserDir(), WIN_DRIVE_ROOT, WIN_DRIVE_ROOT);
		}else{
			testCdExpectSuccess(getUserDir(), UNIX_ROOT, UNIX_ROOT);
		}
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testAbsolutePathWithOneFolderThatExists() {
		if (isWindows()) {
			testCdExpectSuccess(getUserDir(), WIN_WINDOWS_DIR, WIN_WINDOWS_DIR);
		}else if (isMac()){
			testCdExpectSuccess(getUserDir(), MAC_SYSTEM_DIR, MAC_SYSTEM_DIR);
		}else{
			testCdExpectSuccess(getUserDir(), UNIX_VAR_DIR, UNIX_VAR_DIR);
		}
	}
	
	// Test folder that exists, absolute path
	@Test
	public void testAbsolutePathWithOneFolderWithExtraSlashThatExists() {
		if (isWindows()) {
			testCdExpectSuccess(getUserDir(), WIN_WINDOWS_DIR+"\\", WIN_WINDOWS_DIR);
		}else if (isMac()){
			testCdExpectSuccess(getUserDir(), MAC_SYSTEM_DIR+"/", MAC_SYSTEM_DIR);
		}else{
			testCdExpectSuccess(getUserDir(), UNIX_VAR_DIR+"/", UNIX_VAR_DIR);
		}
	}
	
	// Test folder that does not exist, absolute path
	@Test
	public void testNonExistentAbsolutePath() {		
		if (isWindows()) {
			testCdExpectFailure(getUserDir(), "C:\\InvalidDir");
		}else{
			testCdExpectFailure(getUserDir(), "/BlaaBlaaBlaa");
		}
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathToParent() {
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR, PARENT_DIR, WIN_DRIVE_ROOT);
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR, PARENT_DIR, UNIX_ROOT);
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR, PARENT_DIR, UNIX_ROOT);
		}
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathUpTwoLevels() {
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR+"\\System32", WIN_GRANDPARENT, WIN_DRIVE_ROOT);
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR+"/Library", UNIX_GRANDPARENT, UNIX_ROOT);
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR+"/tmp", UNIX_GRANDPARENT, UNIX_ROOT);
		}
	}
	
	// Test folder that exists, relative subdirectory
	@Test
	public void testRelativePathToParentAndSubdirectory() {
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR+"\\System32", "..\\System", "C:\\Windows\\System");
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR+"/Library", UNIX_GRANDPARENT, UNIX_ROOT); //TODO: Blaa blaa
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR+"/tmp", "../log", "/var/log");
		}
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRootRelativePath() {		
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR, "\\", WIN_DRIVE_ROOT);
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR, UNIX_ROOT, UNIX_ROOT);
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR, UNIX_ROOT, UNIX_ROOT);
		}
	}
	
	// Test folder that exists, root-relative subdirectory
	@Test
	public void testRootRelativePathWithSubdirectory() {		
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR, "\\Users", "C:\\Users");
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR, "/Applications", "/Applications");
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR, "/usr", "/usr");
		}
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRoot() {		
		if (isWindows()) {
			testCdExpectSuccess(WIN_DRIVE_ROOT, PARENT_DIR, WIN_DRIVE_ROOT);
		}else{
			testCdExpectSuccess(UNIX_ROOT, PARENT_DIR, UNIX_ROOT);
		}
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRootByGoingUpTwoLevels() {
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR, WIN_GRANDPARENT, WIN_DRIVE_ROOT);
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR, UNIX_GRANDPARENT, UNIX_ROOT);
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR, UNIX_GRANDPARENT, UNIX_ROOT);
		}
	}
	
	// Test cd to beyond root of drive
	@Test
	public void testRelativePathBeyondRootByRootAndParent() {
		if (isWindows()) {
			testCdExpectSuccess(WIN_WINDOWS_DIR, "\\..", WIN_DRIVE_ROOT);
		}else if (isMac()){
			testCdExpectSuccess(MAC_SYSTEM_DIR, "/..", UNIX_ROOT);
		}else{
			testCdExpectSuccess(UNIX_VAR_DIR, "/..", UNIX_ROOT);
		}
	}
	
	// Test disabled because it seems impossible in Java to check the 
	// effective permission for whether one can CD into a directory
	/*
	@Test
	public void testRunCdDirWithNoPermissionsToCdTo() throws IOException {

		String tempFolderName = "testCdApplicationTempDir";
		Path tempFolderPath = FileSystems.getDefault().getPath(
				PROPERTY_USER_DIR, tempFolderName);

		if (isWindows()) {
			// Create directory with no permissions to CD into.
			// In Windows, this is equivalent to removing the
			// execute permission on the Windows ACL.
			Files.createDirectory(tempFolderPath);
			WindowsPermission.setExecutable(tempFolderPath, false);

			testCdExpectFailure(UNIX_ROOT, tempFolderPath.normalize()
					.toString());

			WindowsPermission.setExecutable(tempFolderPath, true);
			Files.deleteIfExists(tempFolderPath);
		} else {
			// Create directory with no permissions to CD into.
			// In POSIX operating systems this is denoted by the
			// lack of execute bit on that directory
			Set<PosixFilePermission> perms = PosixFilePermissions
					.fromString("rw-rw----");
			FileAttribute<Set<PosixFilePermission>> attributes = PosixFilePermissions
					.asFileAttribute(perms);

			Files.createDirectory(tempFolderPath, attributes);

			testCdExpectFailure(UNIX_ROOT, tempFolderPath.normalize()
					.toString());

			Files.deleteIfExists(tempFolderPath);

		}
	}*/
	
	@Test
	public void testDirectoryWithNoPermissionsToListContentsOf()
			throws IOException {
		
		if (isWindows()) {
			// Create directory with no permissions to list contents of.
			// In Windows, this is equivalent to removing the read permission
			// on the Windows ACL.

			String tempFolderName = "testCdApplicationTempDir";
			Path tempFolderPath = FileSystems.getDefault().getPath(
					PROPERTY_USER_DIR, tempFolderName);

			Files.createDirectory(tempFolderPath);
			WindowsPermission.setReadable(tempFolderPath, false);

			testCdExpectFailure(UNIX_ROOT, tempFolderPath.normalize()
					.toString());

			WindowsPermission.setReadable(tempFolderPath, true);
			Files.deleteIfExists(tempFolderPath);
		} else {
			// Create directory with no permissions to list contents of.
			// In POSIX operating systems this is denoted by the lack of
			// read bit on that directory

			String tempFolderName = "testCdApplicationTempDir";
			Path tempFolderPath = FileSystems.getDefault().getPath(
					PROPERTY_USER_DIR, tempFolderName);

			Set<PosixFilePermission> perms = PosixFilePermissions
					.fromString("-wx-wx---");
			FileAttribute<Set<PosixFilePermission>> attributes = PosixFilePermissions
					.asFileAttribute(perms);
			Files.createDirectory(tempFolderPath, attributes);

			testCdExpectSuccess(UNIX_ROOT, tempFolderPath.normalize()
					.toString(), tempFolderPath.normalize().toString());

			Files.deleteIfExists(tempFolderPath);
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
			fail("Not supposed to have exception for folder.");
		}
		
		assertEquals(expectedDirectory, Environment.currentDirectory);
	}
	
	private String getUserDir() {
		return PROPERTY_USER_DIR;
	}

}
