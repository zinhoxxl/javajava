package ch6_Break;

public class Break2 {

	public static void main(String[] args) {
		// 이중 반복 문
		for (int i = 0; i <= 9; i++) {
			System.out.print("i=" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j + "\t");
				if (j > 3)
					break; // 안쪽 for문만 벗어남
			}
			System.out.println(); // 한줄 아래로 내리기
		}
 
	}

}
