package Task4_1;

import java.util.Scanner;

public class Demo_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] drr = new int[10];
		int[] err = new int[10];
		System.out.println("请输入第一个数组的10个整数：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个整数：");
			arr[i] = sc.nextInt();
		}

		System.out.println("请输入第二个数组的10个整数：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个整数：");
			drr[i] = sc.nextInt();
		}

		for(int i=0;i<err.length;i++) {
			err[i]=(arr[i]+drr[i]);
		}
		
		System.out.println("第三个数组的10个整数：");
		
		for(int i=0;i<err.length;i++) {
			System.out.print(err[i]+"\t");
			//07黄茂荣
		}
	}

}
