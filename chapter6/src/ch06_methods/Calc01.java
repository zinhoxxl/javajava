package ch06_methods;

public class Calc01 {

	//
	int i = 0, j = 0;

	// �� (�Ű�����o, ����Ÿ��o) = 1����
	public int add(int x, int y) {
		return x + y;
	}

	// ������(�Ű�����x, ����Ÿ��o) = 2����
	public int divid() {
		return i / j;
	}

	// ���� (�Ű�����o, ����Ÿ��x) = 3����
	public void sub(int x, int y) {
		System.out.println(x - y);
	}

	// ��(�Ű�����x, ����Ÿ��x) = 4����
	public void mul() { 
		System.out.println(i * j);
	}

}
