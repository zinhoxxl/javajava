package ExamChapter6_02_07;

public class SnowTireExample {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run(); // 자식으로 호출
		tire.run(); // 부모로 호출
	}
}

class Tire { // 부모

	public void run() {
		System.out.println("일반타이어가 굴러갑니다");
	}
}

class SnowTire extends Tire {
	@Override
	public void run() { // run을 재정의
		System.out.println("스노우 타이어가 굴러갑니다");
	}

}
