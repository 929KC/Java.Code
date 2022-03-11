package inetheCsdn12_6;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请存入一定金额：");
		int money = sc.nextInt();
		System.out.println("请输入存入的年限：");
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
			System.out.println("输入的年限有误！");
		}
		System.out.println("存款：" + year + "年后的本息是：" + OutMoney);

	}

}
