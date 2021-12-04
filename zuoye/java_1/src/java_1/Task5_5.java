package java_1;

import java.util.Scanner;

public class Task5_5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入第一个数：");
	int num1=sc.nextInt();
	System.out.println("请输入第二个数：");
	int num2=sc.nextInt();
	int sum2=QiuHe( num1, num2);
	System.out.println("二个数之和："+sum2);

	}
	public static  int QiuHe(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	//黄茂荣
}
