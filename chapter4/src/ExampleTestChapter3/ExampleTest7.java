package ExampleTestChapter3;

public class ExampleTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;   //5.0 % 0.0 나머지 => NaN
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			//오류는 나지 않지만 결과는 원하지 않는 결과 발생
			double result = z + 10;
			System.out.println("결과:" + result);
		 }
		
		
	}

}
