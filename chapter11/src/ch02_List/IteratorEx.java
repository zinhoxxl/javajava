package ch02_List;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
//		Iterator<Integer> it = v.iterator();
//		// iterator 소모
//		while(it.hasNext()) {
//			int n = it.next();
//			System.out.println(n);
//		}
//		// 재지정
//		int sum = 0;
//		it= v.iterator();
//		while(it.hasNext()) {
//			int n = it.next();
//			sum += n;
//		}
		
		for(int i =0; i <v.size();i++)
			System.out.println(v.get(i));
		
		int sum = 0;
		for(int i =0; i <v.size();i++)
			sum += i;
		System.out.println("벡터에 있는 정수 합:"+sum);
		
	}

}
