package ch5_enum;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 달력 정보 객체 - 시스템의 달력 정보를 객체화 한것 */
		// 캘린더 객체 생성 Calendar.getInstacne() <- 이렇게 생성
		Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        int daysInYear = cal.get(Calendar.DAY_OF_YEAR);
        int weeksInYear = cal.get(Calendar.WEEK_OF_YEAR);
        int weeksInMonth = cal.get(Calendar.WEEK_OF_MONTH);
        
        System.out.println(year + "년");
        System.out.println((month +1)+ "월");
        System.out.println(date + "일");
        System.out.println(week + "주");
        System.out.println("올해의"+daysInYear+"일째");
        System.out.println("올해의"+weeksInYear + "째 주");
        System.out.println("이달의"+weeksInMonth+ "째 주");
		 
	}

}
