package ch01_inter01_02;

public class Television implements RemoteControl {

	// �ʵ�
	private int volume;
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if(volume>MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("���� TV ����");
	}
}
