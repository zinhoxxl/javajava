package ch4_Array2;

public class ArrayCopyExam2 {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// for (int i = 0; i < oldStrArray.length; i++) // [null] [null] [null] [null]
		// [null]
		// newStrArray[i] = oldStrArray[i];

		// System.arrayCopy()); - 깊은 copy, 새로운 배열을 생성한 후에 사용
		// arrayCopy (소스,소스의 시작index, 타겟 ,타겟의 시작index, 복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		for (int i = 0; i < newStrArray.length; i++) //// ["java"] ["array"] ["copy"] [null] [null]
			System.out.print(newStrArray[i] + "  ");

		System.out.println("\n------------------------------");
		// java.lang.ArrayIndexOutOfBoundsException : 소스의 갯수가 2개인데 타겟배열의 index번호를 초과시
		// 오류발생.
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
