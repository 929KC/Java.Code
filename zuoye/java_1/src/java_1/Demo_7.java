package java_1;

import java.util.Scanner;

public class Demo_7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("请输入三角形的第一条边：");
		a=sc.nextInt();
		System.out.println("请输入三角形的第二条边：");
		b=sc.nextInt();
		System.out.println("请输入三角形的第三条边：");
		c=sc.nextInt();
		if(a==b&&b!=c || b==c&&a!=c || a==c&&c!=b) {
			System.out.println("输入的三条边构成等腰三角形！");
		}else if(a==b&&b==c) {
			System.out.println("输入的三条边构成的等边三角形！");
			
		}else if(a+b>c&&b+c>a&&c+a>b) {
			System.out.println("输入的三条边能构成三角形：");
		}else {
			System.out.println("输入的三条边构成不三角形！");
		}
	}

}
