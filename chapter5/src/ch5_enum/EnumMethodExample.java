package ch5_enum;

import java.util.Scanner;

public class EnumMethodExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method st

		// name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name(); // 열거상수 -> String타입으로 변환
		System.out.println(name);

		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSDAY;
		int result1 = day1.compareTo(day2); // 0 -2
		int result2 = day2.compareTo(day1);// 2-0
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() 메소드 : String -> 열거
		System.out.println("요일을 열거상수 형식으로 입력해주세요.");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay); // 스캐너로 입력 받은 문자열을 -> Week 상수로 변환

		switch (weekDay.ordinal()) {
		case 0: 
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("주말이군요"); break;
		case 5: 
		case 6: System.out.println("평일 이군요."); break;
		

		}
		// values() 메소드
				Week[] days = Week.values();
				for (int i = 0; i < days.length; i++)
					System.out.println(days[i] + "  ");
				System.out.println();

				for (Week d : days)
					System.out.println(d + "  ");
		
		
		
		
		
		
		
		
		
/*
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말이군요");

		} else {
			System.out.println("평일 이군요.");

		}

		// values() 메소드
		Week[] days = Week.values();
		for (int i = 0; i < days.length; i++)
			System.out.println(days[i] + "  ");
		System.out.println();

		for (Week d : days)
			System.out.println(d + "  ");
*/
	}

}
