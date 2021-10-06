package ch07_staticVsnontStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {

	}

}

class A1 {
	// �ν��Ͻ� �ʵ�� �޼ҵ�
	static int field1;

	void method1() {
	}

	// ���� �ʵ�� �޼ҵ�
	static int field2;

	static void method2() {
	}

	// �ν��Ͻ� �޼ҵ� ���� ���� Ŭ�������� static���, instance��� ��� ����(ȣ��)����
	void method4() {
		field1 = 0; // �ν��Ͻ� �ʵ�
		field2 = 10; // static �ʵ�
		method1(); // �ν��Ͻ� �޼ҵ�
		method2(); // static �޼ҵ�
	}

	// static �޼ҵ� - �޼ҵ� ������ static���� ����� ���(�ʵ�� �޼ҵ�) �� ��� ����.
	static void method3() {
		field1 = 0; // �ν��Ͻ� �ʵ�
		field2 = 10; // static �ʵ�
		//method1(); // �ν��Ͻ� �޼ҵ�
		method2(); // static �޼ҵ�

	}

}