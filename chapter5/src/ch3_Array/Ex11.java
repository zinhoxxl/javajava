package ch3_Array;

public class Ex11 {

	public static void main(String[] args) {
		
		// 1차원 배열의 복사
		int[] intArr1 = {1,2,3,4,5};
		// 새로운 참조변수 선언 intArr1의 배열의 내용을 복사
		// 방법: intArr1이 참조하는 주소값을 전달하여 복사
		int[] intArr2 = intArr1;  // intArr2에는 intArr1의 주소값이 복사됨  (둘다 같은 주소를 공유함!!)
		                          // 즉, "얕은 복사" 라고 한다!
		for(int a : intArr1)
			System.out.print(a+"  ");
		System.out.println();
		for(int b : intArr2)
			System.out.print(b+"  ");
		
		System.out.println();
		System.out.println("------------------");
		
		// intArr2의 index번호 3에 해당하는 위치의 값 변경
		intArr2[3]= 10;
		for(int a : intArr1)
			System.out.print(a+"  ");
		System.out.println();
		for(int b : intArr2)
			System.out.print(b+"  ");
		System.out.println();
		

	}

}
