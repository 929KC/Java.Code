package inthecsdn1;

import java.util.Scanner;

public class TestNum1 {
/*
 * 求指定两个数的最大公约数和最小公倍数
 * for循环条件控制语句？？？18行
 */
	public static void main(String[] args) {
		System.out.println("请输入两个数：");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		int  d=ziDag(a,b);
		long e=zxgbs(a,b);
                System.out.println("最大公约数为："+d);
                System.out.println("最小公倍数："+e);
	}
            public static int ziDag(int a,int b) {
            	int min=a<b ? a:b;
            	for(int i=min; i>=1; i--) {
            		if(a%i==0&&b%i==0) {
            			return i;
            		}
            	}
            	return 0;
            }
            public static long zxgbs(int a,int b) {
            	
            	int max=a>b? a:b;
            	 for(long i=max; ;i+=max) {
            		 if(i%a==0 && i%b==0) {
            			 return i;
            		 }
            	 }
            }
}
