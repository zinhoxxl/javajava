package ch06_methods_01;

public class Ex09 {

	public static void main(String[] args) {

		// default �����ڰ� ������ default ������ ȣ�� �Ұ�
		// �Ű����� 3��¥�� ����ȣ�� �Ͽ� ��ü ����
		B3 b = new B3(98, 89, 93);
		b.sum();
		System.out.println("��:"+b.sum); // �ʵ� ����
		int average = b.average();
		System.out.println("���:"+average);

	}

}

class B3 {
	// �ʵ�
	int kor, eng, mat, sum; // kor = 0, eng = 0, mat = 0, sum= 0�λ���

	// ������
	B3(int k, int e, int m) { // �����ڿ� ���� �ʱ�ȭ ó��
		kor = k;
		eng = e;
		mat = m;
	}

	// �޼ҵ�
	// 4���� - ���纯��x, ����Ÿ��x
	void sum() {
		sum = kor + eng + mat; // sum () �޼ҵ忡 ���� sum = 0 ���� �ʱ�ȭ �Ȼ��¿��� kor+eng+mat��������� ����.
	}

	// 2���� - ���纯��x, ����Ÿ��o
	int average() {
		return sum / 3; // sum() �޼ҵ��� ó�� ����� ���� ���� ������� ó���� ��� ����
	}

}