package ch1;

public class ch01 {

	public static void main(String[] args) {
		//int 타입 변수 선언시 int 타입이고 변수명이 다른 경우  ,로 나열해서 선언 가능
		int a=3, b=3, c=3;  // int b=3; int c=3;
		
		//대입 연산자 사례
		a+=3; // a=a+3 = 6; // a=6
		b*=3; // b=b*3 = 9; // b=9
		c%=2; // c=c%2 = 1; // c=1
		
		//자바 언어로 개발시 여러개의 매개변수(연수,arguments)로 만들지 않아서 그렇다.
		//System.out.println(a, b, c);
		
		System.out.println("a=" + a + ",");
		
		

	}

}
