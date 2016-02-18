package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CatException;

public class CatApplicationTest {
	private static final String[] INPUT_FILE_NAMES = { "input1.txt", "input2.txt" };
	private static final String[] CONTENTS = { 
		"Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in ", 
		"reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
				+ "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa "
				+ "qui officia deserunt mollit anim id est laborum."
	};
	private static CatApplication catApplication;
	
	private OutputStream outStream;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		catApplication = new CatApplication();
		initializeFiles();
	}	
	
	@Before
	public void setup() throws IOException {
		outStream = new ByteArrayOutputStream();
	}
	
	@Test
	public void testCatForOneValidFile() throws CatException {
		String[] files = { INPUT_FILE_NAMES[0] };
		String expected = CONTENTS[0];
		catApplication.run(files, null, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testCatForMultipleValidFiles() throws CatException {
		String expected = "";
		for (int i = 0; i < CONTENTS.length; i++) {
			expected += CONTENTS[i];
		}
		catApplication.run(INPUT_FILE_NAMES, null, outStream);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void shouldThrowCatExceptionWhenCatForOneNonExistentFile() throws CatException {
		thrown.expect(CatException.class);
		thrown.expectMessage("Could not read file");
		
		String[] files = { "input1.txt", "random.txt" };
		catApplication.run(files, null, outStream);
	}
	
	@Test 
	public void shouldThrowCatExceptionWhenCatForNonReadableFile() throws CatException, IOException {
		thrown.expect(CatException.class);
		thrown.expectMessage("Could not read file");
		
		File inputFile = Paths.get(Environment.currentDirectory).resolve("secret.txt").toFile();
		inputFile.createNewFile();
		inputFile.setReadable(false);
		String[] files = { inputFile.getName() };
		catApplication.run(files, null, outStream);
	}
	
	@Test
	public void shouldThrowCatExceptionWhenCatForFolder() throws CatException {
		thrown.expect(CatException.class);
		thrown.expectMessage("This is a directory");
		
		File file = Paths.get(Environment.currentDirectory).toFile();
		String[] files = { file.getName() };
		catApplication.run(files, null, outStream);
	}
	
	@After
	public void tearDown() throws IOException {
		outStream.close();
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		for (int i = 0; i < INPUT_FILE_NAMES.length; i++) {
			File file = Paths.get(Environment.currentDirectory).resolve(INPUT_FILE_NAMES[i]).toFile();
			file.delete();
		}
	}
	
	private static void initializeFiles() throws IOException {
		BufferedWriter writer;
		for (int i = 0; i < INPUT_FILE_NAMES.length; i++) {
			File inputFile = Paths.get(Environment.currentDirectory).resolve(INPUT_FILE_NAMES[i]).toFile();
			writer = new BufferedWriter(new FileWriter(inputFile));
			writer.write(CONTENTS[i]);
			writer.close();
		}
	}
}
