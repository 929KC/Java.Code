package Task4_1;

import java.util.Scanner;

public class Task6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("转换前的数组：");
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] drr = new int[3][2];
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				 drr[j][i] = arr[i][j];
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}

		System.out.println("转换后的数组：");
		for (int i = 0; i < drr.length; i++) {
			for (int j = 0; j < drr[0].length; j++) {
				System.out.print(drr[i][j] + "\t");
			}
			System.out.println("");
		}
//07黄茂荣
	}

}
