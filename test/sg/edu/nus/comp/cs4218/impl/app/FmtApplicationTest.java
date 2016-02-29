package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.FmtException;
import sg.edu.nus.comp.cs4218.impl.app.FmtApplication.PairOfWordsChunk;

public class FmtApplicationTest {
	
	private static final String[] READABLE_FILES = { "input1.txt" , "input2.txt" };
	
	private static final String[] FILE_1_CONTENTS = {
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, ",
			"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
			"",
			"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
	};
	
	private static final String[] FILE_2_CONTENTS = {
			"TEST",
			"TEST"
	};
	
	private static final String[][] FILE_CONTENTS = {
			FILE_1_CONTENTS, FILE_2_CONTENTS
	};
	
	private static final String EXP_WITH_WIDTH_50 = "Lorem ipsum dolor sit amet, consectetur adipiscing" + System.lineSeparator() + ""
			+ "elit, sed do eiusmod tempor incididunt ut labore" + System.lineSeparator() + ""
			+ "et dolore magna aliqua." + System.lineSeparator() + ""
			+ "" + System.lineSeparator() + ""
			+ "Ut enim ad minim veniam, quis nostrud exercitation" + System.lineSeparator() + ""
			+ "ullamco laboris";

	private static final String EXP_WITH_DEFAULT_WIDTH = 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" + System.lineSeparator() + ""
			+ "incididunt ut labore et dolore magna aliqua." + System.lineSeparator() + ""
			+ "" + System.lineSeparator() + ""
			+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris";
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private static InputStream inStream;
	
	private FmtApplication fmtApplication;
	private OutputStream outStream;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		initializeFiles();
		initializeInputStream();
	}

	@Before
	public void setUp() throws IOException {
		fmtApplication = new FmtApplication();
		outStream = new ByteArrayOutputStream();
		inStream.reset();
	}
	
	@Test
	public void testFmtWithNullArgs() throws FmtException {
		fmtApplication.run(null, inStream, outStream);
		String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" + System.lineSeparator() + "" 
				+ "incididunt ut labore et dolore magna aliqua.";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testFmtWithEmptyArgs() throws FmtException {
		String[] args = {};
		fmtApplication.run(args, inStream, outStream);
		String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" + System.lineSeparator() + "" 
				+ "incididunt ut labore et dolore magna aliqua.";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testFmtWithStdinAndDefaultWidth() throws FmtException {
		fmtApplication.run(null, inStream, outStream);
		String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" + System.lineSeparator() + "" 
				+ "incididunt ut labore et dolore magna aliqua.";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testFmtWithStdinAndInputWidth() throws FmtException {
		String[] args = {"-w", "50"};
		fmtApplication.run(args, inStream, outStream);
		String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing" + System.lineSeparator() + ""
				+ "elit, sed do eiusmod tempor incididunt ut labore" + System.lineSeparator() + ""
				+ "et dolore magna aliqua.";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testFmtWithOneValidFileAndInputWidth() throws FmtException {
		String[] args = {"-w", "50", READABLE_FILES[0]};
		fmtApplication.run(args, null, outStream);
		assertEquals(EXP_WITH_WIDTH_50, outStream.toString());
	}
	
	@Test
	public void testFmtWithOneValidFileAndDefaultWidth() throws FmtException {
		String[] args = {READABLE_FILES[0]};
		fmtApplication.run(args, null, outStream);
		assertEquals(EXP_WITH_DEFAULT_WIDTH, outStream.toString());
	}
	
	@Test
	public void testFmtWithMultipleValidFilesAndInputWidth() throws FmtException {
		String[] args = {"-w", "50", READABLE_FILES[0], READABLE_FILES[1]};
		fmtApplication.run(args, null, outStream);
		String expected = EXP_WITH_WIDTH_50 + "" + System.lineSeparator() + "TEST TEST";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testFmtWithMultipleValidFilesAndDefaultWidth() throws FmtException {
		String[] args = READABLE_FILES;
		fmtApplication.run(args, null, outStream);
		String expected = EXP_WITH_DEFAULT_WIDTH + "" + System.lineSeparator() + "TEST TEST";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testFmtWithNullStdout() throws FmtException {
		thrown.expect(FmtException.class);
		thrown.expectMessage("Null Pointer Exception");
		
		String[] args = READABLE_FILES;
		fmtApplication.run(args, null, null);
	}
	
	@Test
	public void testFmtWithNullStdinAndArgs() throws FmtException {
		thrown.expect(FmtException.class);
		thrown.expectMessage("Null Pointer Exception");
		
		fmtApplication.run(null, null, outStream);
	}
	
	@Test
	public void testFmtWithUnspecifiedWidthArgument() throws FmtException {
		thrown.expect(FmtException.class);
		thrown.expectMessage("Invalid width for -w option");
		
		String[] args = {"-w"};
		fmtApplication.run(args, null, outStream);
	}
	
	@Test
	public void testFmtWithNegativeWidthArgument() throws FmtException {
		thrown.expect(FmtException.class);
		thrown.expectMessage("Invalid command, not a number");
		
		String[] args = {"-w", "-1"};
		fmtApplication.run(args, null, outStream);
	}
	
	@Test
	public void testFmtWithZeroWidthArgument() throws FmtException {
		thrown.expect(FmtException.class);
		thrown.expectMessage("Invalid command, not a number");
		
		String[] args = {"-w", "0"};
		fmtApplication.run(args, null, outStream);
	}
	
	@Test
	public void testFmtWithNonIntegerWidthArgument() throws FmtException {
		thrown.expect(FmtException.class);
		thrown.expectMessage("Invalid command, not a number");
		
		String[] args = {"-w", "text"};
		fmtApplication.run(args, null, outStream);
	}
	
	@Test
	public void testFormatLinesWithMultipleLongParagaphs() {
		List<String> lineCollections = Arrays.asList(FILE_1_CONTENTS);
		int width = 50;
		List<String> results = fmtApplication.formatLines(lineCollections, width);
		assertEquals(6, results.size());
		assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing", results.get(0));
		assertEquals("elit, sed do eiusmod tempor incididunt ut labore", results.get(1));
		assertEquals("et dolore magna aliqua.", results.get(2));
		assertEquals("", results.get(3));
		assertEquals("Ut enim ad minim veniam, quis nostrud exercitation", results.get(4));
		assertEquals("ullamco laboris", results.get(5));
	}
	
	@Test
	public void testFormatLinesWithLinesShorterThanWidth() {
		List<String> lineCollections = new ArrayList<String>();
		String expectedLine = "";
		for (int i = 0; i < 10; i ++) {
			lineCollections.add("TEST");
			expectedLine += "TEST ";
		}
		List<String> results = fmtApplication.formatLines(lineCollections, 50);
		assertEquals(1, results.size());
		assertEquals(expectedLine.trim(), results.get(0));
	}
	
	@Test
	public void testAccumulateIntoParagraphs() {
		List<String> lineCollections = Arrays.asList(FILE_1_CONTENTS);
		List<String> paragraphs = fmtApplication.accumulateIntoParagraphs(lineCollections);
		assertEquals(3, paragraphs.size());
		assertEquals(FILE_1_CONTENTS[0] + FILE_1_CONTENTS[1], paragraphs.get(0));
		assertEquals(FILE_1_CONTENTS[2], paragraphs.get(1));
		assertEquals(FILE_1_CONTENTS[3], paragraphs.get(2));
	}
	
	@Test
	public void testWordChunksResultForBreakLineWithOneShortWord() {
		String word = "test";
		List<String> result = fmtApplication.breakLine(word, 20);
		assertEquals(1, result.size());
		assertEquals(word, result.get(0));
	}
	
	@Test
	public void testWordChunksResultForBreakLineWithOneLongWord() {
		String word = "This-is-a-very-long-sentence-in-a-test";
		List<String> result = fmtApplication.breakLine(word, 20);
		assertEquals(1, result.size());
		assertEquals(word, result.get(0));	
	}
	
	@Test
	public void testWordChunksResultForBreakLineWithEmptyString() {
		String word = "";
		List<String> result = fmtApplication.breakLine(word, 20);
		assertEquals(1, result.size());
		assertEquals(word, result.get(0));	
	}
	
	@Test
	public void testWordChunksResultForBreakLineWithMultipleWords() {
		String words = FILE_1_CONTENTS[0];
		List<String> result = fmtApplication.breakLine(words, 20);
		assertEquals(3, result.size());
		assertEquals("Lorem ipsum dolor", result.get(0));
		assertEquals("sit amet,", result.get(1));
		assertEquals("consectetur", result.get(2));
	}
	
	@Test
	public void testWordResidueForBreakLineWithMultipleWords() {
		String words = FILE_1_CONTENTS[0];
		fmtApplication.breakLine(words, 20);
		assertEquals("adipiscing elit, ", fmtApplication.getResidue());
	}
	
	@Test
	public void testBreakChunksOfWordsIntoTwoParts() {
		String words = FILE_1_CONTENTS[0];
		int width = 11;
		String expFirstChunk = words.substring(0, width + 1);
		String expSecondChunk = words.substring(width + 1);
		PairOfWordsChunk wordsChunk = fmtApplication.breakChunkOfWordsIntoTwoParts(words, width);
		assertEquals(expFirstChunk, wordsChunk.getFirstChunk());
		assertEquals(expSecondChunk, wordsChunk.getSecondChunk());
	}
	
	@After
	public void tearDown() throws IOException {
		outStream.close();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws IOException {
		deleteAllFiles();
		inStream.close();
	}
	
	private static void initializeFiles() throws IOException {
		BufferedWriter writer;
		for (int i = 0; i < READABLE_FILES.length; i++) {
			File inputFile = Paths.get(Environment.currentDirectory).resolve(READABLE_FILES[i]).toFile();
			writer = new BufferedWriter(new FileWriter(inputFile));
			for (int j = 0; j < FILE_CONTENTS[i].length; j++) {
				writer.write(FILE_CONTENTS[i][j]);
				if (j < FILE_CONTENTS[i].length - 1) {
					writer.write("" + System.lineSeparator() + "");
				}
			}
			writer.close();
		}
	}
	
	private static void deleteAllFiles() {
		for (int i = 0; i < READABLE_FILES.length; i++) {
			File file = Paths.get(Environment.currentDirectory).resolve(READABLE_FILES[i]).toFile();
			file.delete();
		}
	}
	
	private static void initializeInputStream() {
		String input = FILE_1_CONTENTS[0] + FILE_1_CONTENTS[1];
		inStream = new ByteArrayInputStream(input.getBytes());
	}

}
