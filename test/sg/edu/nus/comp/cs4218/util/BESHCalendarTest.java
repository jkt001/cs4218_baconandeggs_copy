package sg.edu.nus.comp.cs4218.util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Rule;

public class BESHCalendarTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testConstructionValidArgs() {
		BESHCalendar cal = new BESHCalendar(1,1,1);		
	}
	
	
	@Test
	public void testIsLeapYearForSmallYears() throws Exception {
		BESHCalendar cal = new BESHCalendar(1,1,1);
		assertEquals(false, cal.isLeapYear(1));
		assertEquals(false, cal.isLeapYear(2));
		assertEquals(false, cal.isLeapYear(3));
		assertEquals(true, cal.isLeapYear(4));
	}
	
	@Test
	public void testIsLeapYearForCenturies() throws Exception {
		BESHCalendar cal = new BESHCalendar(1,1,1);
		assertEquals(false, cal.isLeapYear(100));
		assertEquals(false, cal.isLeapYear(200));
		assertEquals(false, cal.isLeapYear(300));
		assertEquals(true, cal.isLeapYear(400));
	}
	
	@Test
	public void testIsLeapYearForMillenia() throws Exception {
		BESHCalendar cal = new BESHCalendar(1,1,1);
		assertEquals(false, cal.isLeapYear(1000));
		assertEquals(true, cal.isLeapYear(2000));
		assertEquals(false, cal.isLeapYear(3000));
		assertEquals(true, cal.isLeapYear(4000));
	}
	
	@Test
	public void testAllDayNamesInAYear() throws Exception {
		for(int year = 1752; year <= 2016; year++) {
			for(int month = 0; month < 12; month++) {
				GregorianCalendar oracle = new GregorianCalendar(year, month, 1);
				int firstDayOfWeekInTheMonth = oracle.get(Calendar.DAY_OF_WEEK);
				BESHCalendar candidate = new BESHCalendar(1, month, year);
				assertEquals(firstDayOfWeekInTheMonth, candidate.getDayOfFirstDayInMonth());
			}
		}
		
		
	}
}
