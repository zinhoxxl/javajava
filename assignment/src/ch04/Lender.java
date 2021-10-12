package ch04;

public class Lender {

	// �ʵ�
	static final String bookNo = "111";
	static int seq = 0;
	private String bookNum;
	private String bookName;
	private int qty;

	{
		seq++;
		bookNum = bookNo + "-" + String.format("%03d" , seq); // ���� �ø���ѹ� String.format����ؼ� 001�����

	}
		
		
	// ������ 
	public Lender(String name, int qty) {

		this.bookName = name;
		this.qty = qty;
	}

	// �޼ҵ�

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

// Stock ���� ���
	@Override
	public String toString() {
		return "Stock [ ��ǰ�ø���ѹ�=" + bookNum + ", ��ǰ��=" + bookName + ", ���=" + qty + " ]";
	}
}
