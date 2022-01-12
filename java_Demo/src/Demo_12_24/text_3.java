package Demo_12_24;

import java.util.Scanner;

public class text_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("输入之前的数组");
		int arr[] = new int[] { 2, 5, 6, 7, 8, 9, 10, 0 };
		for (int i = 0; i <= arr.length - 2; i++) {
			System.out.printf("%d\t",arr[i]);
		}
		System.out.println();
		System.out.print("请输入一个数：");
		int number = sc.nextInt();
		arr[arr.length-1]=number;
		for (int i=arr.length-1;i>0;i--) {
			if(arr[i]<arr[i-1]) {
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println();
		System.out.print("插入后的数组：");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.printf("%d\t", arr[i]);
		}
	}

}
