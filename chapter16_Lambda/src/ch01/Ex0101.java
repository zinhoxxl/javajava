package ch01;

public class Ex0101 {
	public static void main(String[] args) {

		// �������̽��� me()ȣ�� ��� "10+20=30"�̶�� ���� ��µǵ���
		// 1.����ü ���� ó��, 2.���ٽ� ��ȯ
		
		// 1.����ü ���� ó��
		MyInter1 fi = new MyInter1() {
			
			@Override
			public void me() {
                 System.out.println("10+20=30");				
			}
		};
		fi.me();
		
		// 2.���ٽ� ��ȯ
		fi = ()-> System.out.println("10+20=30");
		fi.me();
	}

}
