package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.exception.DateException;

public class DateApplicationTest {
	
	private static final int YEAR = 2016;
	private static final int MONTH = 4;
	private static final int DAY_OF_MONTH = 20;
	private static final int HOUR_OF_DAY = 0;
	private static final int MINUTE = 9;
	private static final int SECOND = 9;
	private static final TimeZone TIME_ZONE = TimeZone.getTimeZone("Asia/Singapore");
	
	private static DateApplication dateApplication;
	private static Calendar calendar; 
	
	public OutputStream outStream;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void setUpBeforeClass() {
		dateApplication = new DateApplication();
	}
	
	@Before
	public void setUp() {
		outStream = new ByteArrayOutputStream();
		calendar = new GregorianCalendar(YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, SECOND);
		calendar.setTimeZone(TIME_ZONE);
	}
	
//	@Test 
//	public void testDateApplication() throws DateException {
//		Calendar calendarNow = new GregorianCalendar();
//		dateApplication.run(null, null, outStream);
//		assertEquals(dateApplication.formatDate(calendarNow), outStream.toString());
//	}
	
	@Test
	public void testFormatDate() throws DateException {
		String dateString = dateApplication.formatDate(calendar);
		String expDateString = "Fri May 20 00:09:09 SGT 2016";
		assertEquals(expDateString, dateString);
	}
	
	@Test
	public void testGetDayOfWeek() {
		String dayOfWeek = dateApplication.getDayOfWeek(calendar);
		assertEquals("Fri", dayOfWeek);
	}
	
	@Test
	public void testGetDayOfMonth() {
		int dayOfMonth = dateApplication.getDayOfMonth(calendar);
		assertEquals(DAY_OF_MONTH, dayOfMonth);
	}
	
	@Test
	public void testGetMonth() {
		String month = dateApplication.getMonth(calendar);
		assertEquals("May", month);
	}
	
	@Test
	public void testGetYear() {
		int year = dateApplication.getYear(calendar);
		assertEquals(YEAR, year);
	}
	
	@Test
	public void testGetHourOfDay() {
		int hourOfDay = dateApplication.getHourOfDay(calendar);
		assertEquals(HOUR_OF_DAY, hourOfDay);
	}
	
	@Test
	public void testGetMinute() {
		int minute = dateApplication.getMinute(calendar);
		assertEquals(MINUTE, minute);
	}
	
	@Test
	public void testGetSecond() {
		int second = dateApplication.getSecond(calendar);
		assertEquals(SECOND, second);
	}
	
	@Test
	public void testGetTimeZone() {
		String timeZone = dateApplication.getTimeZone(calendar);
		assertEquals("SGT", timeZone);
	}
	
	@Test 
	public void testFormatTimeToTwoDigitForOneDigitValue() throws DateException {
		String value = dateApplication.formatTimeToTwoDigit(9);
		assertEquals("09", value);
	}
	
	@Test 
	public void testFormatTimeToTwoDigitForTwoDigitValue() throws DateException {
		String value = dateApplication.formatTimeToTwoDigit(10);
		assertEquals("10", value);
	}
	
	@Test 
	public void testFormatTimeToTwoDigitForInvalidValue() throws DateException {
		thrown.expect(DateException.class);
		thrown.expectMessage("Time value must be in between 0 to 59");
		
		dateApplication.formatTimeToTwoDigit(60);
	}
	
	@Test
	public void shouldThrowDateExceptionWithNullStdout() throws DateException {
		thrown.expect(DateException.class);
		thrown.expectMessage("Null Pointer Exception");
		
		dateApplication.run(null, null, null);
	}
	
	@After
	public void tearDown() throws IOException {
		outStream.close();
	}
}
