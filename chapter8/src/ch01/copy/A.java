package ch01.copy;

public class A {

String field = "Outter-field";
void method() {
	System.out.println("Outter-method");
}
	
	// �ν��Ͻ� ��� Ŭ����
class B { // A$B A�� ���� 

	// �ʵ�
		String field = "Inner-field";
		void method1() {
			System.out.println("Inner-method");
		}

		void print() {
			System.out.println(this.field); // Inner
			this.method1(); // Inner
			System.out.println(A.this.field); // Outter
			A.this.method(); // Outter
		}
}
}
// class B{}