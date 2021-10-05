package ch06_methods_01;

public class Ex03 {

	public static void main(String[] args) {

		C1 c = new C1();
		c.call(10, 20);
		c.cal2(2,2);
		int result = c.cal2(2, 2);
		System.out.println(result);
		
	}

}

class C1 {
	// 3유형 - 매개변수o, 리턴타입x
	void call(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n", x, y, x / y);
	}

	// 1유형 - 매개변수o, 리턴타입o
	int cal2(int x, int y) {
		return x * y;
	}
}