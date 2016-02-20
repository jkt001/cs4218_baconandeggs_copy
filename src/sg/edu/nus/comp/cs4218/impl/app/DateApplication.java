package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.exception.DateException;

/**
 * The date command prints the current date and time to the standard output,<br/>
 * eg., Wed Dec 30 17:24:43 SGT 2015  
 * 
 * <p>
 * <b>Command format:</b> <code>date</code> <br/>
 * <dl>
 * <dt>Date format:</dt>
 * <dd><code>[week day] [month] [day] [hh:mm:ss] [time zone] [year] </code></dd>
 * </dl>
 * </p>
 */
public class DateApplication implements Application {
	
	// List of days in a week, with index 0 = Sunday
	private static final String[] DAYS_OF_WEEK = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	
	private static final String[] MONTHS = { 
			"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
			"Jul", "Aug", "Sep", "Oct", "Nov", "Dec" 
	};
	
	private static final String SPACE_DELIMITER = " ";
	private static final String TIME_DELIMITER = ":";
	
	/**
	 * Run the date application with the specified arguments.
	 * 
	 * @param args Not used for date application.
	 * @param stdin Not used for date application.
	 * @param stdout An OutputStream. The output of the command is written to this OutputStream.
	 * 
	 * @throws DateException If the OutputStream is null or there is an error when writing to this OutputStream.
	 */
	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) 
			throws DateException {
		
		if (stdout == null) {
			throw new DateException("Null Pointer Exception");
		}
		
		Calendar calendar = new GregorianCalendar();
		String dateString = formatDate(calendar);
		try {
			stdout.write(dateString.getBytes());
		} catch (IOException e) {
			throw new DateException("Could not write to output stream");
		}
	}
	
	/**
	 * Format the calendar instance in the following format:
	 * <code>[week day] [month] [day] [hh:mm:ss] [time zone] [year]</code>
	 * 
	 * @param calendar
	 * @return string representation of a calendar instance in the format specified above 
	 * @throws DateException if there is an error in processing the calendar
	 */
	String formatDate(Calendar calendar) throws DateException {
		String dayOfWeek = getDayOfWeek(calendar);
		String month = getMonth(calendar);
		int day = getDayOfMonth(calendar);
		String dayOfMonth = (day < 10) ? "0" + day : String.valueOf(day);
		String hour = formatTimeToTwoDigit(getHourOfDay(calendar));
		String minute = formatTimeToTwoDigit(getMinute(calendar));
		String second = formatTimeToTwoDigit(getSecond(calendar));
		String timeZone = getTimeZone(calendar);
		String year = String.valueOf(getYear(calendar));
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(dayOfWeek).append(SPACE_DELIMITER)
					 .append(month).append(SPACE_DELIMITER)
					 .append(dayOfMonth).append(SPACE_DELIMITER)
					 .append(hour).append(TIME_DELIMITER)
					 .append(minute).append(TIME_DELIMITER)
					 .append(second).append(SPACE_DELIMITER)
					 .append(timeZone).append(SPACE_DELIMITER)
					 .append(year);
		return stringBuilder.toString();
	}
	
	/**
	 * Get the name of the day of a calendar
	 * 
	 * @param calendar
	 * @return the name of the day of week of a calendar
	 */
	String getDayOfWeek(Calendar calendar) {
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return DAYS_OF_WEEK[dayOfWeek - 1];
	}
	
	/**
	 * Get the date of the month of a calendar
	 * 
	 * @param calendar
	 * @return the date of the month of a calendar
	 */
	int getDayOfMonth(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * Get the name of the month of a calendar
	 * 
	 * @param calendar
	 * @return the name of the month of a calendar
	 */
	String getMonth(Calendar calendar) {
		return MONTHS[calendar.get(Calendar.MONTH)];
	}
	
	/**
	 * Get the year of a calendar
	 * 
	 * @param calendar
	 * @return the the year of a calendar
	 */
	int getYear(Calendar calendar) {
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * Get the hour of the day of a calendar
	 * 
	 * @param calendar
	 * @return the hour of the day of a calendar
	 */
	int getHourOfDay(Calendar calendar) {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
	
	/**
	 * Get the minute of the day of a calendar
	 * 
	 * @param calendar
	 * @return the minute of the day of a calendar
	 */
	int getMinute(Calendar calendar) {
		return calendar.get(Calendar.MINUTE);
	}
	
	/**
	 * Get the second of the day of a calendar
	 * 
	 * @param calendar
	 * @return the second of the day of a calendar
	 */
	int getSecond(Calendar calendar) {
		return calendar.get(Calendar.SECOND);
	}
	
	/**
	 * Get the time zone of a calendar
	 * 
	 * @param calendar
	 * @return the time zone of a calendar
	 */
	String getTimeZone(Calendar calendar) {
		return calendar.getTimeZone().getDisplayName(false, TimeZone.SHORT);
	}
	
	/**
	 * Format the time value (eg. hour, minute, or second) 
	 * to 2 digit by prepending zero if necessary
	 * 
	 * @param value
	 * @return the formatted value. If the value given is less than 10, 
	 * 		   it will be prepended by 0. Otherwise, it will just be the value.
	 * @throws DateException if value is greater than or equal to 60
	 */
	String formatTimeToTwoDigit(int value) throws DateException {
		if (value >= 60) {
			throw new DateException("Time value must be in between 0 to 59");
		}
		
		if (value < 10) {
			return "0" + value;
		}
		return String.valueOf(value);
	}
}
