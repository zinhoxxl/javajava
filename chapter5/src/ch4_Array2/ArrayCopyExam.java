package ch4_Array2;

public class ArrayCopyExam {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		//for (int i = 0; i < oldStrArray.length; i++) // [null] [null] [null] [null] [null]
		//	newStrArray[i] = oldStrArray[i];

		// System.arrayCopy());
				//arrayCopy (소스,소스의 시작index, 타겟 ,타겟의 시작index, 복사할 길이)
				System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		
		for (int i = 0; i < newStrArray.length; i++) //// ["java"] ["array"] ["copy"] [null] [null]
			System.out.println(newStrArray[i]);  

		
		System.out.println("\n---------------------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for (int i = 0; i < newStrArray.length; i++) 
			System.out.print(newStrArray[i]+"  ");
		
		System.out.println("\n---------------------------------");
		System.arraycopy(oldStrArray, 1, newStrArray, 0, oldStrArray.length-1);
		for (int i = 0; i < newStrArray.length; i++) 
			System.out.print(newStrArray[i]+"  ");
		
		
	}

}
