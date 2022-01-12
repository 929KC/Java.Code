package inthe12_7;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入整数，求阶乘！");
		int number=sc.nextInt();
		f(number);

	}
        public static void f(int n) {
        	if(n<0) {
        		System.out.println("n没有阶乘！");
        		 return ;
        	}
        	if(n==0) {
        		System.out.println("0的阶乘是1");
        	}
        	long r=n;
        	for(int i=n-1; i>=1; i--) {
        		r*=i;
        	}
        	System.out.println(n+"的阶乘："+r);
        	
        }
}
