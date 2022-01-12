package Demo_12_24;

import java.util.Scanner;

public class text_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入10个整数数组的元素：");
		int[] arr = new int[10];
		int i;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("请输入你要查找的元素：");
		int k = sc.nextInt();
		for (i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == k) {
		System.out.println("已找到！在数组的第" + (i + 1) + "个位置.");
				break;
			} else if (i >= arr.length - 1 || i < 0) {
				System.out.println("不好意思，没找到！");
			}
		}//07黄茂荣
	}

}
