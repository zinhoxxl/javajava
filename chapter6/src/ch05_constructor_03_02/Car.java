package ch05_constructor_03_02;

public class Car {
	
	// 필드
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	// 동일 클래스내에서 다른 생성자 호출시
	// this()메소드 호출
	// 주의사항!!! - 반드시 호출하는 생성자의 첫 라인에 선언해야함.~!!!
	Car() {
		   this("그랜저","흰색",200);
	};
	Car (String model) {
	    // default생성자 호출
		this.model = model;
		System.out.println("그 다음 실행되지?");
		
	} 
	
	Car (String model, String color) {
		this(model);
		this.color = color;
		System.out.println("매개변수 두개짜리 실행되지?");
		
	}  
	
	Car (String model, String color, int maxSpeed) {
		this(model,color);
		this.maxSpeed = maxSpeed;
		System.out.println("매개변수 세개짜리 실행되지?");
	} 
	

}
