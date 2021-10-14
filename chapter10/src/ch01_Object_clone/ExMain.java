package ch01_Object_clone;

import java.util.Arrays;

public class ExMain {
	public static void main(String[] args) {

		// 원본 객체
		int[] scores = {90,90};
		Car car = new Car("소나타");
		B original = new B("홍길동",25,scores,car);
        
		// 깊은복제
		B cloned = original.getB();
        
		// 복제본 수정
        cloned.scores[0] = 100;
        cloned.car.model = "그랜저";
		
        // 원본 변경여부 확인
        System.out.println("[복제 개체의 필드값]");
        System.out.println(cloned.car.model);
       for(int i; i<cloned.scores.length;i++)
    	   System.out.println(cloned.scores[i]);
        System.out.println("[원본 개체의 필드값]");
        System.out.println(cloned.car.model);
        for(int i; i<original.scores.length;i++)
        	System.out.println(original.scores[i]);
	}

}
