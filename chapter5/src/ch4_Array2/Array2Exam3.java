package ch4_Array2;


public class Array2Exam3 {

	public static void main(String[] args) {
		
		//초기값으로 2차원배열 생성, 1차원배열 두개로 2차원 배열 하나 생성
		//타입 [][] 변수 = new 타입[][]{{},{}}; 
		int[][] scores = new int[][] {{1,2},{4,5,6}};  
		scores[0][0]=1; scores[0][1]=2; 
		scores[1][0]=4; scores[1][1]=5; scores[1][2]=6;
		
		
		//2차원에서 length의 값은, 1차원 배열의 갯수 의미
		System.out.println("1차원배열의 갯수:"+scores.length); // 2
		
		System.out.println("각 1차원배열의 요소의 수:"+scores[0].length);
		System.out.println("각 1차원배열의 요소의 수:"+scores[1].length); 
		
		//출력
				for(int i = 0; i < scores.length; i++) { // i는 scores.length로 1차원배열의 갯수
					for(int j = 0; j < scores[i].length; j++) { // j는 각 행의 1차원배열의 요소수
					System.out.print(scores[i][j]+"  ");
					}
					System.out.println();
				}
		
				//과제
				//향상된 for문을 이용하여 2차원 배열의 요소들을 모두 출력하세요.
		
	
	}

}
