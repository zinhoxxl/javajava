package ch1;

public class ch02 {

	public static void main(String[] args) {
		
		
		int score = 95;
		//char ���� ����
		char grade;
		//���ǹ� if �� else ����
		if(score > 90) {// if��
			grade = 'A';
		}else {//else��
			grade = 'B';
		}
		System.out.println("���:" + grade);//String + char => String + String => "���:" + 'A' => "���:"+"A"=>"���A"
		
		//
		score = 80;
		grade = score>90 ? 'A' : 'B';
			System.out.println("���:" + grade); //
		
		}

	}


