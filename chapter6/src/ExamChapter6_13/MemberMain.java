package ExamChapter6_13;

public class MemberMain {

	public static void main(String[] args) {

		Member user1 = new Member("ȫ�浿","hong");
		Member user2 = new Member();
		user2.setId("java");
		user2.setName("����ȣ");
		
	}

}

class Member {

	// �ʵ� -- 13����
	String name;
	String id;
	String password;
	int age;

	
	// ������ -- 14�� ��
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// default ������
	public Member() {} // �ҽ����� �ϰ͵� ���þ��ϰ� �����ڸ� ȣ��, user2������ ���´�
	
	
	
	// �޼ҵ�
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}