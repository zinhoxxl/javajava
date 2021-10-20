package chapter15_08;

import java.util.Objects;

public class Student {

	public int studentNum; // key
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	// 정답
//	@Override
//	public int hashCode() {
//		return studentNum;
//
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//         if(!(obj instanceof Student)) return false;
//         Student student = (Student) obj;
//         if(studentNum != student.studentNum) return false;
//         return true;
//	 }

	// 방법은 매우 많다
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		return this.studentNum == ((Student) obj).studentNum;
	}

}
