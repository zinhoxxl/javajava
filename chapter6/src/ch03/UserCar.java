package ch03;

public class UserCar {

	public static void main(String[] args) {
		
		Car car = new Car();
		//필드선언시 값을 주면 해당 값 출력
		System.out.println("model:"+ car.model);
		System.out.println("maxSpeed:"+car.maxSpeed);
		//필드선언시 값을 주지않으면 해당 타입의 기본값으로 출력
		System.out.println("현재속도:"+car.currentSpeed);
		System.out.println("시동여부:"+car.engineStart);
		System.out.println("Tire:"+car.tire);
		
	}

}
