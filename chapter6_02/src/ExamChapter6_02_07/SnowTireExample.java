package ExamChapter6_02_07;

public class SnowTireExample {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); // 자식으로 호출
		tire.run(); // 부모로 호출     
		
	}

}  
