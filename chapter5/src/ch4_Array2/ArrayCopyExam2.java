package ch4_Array2;

public class ArrayCopyExam2 {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// for (int i = 0; i < oldStrArray.length; i++) // [null] [null] [null] [null]
		// [null]
		// newStrArray[i] = oldStrArray[i];

		// System.arrayCopy()); - ���� copy, ���ο� �迭�� ������ �Ŀ� ���
		// arrayCopy (�ҽ�,�ҽ��� ����index, Ÿ�� ,Ÿ���� ����index, ������ ����)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		for (int i = 0; i < newStrArray.length; i++) //// ["java"] ["array"] ["copy"] [null] [null]
			System.out.print(newStrArray[i] + "  ");

		System.out.println("\n------------------------------");
		// java.lang.ArrayIndexOutOfBoundsException : �ҽ��� ������ 2���ε� Ÿ�ٹ迭�� index��ȣ�� �ʰ���
		// �����߻�.
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length - 1);
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + "  ");

		
		System.out.println();
		int srcPos = 1;
		int num = oldStrArray.length - srcPos; // 3-1=2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + "  ");
		

	}

}
