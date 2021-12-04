package java_1;

import java.util.Scanner;

public class Task5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		int chang = sc.nextInt();
		System.out.println("请输入长方形的宽：");
		int kuan = sc.nextInt();
		int zhouchang = ZhouChang(chang, kuan);
		System.out.println("长方形的周长：" + zhouchang);
		int mianji = MianJi(chang, kuan);
		System.out.println("长方形的面积" + mianji);
	}

	public static int ZhouChang(int chang, int kuan) {
		int sum1 = (chang + kuan) * 2;
		return sum1;
	}

	public static int MianJi(int chang, int kuan) {
		int sum2 = chang * kuan;
		return sum2;
		//黄茂荣
	}
}
