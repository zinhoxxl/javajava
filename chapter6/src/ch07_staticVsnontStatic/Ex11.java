package ch07_staticVsnontStatic;

public class Ex11 {

	public static void main(String[] args) {

		// Ŭ������ �޼ҵ�
		C3.method2();
		
		// ��ü ����
		C3 c = new C3();
		// ��������.�޼ҵ�
		c.method1();
		// ��������.�޼ҵ�
		c.method2();
		
		
	}

}
class C3 {
	void method1() { // non-static���
		System.out.println("�� �ν��Ͻ� �޼ҵ�");
	}
	static void method2() { // static���
		System.out.println("�� static �޼ҵ�");
	}
}