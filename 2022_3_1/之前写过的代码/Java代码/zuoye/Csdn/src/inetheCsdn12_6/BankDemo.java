package inetheCsdn12_6;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ����");
		int money = sc.nextInt();
		System.out.println("�������������ޣ�");
		int year = sc.nextInt();
		double OutMoney = 0;
		if (year == 1) {
			OutMoney = money + (money * 2.25/100 * year);
		} else if (year == 2) {
			OutMoney = money + (money * 2.7 /100* year);
		} else if (year == 3) {

			OutMoney = money + (money * 3.25/100* year);
		} else if (year == 5) {

			OutMoney = money + (money * 3.6 /100* year);
		} else {
			System.out.println("�������������");
		}
		System.out.println("��" + year + "���ı�Ϣ�ǣ�" + OutMoney);

	}

}
