package java_1;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          System.out.println("�������һ������");
          int num1=sc.nextInt();
          System.out.println("������ڶ�������");
          int num2=sc.nextInt();
          System.out.println("���������������");
          int num3=sc.nextInt();
          int min=GetMinValue(num1, num2, num3);
          System.out.println(num1+","+num2+","+num3+"����С���ǣ�"+min);
	}
	public static int GetMinValue(int num1,int num2,int num3) {
		int Min=num1;
		if(num2<Min) {
			Min=num2;
		}else {
			Min=num3;
		}
		return Min;
		//��ï��
	}
}