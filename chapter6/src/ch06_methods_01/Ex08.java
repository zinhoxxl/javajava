package ch06_methods_01;

public class Ex08 {

	public static void main(String[] args) {

		A3 a = new A3();
		a.multiply(10, 15);
		System.out.println("합계:" + a.add(23, 56));
		double d1 = a.square(3.5);
		System.out.println("제곱:" + d1);
	}

}

class A3 {
	// 1유형 (매개변수o, 리턴타입o)
	int add(int a1, int a2) {
		return a1 + a2;

	}

	// 1유형 (매개변수o, 리턴타입o)
	double square(double d) {
		return d * d;
	}

	// 3유형 (매개변수o, 리턴타입x) /// 출력 할때 주로 3유형
	void multiply(int a1, int a2) {
		System.out.printf("%d * %d = %d\n", a1, a2, a1 * a2);
	}
}
