package ch04;

public class Lender {

	// 필드
	static final String bookNo = "111";
	static int seq = 0;
	private String bookNum;
	private String bookName;
	private int qty;

	{
		seq++;
		bookNum = bookNo + "-" + String.format("%03d" , seq); // 도서 시리얼넘버 String.format사용해서 001만들기

	}
		
		
	// 생성자 
	public Lender(String name, int qty) {

		this.bookName = name;
		this.qty = qty;
	}

	// 메소드

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

// Stock 정보 출력
	@Override
	public String toString() {
		return "Stock [ 제품시리얼넘버=" + bookNum + ", 제품명=" + bookName + ", 재고량=" + qty + " ]";
	}
}
