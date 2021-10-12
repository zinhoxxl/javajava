package ch01_inter01_02;

public class PlayMain {
	// 필드
	// 인터페이스를 통한 메소드 호출 처리 - 비 종속적
	// 사용하는 객체가 변경되어도 기존방식대로 사용
	RemoteControl rc = new Television();
	
	
	public static void main(String[] args) {

		PlayMain p = new PlayMain();
		// 사용하는 객체가 변경이되어도 소스코드 변경없음!!
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
	}
	
}
		
		
		
