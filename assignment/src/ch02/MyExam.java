package ch02;

import java.util.Scanner;

public class MyExam {

	// 필드 멤버
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

	public static void main(String[] args) { // 메인시작
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
		System.out.println("프로그램 종료");
 
	} // 메인종료 (여기까지가 실행문)

	// 시작안내
	static void printMenu() {
		System.out.println("=====================================");
		System.out.println(" 정확한 계산을 위하여 아래 정보를 입력 바랍니다");
		System.out.println("=====================================");
	}

	// 입력값 콘솔창
	static void inputInfo() {
		Scanner sc = new Scanner(System.in); // 스캐너 실행
			
		try {
			System.out.println("성별(남자(M)/여자(F)입력)>");
			gender = sc.next();
			System.out.println("나이(정수:10~39 입력)>");
			age = sc.nextInt();
			System.out.println("키 입력(단위:cm)>");
			height = sc.nextDouble();
			System.out.println("몸무게 입력(단위:kg)>");
			weight = sc.nextDouble();
			
		} catch (Exception e){
			System.out.println("선택지 안에서 입력하세요");
			

		}

	}

	// 1. 제지방량
	static double getLeanBodyMass(String gender, double weight, double height) {
		double leanBodyMass = 0.0;
		switch (gender) {
		case "M": // 남자일 경우
			leanBodyMass = 
			(maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height))); break;
		case "F": // 여자일 경우
			leanBodyMass = 
			(femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height))); break;
		}

		return leanBodyMass;
	}

	// 2. 제지방량
	static double getBodyFatMass(double leanBodyMass) {
		double bodyFatMass = weight - leanBodyMass;
		return bodyFatMass;
	}

	// 2_1. 제지방률
	static double getLeanBodyRatio(double leanBodyMass) {
		double leanBodyRatio = (leanBodyMass * COMSTD2) / (double) weight;
		return leanBodyRatio;
	}

	// 3. 체지방률
	static double getBodyFatRatio(double bodyFatMass) {
		double bodyFatRatio = (bodyFatMass * COMSTD2) / (double) weight;
		return bodyFatRatio;
	}

	// 4. 등급
	static String getResult(String gender, double bodyFatRatio) {
		String result = "";
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "야윈 몸"; // 0~12미만
			else if (bodyFatRatio <= 17)
				result = "표준"; // 12~17
			else if (bodyFatRatio <= 22)
				result = "과체중";// 18~22
			else if (bodyFatRatio <= 27)
				result = "비만"; // 22~27
			else
				result = "고도비만";// >=28
			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "야윈 몸"; // 0~22미만
			else if (bodyFatRatio <= 27)
				result = "표준"; // 22~27
			else if (bodyFatRatio <= 35)
				result = "과체중";// 28~35
			else if (bodyFatRatio <= 40)
				result = "비만"; // 36~40
			else
				result = "고도비만";// >=40
			break;
		}
		return result;
	}

	// 결과 출력
	static void printResult(double leanBodyMass, 
							double leanBodyRatio, 
							double bodyFatMass, 
							double bodyFatRatio,
							String result) {
						System.out.println("결과:>");
						System.out.printf("제지방량:%.2f\n", leanBodyMass);
						System.out.printf("제지방율:%.2f\n", leanBodyRatio);
						System.out.printf("체지방량:%.2f\n", bodyFatMass);
						System.out.printf("체지방율:%.2f\n", bodyFatRatio);
						System.out.println("결과:" + result);
	}

	// 재시작 여부
	static void isRun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계속할까요?(yes/no)");
		String yesNo = sc.next();
		if (yesNo.equalsIgnoreCase("no"))
			run = false;

	}

}
