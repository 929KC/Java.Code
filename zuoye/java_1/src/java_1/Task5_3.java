package java_1;

import java.util.Scanner;

public class Task5_3 {
	public static void main(String[] args) {
		 QiuSum();
	}

	public static int QiuSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������n��ֵ��");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("n��ֵӦ�ô��ڵ���1��");

		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println("1��50��ż���ͣ�" + sum);
		return sum;
		//��ï��
	}
}
