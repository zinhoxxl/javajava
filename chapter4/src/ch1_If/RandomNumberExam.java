package ch1_If;

public class RandomNumberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ran = (int) (Math.random()*10); //0.0<= 범위 < 10.0
		System.out.println(ran);
		
		int ranI = (int) (Math.random()*10)+1; // 0+1 <= 범위 +1 < 10 +1 : 0~9 =1~10
	
		System.out.println(ranI);
	}

	
}
