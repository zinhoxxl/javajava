package Switch;

/* �ڹ� 6���� switch()�� �ȿ� - byte, char, short, int, long ������ �������� �����ϴ� ����ĸ� �ü� ����. */
public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A' :                                  // �빮�� �ҹ��ڸ� �ϳ��� ���̽��� ����
		case 'a' :
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("�Ϲ� ȸ���Դϴ�.");
	    default :
	    	System.out.println("�մ��Դϴ�.");
		}
		
		

	}

}
