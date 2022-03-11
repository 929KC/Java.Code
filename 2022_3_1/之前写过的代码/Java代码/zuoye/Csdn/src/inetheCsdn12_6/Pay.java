package inetheCsdn12_6;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入的手机号的尾号：");
		int card=sc.nextInt();
		switch(card) {
		case 8:
			System.out.println("需支付办卡费：50元");
			break;
		case 4:
			System.out.println("需支付办卡费：0元");
			break;
		default:
			System.out.println("需支付办卡费：20元");
			
		}
	}

}
