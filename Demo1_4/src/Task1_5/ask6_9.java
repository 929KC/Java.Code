package Task1_5;

import java.util.Scanner;

public class ask6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] arr = new double[3][4];
		double sum = 0.0, average = 0.0;
		int k = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print("�������" + (i + 1) + "λѧ���ĵ�" + (j + 1) + "�ſγ̵ĳɼ���");
				arr[i][j] = sc.nextDouble();
			}

		}
		int l = 0;
		while (k <= 3) {
			System.out.print("��" + k + "��ѧ���Ŀγ̳ɼ���");

			sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[l][j] + "\t");
				sum += arr[l][j];
			}

			average = sum / arr[0].length;
			l++;
			System.out.println("�ܳɼ���" + sum + "\t" + "ƽ����Ϊ��" + average);
			k++;

		}
	}

}
