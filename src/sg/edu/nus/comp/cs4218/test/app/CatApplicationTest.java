package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
	private InputStream stdin;
	private OutputStream stdout;
	private Path currentDir;

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
		stdin = null;
		stdout = null;
		currentDir = Paths.get(Environment.currentDirectory);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void writeToFileTest() throws CatException, IOException {
		args = new String[] {currentDir.resolve("littleredridinghood.txt")
				.toString() };
		File out = new File("test.txt");
		out.createNewFile();
		stdout = new FileOutputStream(out);
		byte[] expected = Files.readAllBytes(currentDir
				.resolve("littleredridinghood.txt"));
		catApp.run(args, System.in, stdout);
		assertArrayEquals(expected, Files.readAllBytes(Paths.get(out
				.getAbsolutePath())));
		out.delete();
	}
	
	@Rule
	//public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Test
	public void writeToSystemOutTest() throws CatException, IOException {
	}
}
