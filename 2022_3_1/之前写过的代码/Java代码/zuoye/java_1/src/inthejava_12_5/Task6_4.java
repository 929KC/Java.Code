package inthejava_12_5;
import java.util.Scanner;
public class Task6_4 {
	//黄茂荣07
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0, i;
		for (i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个 数字：");
			arr[i] = sc.nextInt();
//			if (arr[i] % 2 == 0) {
//				sum += arr[i];
//			}
		}
		sum+=arr[2]+arr[4]+arr[6]+arr[8]+arr[0];
		System.out.println("下标为偶数的元素之和是：" + sum);
	}

}
