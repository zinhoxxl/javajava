package ExamChapter6_13;

public class MemberMain {

	public static void main(String[] args) {

		Member user1 = new Member("홍길동","hong");
		Member user2 = new Member();
		user2.setId("java");
		user2.setName("이진호");
		
	}

}

class Member {

	// 필드 -- 13번답
	String name;
	String id;
	String password;
	int age;

	
	// 생성자 -- 14번 답
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// default 생성자
	public Member() {} // 소스에서 암것도 선택안하고 생성자만 호출, user2에러를 막는다
	
	
	
	// 메소드
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