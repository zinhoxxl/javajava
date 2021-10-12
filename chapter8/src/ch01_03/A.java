package ch01_03;

public class A {

	// 인스턴스 멤버 클래스
class B { // A$B A에 종속 

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

 void method() {
	 // 로컬 클래스
	 class D{
		 D() {System.out.println("로컬클래스 생성자");}
         int field1;
         // static int field2;
         void method1() {System.out.println("로컬클래스 D의 메소드");}
         // static void method2(){}
	 }
	 D d = new D();
	 d.field1=3; 
	 d.method1();


 class E{
	 E() {System.out.println("로컬클래스 생성자");}
     int field1;
     // static int field2;
     void method1() {System.out.println("로컬클래스 D의 메소드");}
     // static void method2(){}
    }
	 E e = new E();
	 e.field1=3; 
	 e.method1();

}

 
}

