package ch06_methods;

public class Score1 {

	// �ʵ�

	int kor;
	int eng;
	int math;

	// 4����
	void display() {
		int sum = kor + eng + math;
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + sum / 3);
	}

	// 4����
	void print() {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	// 3����
	void print(int kor, int eng, int math) {

	}

	// 1����
	int res(int kor, int eng, int math) {
		return kor + eng + math;
	}

	// 2����
	int res() {
		return kor + eng + math;
	}

}
