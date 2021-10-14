package ch02_Objects_hash;

import java.util.Objects;

public class HashExample {
	public static void main(String[] args) {

		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));

	}

	static class Student {
		int sno;
		String name;
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			// hash() 각객체의 해시값
			return Objects.hash(sno, name); // sno의 해시코드, name의 해시코드
		    // return this.sno+this.name.hashCode();
		}
	}

}
