package Task1_5;

import java.util.Scanner;

public class Demo_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("学生序号：");
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
		int[][] err = { { 88, 100, 98, 76, 55 }, 
				{ 78, 99, 67, 56, 87 } };
		System.out.println("数学和英语成绩分别为：");
		for (int i = 0; i < err.length; i++) {
			for (int j = 0; j < err[0].length; j++) {
				System.out.print(err[i][j] + "\t");
			}
			System.out.println();
		}
		// 07黄茂荣
	}
}
