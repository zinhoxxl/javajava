package ExamChapter6_02_07;

public class SnowTireExample {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); // �ڽ����� ȣ��
		tire.run(); // �θ�� ȣ��     
		
	}

}  
