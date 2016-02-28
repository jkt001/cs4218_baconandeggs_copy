package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.SortException;

public class SortApplicationTest {
	
	private static SortApplication sortApplication;
	private static InputStream inStream;
	private OutputStream outStream;
	
	private static final String[] READABLE_FILES = { 
		"resources/sort/input/sortAllNumbers.txt", 
		"resources/sort/input/sortAllNoNumbers.txt",
		"resources/sort/input/sortAllNumbersLarge.txt",
		"resources/sort/input/sortMixNumbersAndStrings.txt",
		"resources/sort/input/sortStringWithNumbers.txt",
		"resources/sort/input/sortWithEmptyString.txt"
	};
	
	private static final String[] EXPECTED_FILES = {
		"resources/sort/output/sortAllNumbersExpected.txt", 
		"resources/sort/output/numericalSortAllNumbersExpected.txt", 
		"resources/sort/output/sortAllNoNumbersExpected.txt",
		"resources/sort/output/numericalSortAllNoNumbersExpected.txt",
		"resources/sort/output/sortAllNumbersLargeExpected.txt",
		"resources/sort/output/numericalSortAllNumbersLargeExpected.txt",
		"resources/sort/output/sortMixNumbersAndStringsExpected.txt",
		"resources/sort/output/numericalSortMixNumbersAndStringsExpected.txt",
		"resources/sort/output/sortStringWithNumbersExpected.txt",
		"resources/sort/output/numericalSortStringWithNumbersExpected.txt",
		"resources/sort/output/sortWithEmptyStringExpected.txt",
		"resources/sort/output/numericalSortWithEmptyStringExpected.txt"
	};
	
	private static final String[] CONTENTS = { 
		"this file contains strings mixed with numbers 8888 111 zzz like that",
		"123459999string",
		"123459998string",
		"-99999998string",
		"-99999999string",
		"-10000000000000000000100string",
		"-10000000000000000000101string",
		"-99999998",
		"-99999999",
		"-10000000000000000000000",
		"-10000000000000000000001",
		"88888888888888888888888888888888888888 very large number",
		"77777777777777777777777777777777777777 another very large number",
		"88888888888888888888888888888888888888",
		"77777777777777777777777777777777777777",
		"hello it's me",
		"hello world 123",
		"123 hello world"
	};
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		sortApplication = new SortApplication();
		initializeInputStream();
	}	
	
	@Before
	public void setup() throws IOException {
		outStream = new ByteArrayOutputStream();
		inStream.reset();
	}
	
	@Test
	public void testSortUsingInputStream() throws SortException, IOException {
		String[] args = {};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[8]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingInputStream() throws SortException, IOException {
		String[] args = {"-n"};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[9]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSortUsingFileWithAllNumbers() throws SortException, IOException {
		String[] args = {READABLE_FILES[0]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[0]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingFileWithAllNumbers() throws SortException, IOException {
		String[] args = {"-n", READABLE_FILES[0]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[1]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSortUsingFileWithNoNumbers() throws SortException, IOException {
		String[] args = {READABLE_FILES[1]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[2]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingFileWithNoNumbers() throws SortException, IOException {
		String[] args = {"-n", READABLE_FILES[1]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[3]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSortUsingFileWithLargeNumbers() throws SortException, IOException {
		String[] args = {READABLE_FILES[2]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[4]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingFileWithLargeNumbers() throws SortException, IOException {
		String[] args = {"-n", READABLE_FILES[2]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[5]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSortUsingFileWithNumbersAndStrings() throws SortException, IOException {
		String[] args = {READABLE_FILES[3]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[6]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingFileWithNumbersAndStrings() throws SortException, IOException {
		String[] args = {"-n", READABLE_FILES[3]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[7]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSortUsingFileWithStringWithNumbers() throws SortException, IOException {
		String[] args = {READABLE_FILES[4]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[8]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingFileWithStringWithNumbers() throws SortException, IOException {
		String[] args = {"-n", READABLE_FILES[4]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[9]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testSortUsingFileWithEmptyString() throws SortException, IOException {
		String[] args = {READABLE_FILES[5]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[10]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testNumericalSortUsingFileWithEmptyString() throws SortException, IOException {
		String[] args = {"-n", READABLE_FILES[5]};
		sortApplication.run(args, inStream, outStream);
		String expected = getFileContents(EXPECTED_FILES[11]);
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void shouldThrowExceptionForNonExistentFile() throws SortException, IOException {
		thrown.expect(SortException.class);
		thrown.expectMessage("Could not read file");
		
		String[] args = {"-n", "idontexist.txt"};
		sortApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionForUnsupportedOption() throws SortException, IOException {
		thrown.expect(SortException.class);
		thrown.expectMessage("Unsupported option :-x");
		
		String[] args = {"-x", "dummyfile.txt"};
		sortApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void shouldThrowExceptionForInvalidArgumentLength() throws SortException, IOException {
		thrown.expect(SortException.class);
		thrown.expectMessage("Too many arguments specified");
		
		String[] args = {"-x", "dummyfile.txt", "dummyinput"};
		sortApplication.run(args, inStream, outStream);
	}
	
	@Test
	public void testSortSimpleStringMethod() throws SortException, IOException {
		List<String> result = sortApplication.sortStringsSimple(CONTENTS);
		String expected = getFileContents(EXPECTED_FILES[8]);
		StringBuilder actual = new StringBuilder();
		for (String sorted : result) {
			actual.append(sorted);
			actual.append(System.lineSeparator());
		}
		
		assertEquals(expected, actual.toString());
		
	}
	
	@Test
	public void testNumericalSortSimpleStringMethod() throws SortException, IOException {
		List<String> result = sortApplication.numericalSortStringsSimple(CONTENTS);
		String expected = getFileContents(EXPECTED_FILES[9]);
		StringBuilder actual = new StringBuilder();
		for (String sorted : result) {
			actual.append(sorted);
			actual.append(System.lineSeparator());
		}
		
		assertEquals(expected, actual.toString());
		
	}
	
	@After
	public void tearDown() throws IOException {
		outStream.close();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws IOException {
		inStream.close();
	}
	
	private String getFileContents(String filePath) throws IOException {

		String inputFile = Paths.get(Environment.currentDirectory).resolve(filePath).toString();
	   
	    FileInputStream fileInStream = new FileInputStream(inputFile);
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(fileInStream));

		StringBuilder fileContents = new StringBuilder();
		String nextLine = buffReader.readLine();

		while (nextLine != null) {
			NumericString toBeAdded = new NumericString(nextLine);
			fileContents.append(toBeAdded);
			fileContents.append(System.lineSeparator());
			nextLine = buffReader.readLine();
		}
        
		buffReader.close();
        
        return fileContents.toString();
	}

	private static void initializeInputStream() {
		StringBuilder input = new StringBuilder();
		for (String inputString : CONTENTS) {
			input.append(inputString);
			input.append(System.lineSeparator());
		}
		inStream = new ByteArrayInputStream(input.toString().getBytes());
	}

}
