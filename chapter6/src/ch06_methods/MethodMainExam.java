package ch06_methods;

public class MethodMainExam {

	public static void main(String[] args) {

		// �޼ҵ带 �����ϰ� �ִ� Ŭ������ ��ü ����
		MethodExam m = new MethodExam();
		// ���������� �޼ҵ� ����

		// 1. ����(�Ű�����0, ����Ÿ�� 0)
		// ù ���� ���� , �� ��° ������ �޾Ƽ� ���� �� �����
		// int Ÿ������ �ǵ��� ��.
		int result = m.sum(10, 10);
		System.out.println(result);

		// 2. ����(�Ű�����x, ����Ÿ��o)
		String str1 = m.greeting();
		System.out.println(str1);

		// 3. ����(�Ű�����o, ����Ÿ��x)
		m.sumVoid(10, 30); // ��¥ ȣ�⸸��!!

		// 4. ����(�Ű�����x, ����Ÿ��x)
		m.greetingVoid(); // �Ű������� ���� ȣ�⵵ ����!!

	}

}
