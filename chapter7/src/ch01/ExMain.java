package ch01;

public class ExMain {

	public static void main(String[] args) {
		// 인터페이스는 실체를 만들수 없는 클래스
		// RemoteControl rc = new RemoteControl();

		// 구현된 실체 클래스의 객체를 인터페이스에 대입
		RemoteControl rc = new TVRemoteControl();
		//인터페이스의 메소드 호출
		//실행은 실체클래스의 재정의 된 메소드내용이 실행.
		rc.method();
	}
}
		
	
		
