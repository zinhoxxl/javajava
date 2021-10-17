package chapter11Exam_03;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) { // 매개변수로 학생값을 받음
		this.studentNum = studentNum;
	}
	
	
	public String getStudentNum() {
		return studentNum;
		
	} // 여기서 부터 정답!
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}
