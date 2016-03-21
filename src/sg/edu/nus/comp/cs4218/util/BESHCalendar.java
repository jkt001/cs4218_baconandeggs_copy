package sg.edu.nus.comp.cs4218.util;

import java.util.Date;

public class BESHCalendar {
	
	private int day;
	private int month;
	private int year;

	public BESHCalendar(int d, int m, int y) {
		setDay(d);
		month = m + 1;
		year = y;
	}
	
	public int getNumberOfDaysInAMonth() {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if (isLeapYear(year)) {
				return 29;
			}
			return 28;
		default:
			return 30;
		}
	}
	
	//1- Sunday, 7- Saturday
	public int getDayOfFirstDayInMonth() {
		int thisMonth = getZellerMonth();
		int thisYear = getZellerYear();
		int last2Year = thisYear % 100;
		int century = thisYear / 100;
		
		int dayOfWeek = 1 + (((13*thisMonth)-1)/5) + last2Year + (last2Year/4) + (century/4) - (2*century);
		dayOfWeek = dayOfWeek % 7;
		if (dayOfWeek < 0) {
			while (dayOfWeek < 0) {
				dayOfWeek += 7;
			}
			return dayOfWeek + 1;
		}
		return dayOfWeek + 1;
	}
	
	private int getZellerMonth() {
		int zMonth = (month-2) % 12;
		if (zMonth <= 0) {
			return zMonth + 12;
		}
		return zMonth;
	}
	
	private int getZellerYear() {
		if (month < 3) {
			return year - 1;
		}
		return year;
	}
	
	public Date getCurrentDate() {
		return new Date();
	}
	
	private boolean isLeapYear(int y) {
		if (y % 400 ==0) {
			return true;
		} else if (y % 100 == 0) {
			return false;
		} else if (y % 4 == 0) {
			return true;
		}
		return false;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month - 1;
	}
	
	public int getYear() {
		return year;
	}
	
	public static void main(String[] args) {
		BESHCalendar calendar = new BESHCalendar(21, 3, 2016);
		System.out.println(calendar.getNumberOfDaysInAMonth());
		System.out.println(calendar.getDayOfFirstDayInMonth());
	}
}
