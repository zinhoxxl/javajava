package ch06;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();

/*
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		vehicle = taxi;
		taxi = (Texi) vehicle;
		texi.checkFare();

		vehicle = bus;
		bus = (Texi) vehicle;
		bus.checkFare();
*/
		// �Ű������� ������
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
