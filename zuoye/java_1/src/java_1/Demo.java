package java_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("�������1������");
	a=sc.nextInt();
	System.out.println("�������2������");
	b=sc.nextInt();
	System.out.println("�������3������");
	c=sc.nextInt();
	if(a>b) {
		if(a>c) {
			System.out.println(a+","+b+","+c+"�������Ϊ��"+a);
		}else {
			if(b>c) {
				System.out.println(a+","+b+","+c+"�������Ϊ��"+b);
			}else {
				System.out.println(a+","+b+","+c+"�������Ϊ��"+c);
			}
		}
	}
	}

}
