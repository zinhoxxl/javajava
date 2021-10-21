package ch01;

public class Ex0101 {
	public static void main(String[] args) {

		// 인터페이스의 me()호출 결과 "10+20=30"이라는 문장 출력되도록
		// 1.무명객체 생성 처리, 2.람다식 변환
		
		// 1.무명객체 생성 처리
		MyInter1 fi = new MyInter1() {
			
			@Override
			public void me() {
                 System.out.println("10+20=30");				
			}
		};
		fi.me();
		
		// 2.람다식 변환
		fi = ()-> System.out.println("10+20=30");
		fi.me();
	}

}
