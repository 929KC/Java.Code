package inthejava_12_5;

import java.util.Scanner;

public class Text_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, k = 0;
		float sum = 0, average = 0;
		while (i <= 3) {
			System.out.println("�������" + i + "�ſγ̳ɼ���");
			int score = sc.nextInt();
			if (score >= 0) {
				sum += score;
				k++;
			}
			i++;
		}
		average = sum / k;
	System.out.printf("��һ��������" + k + "�ſγ̵��ܳɼ���" + 
		"��%.1f,\nƽ����:%.1f", sum, average);
	}

}
