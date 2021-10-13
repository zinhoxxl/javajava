package ch01_Object;

// 4. thread, 1. collection, 3. network, 2. file�����, ������ �߿�
public class Student {
	public String id;

	public Student(String id) {
		this.id = id;
	}
// Object�� ���� ��ӹ���
// equals �޼ҵ带 ������ �Ͽ� ���� ���� ���� �����
	@Override
	public boolean equals(Object obj) {
		
		// �񱳽�
		// ���� Ÿ���� �ƴϸ� false
		if (obj instanceof Member) {
		    // ���� Ÿ���̸� id�� ���� ���� ��� true/false
			return this.id.equals(((Student) obj).id);
		}
		return false;
	}

}
