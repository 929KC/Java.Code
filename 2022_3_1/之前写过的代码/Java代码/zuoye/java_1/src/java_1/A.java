package java_1;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          System.out.println("请输入第一个数：");
          int num1=sc.nextInt();
          System.out.println("请输入第二个数：");
          int num2=sc.nextInt();
          System.out.println("请输入第三个数：");
          int num3=sc.nextInt();
          int min=GetMinValue(num1, num2, num3);
          System.out.println(num1+","+num2+","+num3+"的最小数是："+min);
	}
	public static int GetMinValue(int num1,int num2,int num3) {
		int Min=num1;
		if(num2<Min) {
			Min=num2;
		}else {
			Min=num3;
		}
		return Min;
		//黄茂荣
	}
}