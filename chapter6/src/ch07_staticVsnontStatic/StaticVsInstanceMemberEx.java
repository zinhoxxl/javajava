package ch07_staticVsnontStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {

	}

}

class A1 {
	// 인스턴스 필드와 메소드
	static int field1;

	void method1() {
	}

	// 정적 필드와 메소드
	static int field2;

	static void method2() {
	}

	// 인스턴스 메소드 에서 같은 클래스내의 static멤버, instance멤버 모두 접근(호출)가능
	void method4() {
		field1 = 0; // 인스턴스 필드
		field2 = 10; // static 필드
		method1(); // 인스턴스 메소드
		method2(); // static 메소드
	}

	// static 메소드 - 메소드 내에는 static으로 선언된 멤버(필드와 메소드) 만 사용 가능.
	static void method3() {
		field1 = 0; // 인스턴스 필드
		field2 = 10; // static 필드
		//method1(); // 인스턴스 메소드
		method2(); // static 메소드

	}

}