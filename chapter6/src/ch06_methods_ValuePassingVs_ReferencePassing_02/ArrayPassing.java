package ch06_methods_ValuePassingVs_ReferencePassing_02;

public class ArrayPassing {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		// �迭�� ��ü - �����ּҰ��� �Ű����� ������ ���� ��.
		increase(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}

	} // main() ��.

	// �迭�� �Ű������� ���޵ȴٴ� ���� �����ϴ� �ּҰ��� ���� �ȴٴ� ��.
	static void increase(int[] array) {
		// ���ο� �迭 ����
		int[] newArr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArr[i] = array[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			array[i]++; // int x = array[i]; x++; array[i]=x; // ������� ����� ���� 1�� ����
		}

		System.out.println("�޼ҵ忡�� ���� ������ �迭 �� ��Ұ�");
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i] + " ");
			newArr[i] = array[i];
		}
		System.out.println(); 
	}

}
