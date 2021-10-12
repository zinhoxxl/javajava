package ch01;

// 인터페이스 선언
public interface G1 {

	int a = 10; // static final 생략해도 자동컴파일

	void a(); // public abstract 생략해도 자동컴파일
}

// 구현
class G2 implements G1 {

	@Override
	public void a() { // 반드시 재정의
		System.out.println("aa");
	}

}
// 구현
class G3 implements G1 {

	@Override
	public void a() {
		System.out.println("bb");
	}

}