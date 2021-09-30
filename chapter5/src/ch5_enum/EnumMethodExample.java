package ch5_enum;

import java.util.Scanner;

public class EnumMethodExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method st

		// name() �޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name(); // ���Ż�� -> StringŸ������ ��ȯ
		System.out.println(name);

		// ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSDAY;
		int result1 = day1.compareTo(day2); // 0 -2
		int result2 = day2.compareTo(day1);// 2-0
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() �޼ҵ� : String -> ����
		System.out.println("������ ���Ż�� �������� �Է����ּ���.");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay); // ��ĳ�ʷ� �Է� ���� ���ڿ��� -> Week ����� ��ȯ

		switch (weekDay.ordinal()) {
		case 0: 
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("�ָ��̱���"); break;
		case 5: 
		case 6: System.out.println("���� �̱���."); break;
		

		}
		// values() �޼ҵ�
				Week[] days = Week.values();
				for (int i = 0; i < days.length; i++)
					System.out.println(days[i] + "  ");
				System.out.println();

				for (Week d : days)
					System.out.println(d + "  ");
		
		
		
		
		
		
		
		
		
/*
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ��̱���");

		} else {
			System.out.println("���� �̱���.");

		}

		// values() �޼ҵ�
		Week[] days = Week.values();
		for (int i = 0; i < days.length; i++)
			System.out.println(days[i] + "  ");
		System.out.println();

		for (Week d : days)
			System.out.println(d + "  ");
*/
	}

}
