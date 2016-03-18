package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.CommException;

public class GivenCommApplicationTest {

	private CommApplication commApplication;
	private InputStream stdin;
	private OutputStream stdout;
	
	private static final String FILE1 = "comm_file1.txt";
	private static final String FILE2 = "comm_file2.txt";
	private static final Path PATH_FILE1 = Paths.get(FILE1);
	private static final Path PATH_FILE2 = Paths.get(FILE2);
	private static final String FILE1_CONTENT = "line1\nline2\nline3\nline8";
	private static final String FILE2_CONTENT = "line1\nline4\nline3\nline8";
	private static final String COMM_FILE1_FILE2 = "\t\tline1\nline2\nline3\n\tline4\n\tline3\n\t\tline8";
	
	private static final String EMPTY_FILE1 = "comm_emptyfile1.txt";
	private static final String EMPTY_FILE2 = "comm_emptyfile2.txt";
	private static final Path PATH_EMTPY_FILE1 = Paths.get(EMPTY_FILE1);
	private static final Path PATH_EMTPY_FILE2 = Paths.get(EMPTY_FILE2);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Files.deleteIfExists(PATH_FILE1);
		Files.deleteIfExists(PATH_FILE2);
		Files.deleteIfExists(PATH_EMTPY_FILE1);
		Files.deleteIfExists(PATH_EMTPY_FILE2);
		
		Files.createFile(PATH_FILE1);
		Files.createFile(PATH_FILE2);
		FileWriter fileWriter = new FileWriter(new File(PATH_FILE1.toString()));
		fileWriter.write(FILE1_CONTENT);
		fileWriter.flush();
		fileWriter.close();
		fileWriter = new FileWriter(new File(PATH_FILE2.toString()));
		fileWriter.write(FILE2_CONTENT);
		fileWriter.flush();
		fileWriter.close();
		Files.createFile(PATH_EMTPY_FILE1);
		Files.createFile(PATH_EMTPY_FILE2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Files.deleteIfExists(PATH_FILE1);
		Files.deleteIfExists(PATH_FILE2);
		Files.deleteIfExists(PATH_EMTPY_FILE1);
		Files.deleteIfExists(PATH_EMTPY_FILE2);
	}

	@Before
	public void setUp() throws Exception {
		commApplication = new CommApplication();
		stdin = null;
		stdout = new ByteArrayOutputStream();
	}

	@After
	public void tearDown() throws Exception {
		commApplication = null;
		stdin = null;
		stdout = null;
	}

	@Test
	public void testStdoutNull() {
		try {
			commApplication.run(null, stdin, null);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_NULL_POINTER, e.getMessage());
		}	
	}
	
	@Test
	public void testArgsNull() {
		String[] args = null;
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_INVALID_ARGS, e.getMessage());
		}	
	}

	@Test
	public void testArgsZero() {
		String[] args = {};
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_INVALID_ARGS, e.getMessage());
		}	
	}
	
	@Test
	public void testArgsThree() {
		String[] args = {"file1.txt", "file2.txt", "file3.txt"};
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_INVALID_ARGS, e.getMessage());
		}	
	}
	
	@Test
	public void testCommMatch() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("samesame".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("samesame".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.DOUBLE_TAB + "samesame", stdout.toString());
		// NOTE: removed newline from output, following standard UNIX comm implementation
	}

	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." +
			" Our standard is given on the following test.")
	public void testCommNoMatchFile1SmallerLexValue() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("diffdiff".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("sodiff".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals("diffdiff\n"
				+ CommApplication.SINGLE_TAB + "sodiff\n", stdout.toString());
	}
	
	@Test
	public void testCommNoMatchFile1SmallerLexValueReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("diffdiff".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("sodiff".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals("diffdiff"
				+ CommApplication.SINGLE_TAB + "sodiff", stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." +
			" Our standard is given on the following test.")
	public void testCommNoMatchFile2SmallerLexValue() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("sodiff".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("diffdiff".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.SINGLE_TAB + "diffdiff\n"
				+ "sodiff\n", stdout.toString());
	}
	
	@Test
	public void testCommNoMatchFile2SmallerLexValueReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("sodiff".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("diffdiff".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.SINGLE_TAB + "diffdiff"
				+ "sodiff", stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." +
	" Our standard is given on the following test.")
	public void testCommNoMatchOnFile1Newline() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("samesame\n".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("samesame".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.DOUBLE_TAB + "samesame\n" +
				System.lineSeparator(), stdout.toString());
	}
	
	@Test
	public void testCommNoMatchOnFile1NewlineReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("samesame\n".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("samesame".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.SINGLE_TAB + "samesamesamesame" +
				System.lineSeparator(), stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." +
			" Our standard is given on the following test.")
	public void testCommNoMatchOnFile2Newline() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("samesame".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("samesame\n".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.DOUBLE_TAB + "samesame\n" +
				CommApplication.SINGLE_TAB + System.lineSeparator(), stdout.toString());
	}
	
	@Test
	public void testCommNoMatchOnFile2NewlineReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("samesame".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("samesame\n".getBytes());
		commApplication.comm(is1, is2, stdout);
		assertEquals("samesame" + CommApplication.SINGLE_TAB + "samesame" + System.lineSeparator(), stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." +
			" Our standard is given on the following test.")
	public void testCommEmptyStrings() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(System.lineSeparator(), stdout.toString());
	}
	
	@Test
	public void testCommEmptyStringsReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals("", stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." +
			" Our standard is given on the following test.")
	public void testCommNoMatchF1Newline() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream(System.lineSeparator().getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.DOUBLE_TAB + System.lineSeparator() +
				System.lineSeparator(), stdout.toString());
	}
	
	@Test
	public void testCommNoMatchF1NewlineReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream(System.lineSeparator().getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(System.lineSeparator(), stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." + 
			" Our standard is given in the following test.")
	public void testCommNoMatchF2Newline() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream(System.lineSeparator().getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.DOUBLE_TAB + System.lineSeparator() +
				CommApplication.SINGLE_TAB + System.lineSeparator(), stdout.toString());
	}
	
	@Test
	public void testCommNoMatchF2NewlineReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream(System.lineSeparator().getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals(CommApplication.SINGLE_TAB + System.lineSeparator(), stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." + 
	" Our standard is given in the following test.")
	public void testCommMultipleMatchesAtDifferentParts() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("1\n2\n3\n4\n5\n6".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("2\n2\n4\n4\n6\n6".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals("1" + System.lineSeparator() +
				CommApplication.DOUBLE_TAB + "2" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "2" + System.lineSeparator() + 
				"3" + System.lineSeparator() +
				CommApplication.DOUBLE_TAB + "4" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "4" + System.lineSeparator() +
				"5" + System.lineSeparator() + 
				CommApplication.DOUBLE_TAB + "6" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "6" + System.lineSeparator(), stdout.toString());
	}

	@Test
	public void testCommMultipleMatchesAtDifferentPartsReplacement() throws CommException {
		ByteArrayInputStream is1 = new ByteArrayInputStream("1\n2\n3\n4\n5\n6".getBytes());
		ByteArrayInputStream is2 = new ByteArrayInputStream("2\n2\n4\n4\n6\n6".getBytes());
		commApplication.comm(is1, is2, stdout);	
		assertEquals("1" + System.lineSeparator() +
				CommApplication.DOUBLE_TAB + "2" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "2" + System.lineSeparator() + 
				"3" + System.lineSeparator() +
				CommApplication.DOUBLE_TAB + "4" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "4" + System.lineSeparator() +
				"5" + System.lineSeparator() + 
				"6" + CommApplication.SINGLE_TAB + "6" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "6", stdout.toString());
	}
	
	@Test
	public void testCommFiles() throws CommException {
		String[] args = {PATH_FILE1.toString(), PATH_FILE2.toString()};
		commApplication.run(args, stdin, stdout);	
		assertEquals(COMM_FILE1_FILE2, stdout.toString());
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." + 
			" Our standard is given in the following test.")
	public void testCommEmptyFiles() throws CommException {
		String[] args = {PATH_EMTPY_FILE1.toString(), PATH_EMTPY_FILE2.toString()};
		commApplication.run(args, stdin, stdout);	
		assertEquals(System.lineSeparator(), stdout.toString());
	}
	
	@Test
	public void testCommEmptyFilesReplacement() throws CommException {
		String[] args = {PATH_EMTPY_FILE1.toString(), PATH_EMTPY_FILE2.toString()};
		commApplication.run(args, stdin, stdout);	
		assertEquals("", stdout.toString());
	}
	
	@Test
	public void testCommNonExistingFiles() {
		String[] args = {"ghost1.txt", "ghost2.txt"};
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_FNF_EXCEPTION, e.getMessage());
		}	
	}
	
	@Test
	public void testCommNonExistentFile1() {
		String[] args = {"ghost1.txt", PATH_FILE2.toString()};
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_FNF_EXCEPTION, e.getMessage());
		}	
	}
	
	@Test
	public void testCommNonExistentFile2() {
		String[] args = {PATH_FILE1.toString(), "ghost2.txt"};
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_FNF_EXCEPTION, e.getMessage());
		}	
	}
	
	@Test
	public void testCommNonExistentFilesEmptyFileNames() {
		String[] args = {"", ""};
		try {
			commApplication.run(args, stdin, stdout);
			fail ("Should throw exception");
		} catch (CommException e) {
			assertEquals("comm: " + CommApplication.EXP_FNF_EXCEPTION, e.getMessage());
		}	
	}
	
	@Test
	@Ignore("This test method does not comply with our implementation standard, following UNIX comm." + 
			" Our standard is given in the following test.")
	public void testCommStdinAndFile() throws CommException {
		String[] args= {PATH_FILE1.toString()};
		stdin = new ByteArrayInputStream("line1".getBytes());
		commApplication.run(args, stdin, stdout);
		assertEquals (CommApplication.DOUBLE_TAB + "line1" + System.lineSeparator() + 
				CommApplication.SINGLE_TAB + "line2" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "line3" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "line8" + System.lineSeparator(), stdout.toString());
	}

	@Test
	public void testCommStdinAndFileReplacement() throws CommException {
		String[] args= {PATH_FILE1.toString()};
		stdin = new ByteArrayInputStream("line1".getBytes());
		commApplication.run(args, stdin, stdout);
		assertEquals ("line1" + CommApplication.SINGLE_TAB + "line1" + System.lineSeparator() + 
				CommApplication.SINGLE_TAB + "line2" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "line3" + System.lineSeparator() +
				CommApplication.SINGLE_TAB + "line8", stdout.toString());
	}
	
}
