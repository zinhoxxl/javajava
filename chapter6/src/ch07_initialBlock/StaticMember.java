package ch07_initialBlock;

import java.util.Scanner;

class CurrencyConverter {

	private static double rate; // �ѱ� ��ȭ�� ���� ȯ��

	public static double toDollar(double won) {
		return won / rate; // �ѱ� ��ȭ�� �޷��� ��ȯ
	}

	public static double toKWR(double dollar) {
		return dollar * rate; // �޷��� �ѱ� ��ȭ�� ��ȯ
	}
 
	public static void setRate(double r) {
		rate = r; // ȯ�� ����. KWR/$1
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); // �̱� �޷� ȯ�� ����
		System.out.println("�鸸���� $" + CurrencyConverter.toDollar(1000000) + "�Դϴ�.");  // ���ڴ� �鸸�� ���ڰ�
		System.out.println("$100�� " + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		scanner.close();
	}
}
