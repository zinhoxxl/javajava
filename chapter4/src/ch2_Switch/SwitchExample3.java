package ch2_Switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		
		//월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
		//   1,    2,     3,    4,    5,    6,     0
		//월~목요일(1~4) : 열심히 공부합니다.
		//금요일(5) : 쇼핑을 합니다.
		//토요일,일요일(6,0) : 레저를 즐깁니다.
		// random()이용해서 값을 받아서 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일을 입력해주세요(ex:월요일)");
		String weekDay = scanner.next();
		
		switch(weekDay) {
		//월~목요일 : 열심히 공부합니다.
	    //금요일 : 쇼핑을 합니다.
	    //토요일,일요일 : 레저를 즐깁니다.
		case "월요일":   case "화요일":  case "수요일":
	    case "목요일": System.out.println("열심히 공부 합시다."); break;
	    
	    
	    case "금요일": System.out.println("쇼핑을 합니다."); break;
	    	
	    	
	    case "토요일":   case "일요일": System.out.println("레저를 즐깁니다.");
		}
		
		scanner.close(); //지금은 굳이 안써도 됨  자원해제기능보조됨

	}

}
