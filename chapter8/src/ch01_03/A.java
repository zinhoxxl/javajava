package ch01_03;

public class A {

	// �ν��Ͻ� ��� Ŭ����
class B { // A$B A�� ���� 

		B(){}
			int field1;
			//static int field2;

		void method1() {}
		// static void method2() {}
	}
	
static class C { // A$C A�� ���� 

		C(){}
			int field1;
			//static int field2;

		void method1() {}
		// static void method2() {}
	}

 void method() {
	 // ���� Ŭ����
	 class D{
		 D() {System.out.println("����Ŭ���� ������");}
         int field1;
         // static int field2;
         void method1() {System.out.println("����Ŭ���� D�� �޼ҵ�");}
         // static void method2(){}
	 }
	 D d = new D();
	 d.field1=3; 
	 d.method1();


 class E{
	 E() {System.out.println("����Ŭ���� ������");}
     int field1;
     // static int field2;
     void method1() {System.out.println("����Ŭ���� D�� �޼ҵ�");}
     // static void method2(){}
    }
	 E e = new E();
	 e.field1=3; 
	 e.method1();

}

 
}

