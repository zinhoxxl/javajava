package ch01;

// �������̽� ����
public interface G1 {

	int a = 10; // static final �����ص� �ڵ�������

	void a(); // public abstract �����ص� �ڵ�������
}

// ����
class G2 implements G1 {

	@Override
	public void a() { // �ݵ�� ������
		System.out.println("aa");
	}

}
// ����
class G3 implements G1 {

	@Override
	public void a() {
		System.out.println("bb");
	}

}