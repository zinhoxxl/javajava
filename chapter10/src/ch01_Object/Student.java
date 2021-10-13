package ch01_Object;

// 4. thread, 1. collection, 3. network, 2. file입출력, 순서로 중요
public class Student {
	public String id;

	public Student(String id) {
		this.id = id;
	}
// Object로 부터 상속받은
// equals 메소드를 재정의 하여 논리적 동등 여부 만들기
	@Override
	public boolean equals(Object obj) {
		
		// 비교시
		// 같은 타입이 아니면 false
		if (obj instanceof Member) {
		    // 같은 타입이면 id값 끼리 비교한 결과 true/false
			return this.id.equals(((Student) obj).id);
		}
		return false;
	}

}
