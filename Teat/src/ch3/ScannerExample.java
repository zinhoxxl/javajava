package ch3;


		//��ĳ�� ��ü ����
		
		import java.util.Scanner;

		public class ScannerExample {
			public static void main(String args[]) { 
				System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
				Scanner scanner = new Scanner(System.in);
				
				String name = scanner.next(); // ���ڿ� �б� String next()
				System.out.println("�̸��� " + name + ", ");
				
				String city = scanner.next(); // ���ڿ� �б� String next()
				System.out.println("���ô� " + city + ", ");
				
				int age = scanner.nextInt(); // ���� �б� int next()
				System.out.println("���̴� " + age + "��, ");
				
				double weight = scanner.nextDouble(); // �Ǽ� �б� double nextDouble()
				System.out.println("ü���� " + weight + "kg, ");
				
				boolean single = scanner.nextBoolean(); // ���� �б� boolean nextBoolean()
				System.out.println("���� ���δ� " + single + "�Դϴ�.");
				
				scanner.close(); // scanner �ݱ�
			}

		

	}


