package ch4_Array2;

public class Array2Exam1 {

	public static void main(String[] args) {
		
		int[][] scores = new int[2][3];
		scores[0][0]=1; scores[0][1]=2; scores[0][2]=3;
		scores[1][0]=4; scores[1][1]=5; scores[1][2]=6;
		//2차원에서 length의 값은, 1차원 배열의 갯수 의미
		System.out.println("1차원배열의 갯수:"+scores.length); // 2
		//출력
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i][0]+"  ");
			System.out.print(scores[i][1]+"  ");
			System.out.println(scores[i][2]+"  ");
		}

	}

}
