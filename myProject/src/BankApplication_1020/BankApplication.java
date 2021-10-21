package BankApplication_1020;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	private static final String DepositAmount = null;
	// List�� ����
	static List<Account> accountList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	static FileWriter fout=null;
	static String output;

	public static void main(String[] args) throws IOException {
	
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���»��� |2.���¸�� |3.���� |4.���|5.��ü|6.����");
			System.out.println("--------------------------------------------");
			System.out.println("����>");

			int selectNo = scanner.nextInt();
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				transfer();
				break;
			case 6:
				FileWriter fout = new FileWriter("c:\\temp\\transfer.txt", true);
				fout.write(output);
				fout.close();
				
				
				run = false;
				break;
			}

		}
		System.out.println("���α׷� ����");

	}

	
	// ���� �ϴ� �κ�
	// ��ü 1�������� balance-=amount, 2�������� balance+=amount;
	private static void transfer() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm");
		String result = df.format(today); // �ð�
		String line = scanner.nextLine();//�� �� ������ �Է¹ޱ�
		System.out.println("------");
		System.out.println("��ü");
		System.out.println("------");
		System.out.print("������ ���¹�ȣ");
		String ano1 = scanner.next();
		System.out.print("�޴� ���¹�ȣ");
		String ano2 = scanner.next();
		System.out.print("��ü��");
		int amount = scanner.nextInt();
		if (findAccount(ano1) == null || findAccount(ano2) == null) {
			System.out.println("[ ��ü ���� ] %d ���¹�ȣ�� Ȯ���ϼ���!");
		} else {
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2); // ����,���� ���¸� a1,a2�� �־���
			a1.setBalance(a1.getBalance() - amount);
			a2.setBalance(a2.getBalance() + amount);
		}
		System.out.printf("[ %d ]���� [ %s ]�� %n ��ü�Ǿ����ϴ�.%n", amount, result);
		System.out.println("�����ź��� ����: "+ findAccount(ano2));
		System.out.println("������ ����: "+ findAccount(ano1));
		
		output = "��ü��:"+amount+"\n"+"�ð�"+result+"\n"+"�޴���:"+findAccount(ano2)+"\n"+"������(����)"+findAccount(ano1);
	
	
	} 

	//���� �ϴ� �κ�
	
	
	
	
	
	
	
	
	
	
	// ���»����ϱ�
	private static void createAccount() {
		
		int c;//
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next();
		System.out.print("������:");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();

		accountList.add(new Account(ano, owner, balance));
		System.out.println("���:���°� �����Ǿ����ϴ�.");
	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		//
		for (int i = 0, size = accountList.size(); i < size; i++) { // for�� �����Ҷ� ���� accountList.size() ������
			System.out.println(accountList.get(i));
		}

	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ");
		String ano = scanner.next();
		System.out.print("���ݾ�");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.printf("%d ���� �ԱݵǾ����ϴ�.%n", amount);
		} else {
			System.out.println("���:���¹�ȣ�� Ȯ�����ּ���.");
		}
	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ");
		String ano = scanner.next();
		System.out.print("��ݾ�");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);

		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.printf("%d ���� ����Ǿ����ϴ�.%n", amount);
			} else {
				System.out.println("���:�ܰ� �����մϴ�.");
			}
		} else {
			System.out.println("���:���¹�ȣ�� Ȯ�����ּ���.");
		}
	}

	// Account �迭���� ano�� ������ Account ��ü ã��-
	private static Account findAccount(String ano) {
		Account account = null;// ���ú���
		for (int i = 0; i < accountList.size(); i++) {
			account = accountList.get(i);
			if (account.getAno().equals(ano))
				break;
		}
		return account; 
	}
}