package ch01;

public class OutterMain {
	public static void main(String[] args) {

		// 인스턴스 멤버
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
	}

}
