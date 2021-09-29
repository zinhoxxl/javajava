package ch3_Array;

/* 얕은복사와 깊은 복사*/
public class Ex12_CopyExam {

	public static void main(String[] args) {

		// 1.얕은 복사 - 배열 객체 1개 생성
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;  //참조하는 변수의 주소값을 넘겨서 생성
		
		for(int i =0; i<arr1.length;i++) System.out.print(arr1[1]);
		System.out.println();
		for(int i =0; i<arr2.length;i++) System.out.print(arr2[1]);
		System.out.println();
		System.out.println("----------------");
		System.out.println("arr1의 hash코드값:"+arr1.hashCode());
		System.out.println("arr2의 hash코드값:"+arr2.hashCode());
		System.out.println("----------------");

		// 2.깊은 복사 - 배열 객체 2개 생성
		int[] arr3 = {1,2,3,4,5};
		int[] arr4 = new int[5];  // 새로운 배열 객체 생성
		for(int i=0;i<arr3.length;i++) // 요소들을 넘김
			arr4[i] = arr3[3];
		
		for(int i =0; i<arr3.length;i++) System.out.print(arr3[1]);
		System.out.println();
		for(int i =0; i<arr4.length;i++) System.out.print(arr4[1]);
		System.out.println();
		System.out.println("----------------");
		System.out.println("arr3의 hash코드값:"+arr3.hashCode());
		System.out.println("arr4의 hash코드값:"+arr4.hashCode());

	}

}
