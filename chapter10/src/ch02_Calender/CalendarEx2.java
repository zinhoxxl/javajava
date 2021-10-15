package ch02_Calender;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		
		// 달력 -> 아시아권 달력 - 윤년 isLeapYear()
		GregorianCalendar gc = new GregorianCalendar();
		Date d = gc.getTime();
		if(gc.isLeapYear(2000))
			System.out.println("윤년");
		
		
	}

}
