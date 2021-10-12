package ch04;

public class Car {

	Tire fLTire = new HanKookTire();
	Tire fRTire = new HanKookTire();
	Tire bLTire = new KumHoTire();
	Tire bRTire = new KumHoTire();
	
	void run() {
		fLTire.roll();
		fRTire.roll();
		bLTire.roll();
		bRTire.roll();
		
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
	}
	
}
