package ch01;

// 인터페이스 선언(참조타입)
// 인터페이스의 구성멤버 - 상수, 추상메소드
public interface RemoteControl {

	// 상수
//	public static final int MAX_VOLUME = 10;
//	public static final int MIN_VOLUME = 0;

	public int MAX_VOLUME = 10; // 상수는 선언과 동시에 초기화 해야함
	public int MIN_VOLUME = 0;

	// 메소드 - 추상메소드
	void method(); // 선언부 ( 선언만해도 오류안남 실체가 없음)

}
// 인터페이스로 부터 실체 클래스 구현
class TVRemoteControl implements RemoteControl{
	@Override
	public void method() {
		System.out.println("실체 클래스메소드");
	}
}

 

class A {
	// 변수
	public int MAX_VOLUME; // 자동으로 0으로 초기화
	// 상수
	public int MIN_VOLUME = 0;

	// 메소드 - 추상메소드
	void method() {MAX_VOLUME = 10;} // 선언부 (선언시 실체가 있어야함)

}
