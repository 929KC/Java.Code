package java_1;

import java.util.Scanner;

public class Task5_5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("�������һ������");
	int num1=sc.nextInt();
	System.out.println("������ڶ�������");
	int num2=sc.nextInt();
	int sum2=QiuHe( num1, num2);
	System.out.println("������֮�ͣ�"+sum2);

	}
	public static  int QiuHe(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	//��ï��
}
