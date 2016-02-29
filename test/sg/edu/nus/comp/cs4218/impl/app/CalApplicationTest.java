package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CalException;

public class CalApplicationTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private CalApplication calApplication;
	
	@Before
	public void setUp() {
		calApplication = new CalApplication();
	}

	@After
	public void tearDown() {
		calApplication = null;
	}
	
	// Tests for printCal
	@Test
	public void testPrintCalForCurrentMonth() throws IOException {
		String[] args = {};
		Calendar calendar = new GregorianCalendar();
		int month = calendar.get(Calendar.MONTH);
		String expected = generateCalendar(determineFile(month, false));
		String actual = calApplication.printCal(args);
		assertEquals(expected, actual);
	}
	
	// Tests for printCalMondayFirst
	@Test
	public void testPrintCalWithMondayFirst() throws IOException {
		String[] args = {};
		Calendar calendar = new GregorianCalendar();
		int month = calendar.get(Calendar.MONTH);
		String expected = generateCalendar(determineFile(month, true));
		String actual = calApplication.printCalWithMondayFirst(args);
		assertEquals(expected, actual);
	}
	
	// Tests for printCalForMonthYear
	@Test
	public void testPrintCalForMonthYear() throws IOException {
		String[] args = { "12", "2016" };
		int month = Integer.parseInt(args[0]) - 1;
		String expected = generateCalendar(determineFile(month, false));
		String actual = calApplication.printCalForMonthYear(args);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenMonthIsNotNumber() {
		thrown.expect(CalException.class);
		
		String[] args = { "month", "2016" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenMonthIsNotInteger() {
		thrown.expect(CalException.class);
		
		String[] args = { "1.5", "2016" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenMonthIsZero() {
		thrown.expect(CalException.class);
		
		String[] args = { "0", "2016" };
		calApplication.printCalForMonthYear(args);
	}

	@Test
	public void testPrintCalForMonthYearWhenMonthIsNegative() {
		thrown.expect(CalException.class);
		
		String[] args = { "-1", "2016" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenMonthIsTooBig() {
		thrown.expect(CalException.class);
		
		String[] args = { "13", "2016" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenYearIsNotNumber() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "year" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenYearIsNotInteger() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "1.5" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenYearIsZero() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "0" };
		calApplication.printCalForMonthYear(args);
	}
	
	@Test
	public void testPrintCalForMonthYearWhenYearIsNegative() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "-1" };
		calApplication.printCalForMonthYear(args);
	}
	
	//Tests for printCalForMonthYearMondayFirst
	@Test
	public void testPrintCalForMonthYearMondayFirst() throws IOException {
		String[] args = { "12", "2016" };
		int month = Integer.parseInt(args[0]) - 1;
		String expected = generateCalendar(determineFile(month, true));
		String actual = calApplication.printCalForMonthYearMondayFirst(args);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenMonthIsNotNumber() {
		thrown.expect(CalException.class);
		
		String[] args = { "month", "2016" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenMonthIsNotInteger() {
		thrown.expect(CalException.class);
		
		String[] args = { "1.5", "2016" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenMonthIsZero() {
		thrown.expect(CalException.class);
		
		String[] args = { "0", "2016" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}

	@Test
	public void testPrintCalForMonthYearMondayFirstWhenMonthIsNegative() {
		thrown.expect(CalException.class);
		
		String[] args = { "-1", "2016" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenMonthIsTooBig() {
		thrown.expect(CalException.class);
		
		String[] args = { "13", "2016" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenYearIsNotNumber() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "year" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenYearIsNotInteger() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "1.5" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenYearIsZero() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "0" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForMonthYearMondayFirstWhenYearIsNegative() {
		thrown.expect(CalException.class);
		
		String[] args = { "11", "-1" };
		calApplication.printCalForMonthYearMondayFirst(args);
	}
	
	//Tests for printCalForYear
	@Test
	public void testPrintCalForYear() throws IOException {
		String[] args = { "2016" };
		String file = "16.txt";
		String expected = generateCalendar(file);
		String actual = calApplication.printCalForYear(args);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintCalForYearWhenYearIsNotNumber() {
		thrown.expect(CalException.class);
		
		String[] args = { "year" };
		calApplication.printCalForYear(args);
	}
	
	@Test
	public void testPrintCalForYearWhenYearIsNotInteger() {
		thrown.expect(CalException.class);
		
		String[] args = { "1.5" };
		calApplication.printCalForYear(args);
	}
	
	@Test
	public void testPrintCalForYearWhenYearIsZero() {
		thrown.expect(CalException.class);
		
		String[] args = { "0" };
		calApplication.printCalForYear(args);
	}
	
	@Test
	public void testPrintCalForYearWhenYearIsNegative() {
		thrown.expect(CalException.class);
		
		String[] args = { "-1" };
		calApplication.printCalForYear(args);
	}
	
	//Tests for printCalForYearMondayFirst
	@Test
	public void testPrintCalForYearMondayFirst() throws IOException {
		String[] args = { "2016" };
		String file = "16_m.txt";
		String expected = generateCalendar(file);
		String actual = calApplication.printCalForYearMondayFirst(args);
		System.out.println(expected);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintCalForYearMondayFirstWhenYearIsNotNumber() {
		thrown.expect(CalException.class);
		
		String[] args = { "year" };
		calApplication.printCalForYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForYearMondayFirstWhenYearIsNotInteger() {
		thrown.expect(CalException.class);
		
		String[] args = { "1.5" };
		calApplication.printCalForYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForYearMondayFirstWhenYearIsZero() {
		thrown.expect(CalException.class);
		
		String[] args = { "0" };
		calApplication.printCalForYearMondayFirst(args);
	}
	
	@Test
	public void testPrintCalForYearMondayFirstWhenYearIsNegative() {
		thrown.expect(CalException.class);
		
		String[] args = { "-1" };
		calApplication.printCalForYearMondayFirst(args);
	}
	
	private String generateCalendar(String filename) throws IOException {
		if (!filename.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder();
			File file = Paths.get(Environment.currentDirectory)
					.resolve("resources/cal/test/" + filename)
					.toFile();
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(System.lineSeparator());
			}
			reader.close();
			
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			
			return stringBuilder.toString();
		}
		
		return null;
	}
	
	private String determineFile(int month, boolean isMondayFirst) {
		String[] files = { 
				"jan16", "feb16", "mar16", "apr16", "may16", "jun16", 
				"jul16", "aug16", "sep16", "oct16", "nov16", "dec16"
		};
		
		String file = files[month];
		
		if (isMondayFirst) {
			file += "_m";
		}
		
		file += ".txt";
		
		return file;
	}

}
