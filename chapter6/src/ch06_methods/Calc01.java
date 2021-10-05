package ch06_methods;

public class Calc01 {

	//
	int i = 0, j = 0;

	// 합 (매개변수o, 리턴타입o) = 1유형
	public int add(int x, int y) {
		return x + y;
	}

	// 나누기(매개변수x, 리턴타입o) = 2유형
	public int divid() {
		return i / j;
	}

	// 빼기 (매개변수o, 리턴타입x) = 3유형
	public void sub(int x, int y) {
		System.out.println(x - y);
	}

	// 곱(매개변수x, 리턴타입x) = 4유형
	public void mul() { 
		System.out.println(i * j);
	}

}
