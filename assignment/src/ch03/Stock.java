package ch03;

import java.util.Arrays;

public class Stock {

	// �ʵ�
	static final String itemNo = "111";
	static int seq = 0;
	private String item;
	private String name;
	private int qty;

	{
		seq++;
		item = itemNo + "-" + seq + seq + seq; // ���°� ���� �ɶ����� ����
	}

	// ������
	public Stock(String name, int qty) {
		
		this.name = name;
		this.qty = qty;
	}

	// �޼ҵ�
	


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

	// Stock ���� ���
	@Override
	public String toString() {
		return "Stock [ ��ǰ�ø���ѹ�=" + item + ", ��ǰ��=" + name + ", �����=" + qty + " ]";
	}
	
	
}