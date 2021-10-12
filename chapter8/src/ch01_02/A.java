package ch01_02;

public class A {

	// 인스턴스 멤버 클래스
	static class B { // A$B A에 종속 

		B(){}
			int field1;
			//static int field2;

		void method1() {}
		// static void method2() {}
	}
	
    static class C { // A$C A에 종속 

		C(){}
			int field1;
			//static int field2;

		void method1() {}
		// static void method2() {}
	}

}
// class B{}
