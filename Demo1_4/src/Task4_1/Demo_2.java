package Task4_1;

import java.util.Scanner;

public class Demo_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		int j = 0, k = 0, a = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i + 1) + "学生的成绩：");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 60) {
				j++;
			}
			if (arr[i] >= 60 && arr[i] <= 80) {
				k++;
			}
			if (arr[i] > 80) {
				a++;
			}
		}
		System.out.println("60分以下的人数：" + j);
		System.out.println("60~80分以下的人数：" + k);
		System.out.println("80分以下的人数：" + a);
		//07黄茂荣
	}

}
