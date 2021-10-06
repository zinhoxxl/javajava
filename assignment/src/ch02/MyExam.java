package ch02;

import java.util.Scanner;

public class MyExam {

	// �ʵ� ���
	static String gender;
	static int age;
	static double weight,height;
	static final double maleSTD = 1.10, femaleSTD = 1.07;
	static final int COMSTD = 128, COMSTD2 = 100;
	static boolean run = true;
	static double leanBodyMass;
	static double bodyFatMass;
	static double bodyFatRatio;
	static double leanBodyRatio;

	public static void main(String[] args) { // ���ν���
		while (run) {

			printMenu();

			inputInfo();

			MyExam.leanBodyMass = getLeanBodyMass(gender, weight, height);

			MyExam.bodyFatMass = getBodyFatMass(leanBodyMass);

			MyExam.leanBodyRatio = getLeanBodyRatio(leanBodyMass);

			MyExam.bodyFatRatio = getBodyFatRatio(bodyFatMass);

			String result = getResult(gender , bodyFatRatio);

			printResult(leanBodyMass, leanBodyRatio, bodyFatMass, bodyFatRatio, result);

			isRun();

		}
		System.out.println("���α׷� ����");
 
	} // �������� (��������� ���๮)

	// ���۾ȳ�
	static void printMenu() {
		System.out.println("=====================================");
		System.out.println(" ��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�");
		System.out.println("=====================================");
	}

	// �Է°� �ܼ�â
	static void inputInfo() {
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����
			
		try {
			System.out.println("����(����(M)/����(F)�Է�)>");
			gender = sc.next();
			System.out.println("����(����:10~39 �Է�)>");
			age = sc.nextInt();
			System.out.println("Ű �Է�(����:cm)>");
			height = sc.nextDouble();
			System.out.println("������ �Է�(����:kg)>");
			weight = sc.nextDouble();
			
		} catch (Exception e){
			System.out.println("������ �ȿ��� �Է��ϼ���");
			

		}

	}

	// 1. �����淮
	static double getLeanBodyMass(String gender, double weight, double height) {
		double leanBodyMass = 0.0;
		switch (gender) {
		case "M": // ������ ���
			leanBodyMass = 
			(maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height))); break;
		case "F": // ������ ���
			leanBodyMass = 
			(femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height))); break;
		}

		return leanBodyMass;
	}

	// 2. �����淮
	static double getBodyFatMass(double leanBodyMass) {
		double bodyFatMass = weight - leanBodyMass;
		return bodyFatMass;
	}

	// 2_1. �������
	static double getLeanBodyRatio(double leanBodyMass) {
		double leanBodyRatio = (leanBodyMass * COMSTD2) / (double) weight;
		return leanBodyRatio;
	}

	// 3. ü�����
	static double getBodyFatRatio(double bodyFatMass) {
		double bodyFatRatio = (bodyFatMass * COMSTD2) / (double) weight;
		return bodyFatRatio;
	}

	// 4. ���
	static String getResult(String gender, double bodyFatRatio) {
		String result = "";
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "���� ��"; // 0~12�̸�
			else if (bodyFatRatio <= 17)
				result = "ǥ��"; // 12~17
			else if (bodyFatRatio <= 22)
				result = "��ü��";// 18~22
			else if (bodyFatRatio <= 27)
				result = "��"; // 22~27
			else
				result = "����";// >=28
			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "���� ��"; // 0~22�̸�
			else if (bodyFatRatio <= 27)
				result = "ǥ��"; // 22~27
			else if (bodyFatRatio <= 35)
				result = "��ü��";// 28~35
			else if (bodyFatRatio <= 40)
				result = "��"; // 36~40
			else
				result = "����";// >=40
			break;
		}
		return result;
	}

	// ��� ���
	static void printResult(double leanBodyMass, 
							double leanBodyRatio, 
							double bodyFatMass, 
							double bodyFatRatio,
							String result) {
						System.out.println("���:>");
						System.out.printf("�����淮:%.2f\n", leanBodyMass);
						System.out.printf("��������:%.2f\n", leanBodyRatio);
						System.out.printf("ü���淮:%.2f\n", bodyFatMass);
						System.out.printf("ü������:%.2f\n", bodyFatRatio);
						System.out.println("���:" + result);
	}

	// ����� ����
	static void isRun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ұ��?(yes/no)");
		String yesNo = sc.next();
		if (yesNo.equalsIgnoreCase("no"))
			run = false;

	}

}
