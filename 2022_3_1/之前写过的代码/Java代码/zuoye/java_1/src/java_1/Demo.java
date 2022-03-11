package java_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("请输入第1个数：");
	a=sc.nextInt();
	System.out.println("请输入第2个数：");
	b=sc.nextInt();
	System.out.println("请输入第3个数：");
	c=sc.nextInt();
	if(a>b) {
		if(a>c) {
			System.out.println(a+","+b+","+c+"的最大数为："+a);
		}else {
			if(b>c) {
				System.out.println(a+","+b+","+c+"的最大数为："+b);
			}else {
				System.out.println(a+","+b+","+c+"的最大数为："+c);
			}
		}
	}
	}

}
