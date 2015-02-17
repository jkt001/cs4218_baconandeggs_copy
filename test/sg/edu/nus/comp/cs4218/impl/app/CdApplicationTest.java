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

import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CdException;
import sg.edu.nus.comp.cs4218.impl.app.CdApplication;

public class CdApplicationTest {
	
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
		app = new CdApplication();
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
			testCdExpectSuccess(getUserDir(), "/BlaaBlaaBlaa", "/BlaaBlaaBlaa");
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
			testCdExpectFailure(WIN_DRIVE_ROOT, "C:\\System Volume Information");
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
			testCdExpectSuccess(WIN_DRIVE_ROOT, "C:\\$RECYCLE.BIN", "C:\\$RECYCLE.BIN");
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
	
	private String getUserDir() {
		return System.getProperty("user.dir");
	}

}
