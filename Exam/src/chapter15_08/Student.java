package chapter15_08;

import java.util.Objects;

public class Student {

	public int studentNum; // key
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	// ����
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

	// ����� �ſ� ����
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		return this.studentNum == ((Student) obj).studentNum;
	}

}
