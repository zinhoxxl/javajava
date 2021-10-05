package ch06_methods;

public class MethodMainExam {

	public static void main(String[] args) {

		// 메소드를 내장하고 있는 클래스의 객체 생성
		MethodExam m = new MethodExam();
		// 참조변수의 메소드 접근

		// 1. 유형(매개변수0, 리턴타입 0)
		// 첫 번쩨 정수 , 두 번째 정수를 받아서 연산 후 결과를
		// int 타입으로 되돌려 줌.
		int result = m.sum(10, 10);
		System.out.println(result);

		// 2. 유형(매개변수x, 리턴타입o)
		String str1 = m.greeting();
		System.out.println(str1);

		// 3. 유형(매개변수o, 리턴타입x)
		m.sumVoid(10, 30); // 진짜 호출만함!!

		// 4. 유형(매개변수x, 리턴타입x)
		m.greetingVoid(); // 매개변수도 없고 호출도 안함!!

	}

}
