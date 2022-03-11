package inthejava_12_5;

import java.util.Scanner;

public class Text_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, k = 0;
		float sum = 0, average = 0;
		while (i <= 3) {
			System.out.println("请输入第" + i + "门课程成绩：");
			int score = sc.nextInt();
			if (score >= 0) {
				sum += score;
				k++;
			}
			i++;
		}
		average = sum / k;
	System.out.printf("你一共输入了" + k + "门课程的总成绩是" + 
		"：%.1f,\n平均分:%.1f", sum, average);
	}

}
