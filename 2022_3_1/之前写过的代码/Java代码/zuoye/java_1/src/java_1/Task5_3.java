package java_1;

import java.util.Scanner;

public class Task5_3 {
	public static void main(String[] args) {
		 QiuSum();
	}

	public static int QiuSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入n的值：");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("n的值应该大于等于1！");

		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println("1到50的偶数和：" + sum);
		return sum;
		//黄茂荣
	}
}
