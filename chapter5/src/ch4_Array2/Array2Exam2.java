package ch4_Array2;

public class Array2Exam2 {

	public static void main(String[] args) {
		
		int[][] scores = new int[2][3];
		scores[0][0]=1; scores[0][1]=2; scores[0][2]=3;
		scores[1][0]=4; scores[1][1]=5; scores[1][2]=6; 
		//2�������� length�� ����, 1���� �迭�� ���� �ǹ�
		System.out.println("1�����迭�� ����:"+scores.length); // 2
		
		System.out.println("�� 1�����迭�� ����� ��:"+scores[0].length);
		System.out.println("�� 1�����迭�� ����� ��:"+scores[1].length); 
		
		
		//���
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) { 
			System.out.print(scores[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
