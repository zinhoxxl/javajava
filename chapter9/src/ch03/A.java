package ch03;

public class A {
	// 메소드() throws 예외객체{}
	// 예외 떠넘기기
	void method() throws Exception {
		System.out.println("A의 메소드");
		// 예외객체 강제 생성하여 던지는 명령문
		throw new Exception();

	}
}
