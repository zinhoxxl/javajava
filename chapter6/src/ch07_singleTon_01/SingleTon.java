package ch07_singleTon_01;

// �̱������� Ŭ���� ����
public class SingleTon {

	// 1. �ڽ�Ÿ���� static�ʵ� ����
	private static SingleTon instance;
	
	// 2. �����ڸ� �ܺο��� ���� ���ϰ� private���� ó��
	private SingleTon() {}

	// 3. public�޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon getInstance() {
		if(instance==null)/*��ü����Ȯ��*/ 
			instance = new SingleTon();
		return instance;
	}
	// �޸� Ȱ��鿡���� ������ �ӵ��鿡���� ����
	
	
	
	
}
