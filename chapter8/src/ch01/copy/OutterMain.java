package ch01.copy;

public class OutterMain {
	public static void main(String[] args) {

		// �ν��Ͻ� ���
		A a = new A();
		A.B b = a.new B();
		b.print();
		
	}

}
