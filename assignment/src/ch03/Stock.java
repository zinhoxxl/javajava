package ch03;

public class Stock {

	// 필드
	static final String itemNo = "111";
	static int seq = 0;
	private String item;
	private String name;
	private int qty;

	{
		seq++;
		item = itemNo + "-" + String.format("%03d" , seq); // 제품시리얼넘버 String.format사용해서 001만들기

//      이런 방법도 있다
//		DecimalFormat df = new DeciamalFormat("000");
//		item = itemNo + "-" + df.format(seq);
	}
		
		
		

	// 생성자 
	public Stock(String name, int qty) {

		this.name = name;
		this.qty = qty;
	}

	// 메소드

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Stock [ 제품시리얼넘버=" + item + ", 제품명=" + name + ", 재고량=" + qty + " ]";
	}

}
