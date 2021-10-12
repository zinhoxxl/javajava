package ch04_02;

public class Car {

	Tire[] tires = {
			new HanKookTire(),
			new HanKookTire(),
			new KumHoTire(),
			new KumHoTire(),
	};
	
	void run() {
		for(Tire tire : tires)
			tire.roll();
		
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
	} 
	
}
