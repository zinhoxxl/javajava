package ch04;

public interface Tire {
public void roll();
	
	
}
class HanKookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("�ѱ�Ÿ�̾ �������ϴ�");
	}
}

class KumHoTire implements Tire {
	
	@Override
	public void roll() {
		System.out.println("�ѱ�Ÿ�̾ �������ϴ�");
	}
}
	