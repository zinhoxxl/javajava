package ch01_Object;

// 4. thread, 1. collection, 3. network, 2. file�����, ������ �߿�
public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		return this.id.equals(((Member)obj).id); 
	}

}
