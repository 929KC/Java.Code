package Task1_5;

import java.util.Scanner;

public class Task6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int k = 0;	
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "�е�4������");
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}

		System.out.println("4*4��ά����");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}

		System.out.println("4*4��ά����Խ����ϵ�����");
		for (int j = 0; j < arr[0].length; j++) {
			System.out.print(arr[j][j] + "\t");
		}
		System.out.println("");

		System.out.println("4*4��ά���󷴶Խ����ϵ�����");
	
		for (int j = arr[0].length - 1; j >= 0; j--) {
			System.out.print(arr[k][j] + "\t");
			k++;
		}
		//07��ï��
	}

}
