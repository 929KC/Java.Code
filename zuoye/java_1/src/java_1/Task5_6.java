package java_1;

import java.util.Scanner;

public class Task5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����볤���εĳ���");
		int chang = sc.nextInt();
		System.out.println("�����볤���εĿ�");
		int kuan = sc.nextInt();
		int zhouchang = ZhouChang(chang, kuan);
		System.out.println("�����ε��ܳ���" + zhouchang);
		int mianji = MianJi(chang, kuan);
		System.out.println("�����ε����" + mianji);
	}

	public static int ZhouChang(int chang, int kuan) {
		int sum1 = (chang + kuan) * 2;
		return sum1;
	}

	public static int MianJi(int chang, int kuan) {
		int sum2 = chang * kuan;
		return sum2;
		//��ï��
	}
}
