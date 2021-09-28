package ch7_Continue;

public class Continue3 {

	public static void main(String[] args) {
        //이증 for문내의 continue;
		for (int i = 0; i <= 9; i++) { 
			System.out.print("i" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j);
				if (j > 2)
					continue; //continue를 감싸는 가장 가까운 블럭의 for시작점으로 돌아감
				System.out.print("나두 출력되나\t");
			}
			System.out.println();
		}

	}

}
