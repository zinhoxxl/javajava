package ch08;

public class Car {

	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	// 메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isStop() { // boolean타입은 get보다는 is 사용!
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
}
