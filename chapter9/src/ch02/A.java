package ch02;

public class A {
	void method() {
		try {
			System.out.println("A의 메소드");
			// 예외객체 강제 생성하여 던지는 명령문
			throw new Exception();
		} catch (Exception e) {
			System.out.println("A 예외발생");
		}
	}
}
