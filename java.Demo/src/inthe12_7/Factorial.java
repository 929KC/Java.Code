package inthe12_7;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������׳ˣ�");
		int number=sc.nextInt();
		f(number);

	}
        public static void f(int n) {
        	if(n<0) {
        		System.out.println("nû�н׳ˣ�");
        		 return ;
        	}
        	if(n==0) {
        		System.out.println("0�Ľ׳���1");
        	}
        	long r=n;
        	for(int i=n-1; i>=1; i--) {
        		r*=i;
        	}
        	System.out.println(n+"�Ľ׳ˣ�"+r);
        	
        }
}
