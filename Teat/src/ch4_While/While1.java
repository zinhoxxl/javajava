package ch4_While;

public class While1 {

	public static void main(String[] args) {

		int i = 0;
		//while(조건){실행문;}//{}내에 증/감처리
		while (i < 10) {
			System.out.println("Hello!!");
			System.out.println(i);
			i++; //while문은 조건이 false가 될수 있도록 하는 명령문이 블럭내에 추가되야함.
		}

	}

}
