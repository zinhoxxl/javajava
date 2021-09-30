package ch5_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		// 열거타입 변수 선언
		Week today = null;
		// 캘린더타입의 변수 선언, 캘린더타입 객체 생성(클래스명.getInstance()) 대입
		Calendar cal = Calendar.getInstance(); // 캘린더객체 생성
        int week = cal.get(Calendar.DAY_OF_WEEK); // get(현재의 요일값 : Calendar.DAY_OF_WEEK);
		System.out.println(week); // 5가나온다 왜? sunday부터 1시작이어서
		 
		
		// calendar로 부터 읽은 요일 숫자값에 따라 요일 출력
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break; 
		case 4: today = Week.WEDNSDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
	
		} 
		System.out.println("오늘은 :"+ today); //String+열거 상수 => String
		
		//열거상수 비교
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		
		
		
	}

}
