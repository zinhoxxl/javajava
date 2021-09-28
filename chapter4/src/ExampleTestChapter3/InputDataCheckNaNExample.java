package ExampleTestChapter3;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڰ� �ƴ� NaN�� �Է¹޾Ƽ� ���� ó��
		String userInput = "NaN";
		
		//Double�� doubleŸ���� ����Ÿ�� ����� ����ó�� ���ִ� Ŭ����
		//WRAPPERŬ���� ��� ��.
		//DoubleŸ���� ���� �����ϰ� �� ����
		Double a = Double.valueOf(5.0); // double������ ����
		Double b = Double.valueOf("5.0"); // double���� ���� ���ڿ��� ����
		
		System.out.println(a.doubleValue());
		System.out.println(b.doubleValue());
	    
		//DoubleŸ���� ���� doubleŸ������ auto unboxing�۸� �Ǳ� ����
	   System.out.println(a);
	   System.out.println(b);
	   double val = Double.valueOf(userInput);
	   
	   double currentBalance = 10000.0;
	   
	   if(Double.isNaN(Double.valueOf(currentBalance))) {
		   System.out.println("NaN�� �ԷµǾ� ó�� �Ҽ� ����");
	   }else {
		   currentBalance += val;
		   System.out.println(currentBalance);
	   }
	
	}

}
