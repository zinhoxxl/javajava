package ch3_Array2;

public class ArrayExam1 {

	public static void main(String[] args) {

		byte[] arrB = new byte[5];
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(10 + arrB[i] + "\t");
		}
		System.out.println();
		char[] charA = new char[5];
		for (int i = 0; i < charA.length; i++) {
			System.out.print(charA[i] + "\t");
		}
		short[] shortA = new short[5];
		for (int i = 0; i < shortA.length; i++) {
			System.out.print(shortA[i] + "\t");
		}
		System.out.println();
		long[] longA = new long[5];
		for (int i = 0; i < longA.length; i++) {
			System.out.print(longA[i] + "\t");
		}
		System.out.println();
		float[] floatA = new float[5];
		for (int i = 0; i < floatA.length; i++) {
			System.out.print(floatA[i] + "\t");
		}
		System.out.println();
		double[] doubleA = new double[5];
		for (int i = 0; i < doubleA.length; i++) {
			System.out.print(doubleA[i] + "\t");
		}
		System.out.println();
		System.out.println("���� �迭");

		// �迭 ������ �ش�Ÿ���� �ʱⰪ���� �ʱ�ȭ��.
		// �⺻Ÿ���� 0�̳�, 0.0, ' '�� �ʱ�ȭ �Ǿ ���� �ʱ�ȭ �۾� ���̵� ���깮�� ����.
		// ����Ÿ���� �迭������ �� ����� ���� null�� �Ǿ�����.
		// ����ҿ� �ش��ϴ� ��ü�� �������� �ʰ� �ִ� ��.
		// �� ��ҿ� ���ٽ� NullPointerException�߻���.
		// null�� �ƴ� �ٸ� ������ �ʱ�ȭ�� ���־����.
		String[] stringA = new String[5];
		stringA[0] = "a";
		stringA[1] = "b";
		stringA[2] = "c";
		stringA[3] = "d";
		stringA[4] = "e";
		for (int i = 0; i < stringA.length; i++) {
			System.out.print(stringA[i].length() + "\t");
		}

	}

}
