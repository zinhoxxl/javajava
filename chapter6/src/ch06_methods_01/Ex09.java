package ch06_methods_01;

public class Ex09 {

	public static void main(String[] args) {

		// default 생성자가 없으면 default 생성자 호출 불가
		// 매개변수 3개짜리 생성호출 하여 객체 생성
		B3 b = new B3(98, 89, 93);
		b.sum();
		System.out.println("합:"+b.sum); // 필드 접근
		int average = b.average();
		System.out.println("평균:"+average);

	}

}

class B3 {
	// 필드
	int kor, eng, mat, sum; // kor = 0, eng = 0, mat = 0, sum= 0인상태

	// 생성자
	B3(int k, int e, int m) { // 생성자에 의해 초기화 처리
		kor = k;
		eng = e;
		mat = m;
	}

	// 메소드
	// 4유형 - 매재변수x, 리턴타입x
	void sum() {
		sum = kor + eng + mat; // sum () 메소드에 의해 sum = 0 으로 초기화 된상태에서 kor+eng+mat결과값으로 갱신.
	}

	// 2유형 - 매재변수x, 리턴타입o
	int average() {
		return sum / 3; // sum() 메소드의 처리 결과에 의해 값을 평균으로 처리한 결과 리턴
	}

}