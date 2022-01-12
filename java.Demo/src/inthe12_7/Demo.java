package inthe12_7;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int number = sc.nextInt();
		int i = 0, sum = 0;
		do {
			sum += i % 10;
			i++;
		} while (i <= number);
		System.out.println(sum);

	}

}
