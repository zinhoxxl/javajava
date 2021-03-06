package ch02_Arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {

		Member m1 = new Member("홍길동"); // D64D
		Member m2 = new Member("박동수"); // BC15
		Member m3 = new Member("김민수"); // AE40
		Member[] members = {m1,m2,m3};
		
		for(Member m : members)
			System.out.println(m);
		
		// 오름차순 정렬
		Arrays.sort(members);
		for(Member m : members) 
			System.out.println(m);
		
	}

}
// sort메소드 사용하는 객체는 Comparable인터페이스로 구현된 객체만 가능
class Member implements Comparable<Member> { // <T> <>안에 있는것 외에 다른 타입은 올수없다!

	String name;
	
	public Member(String name) {this.name = name;}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name); // 홍길이(이가 other), 홍길동(동이 this)
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
}