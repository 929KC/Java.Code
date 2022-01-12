package Demo_12_24;

import java.util.Scanner;

public class text_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 98, -45, 67, 23, -1, 12, 9 };
		System.out.print("排序之前的数组");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		for (int index = 0; index < arr.length - 1; index++) {
			for (int i = 0; i < arr.length - 1 - index; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}}
			System.out.println();
			System.out.print("排序后的数组：");
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("%d\t", arr[i]);
			}
				//07黄茂荣
		
	}
}
