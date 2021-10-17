package chapter11Exam_03;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) { // �Ű������� �л����� ����
		this.studentNum = studentNum;
	}
	
	
	public String getStudentNum() {
		return studentNum;
		
	} // ���⼭ ���� ����!
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
