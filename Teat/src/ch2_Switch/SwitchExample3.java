package ch2_Switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		
		//������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���
		//   1,    2,     3,    4,    5,    6,     0
		//��~�����(1~4) : ������ �����մϴ�.
		//�ݿ���(5) : ������ �մϴ�.
		//�����,�Ͽ���(6,0) : ������ ���ϴ�.
		// random()�̿��ؼ� ���� �޾Ƽ� ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���(ex:������)");
		String weekDay = scanner.next();
		
		switch(weekDay) {
		//��~����� : ������ �����մϴ�.
	    //�ݿ��� : ������ �մϴ�.
	    //�����,�Ͽ��� : ������ ���ϴ�.
		case "������":   case "ȭ����":  case "������":
	    case "�����": System.out.println("������ ���� �սô�."); break;
	    
	    
	    case "�ݿ���": System.out.println("������ �մϴ�."); break;
	    	
	    	
	    case "�����":   case "�Ͽ���": System.out.println("������ ���ϴ�.");
		}
		
		scanner.close(); //������ ���� �Ƚᵵ ��  �ڿ�������ɺ�����

	}

}
