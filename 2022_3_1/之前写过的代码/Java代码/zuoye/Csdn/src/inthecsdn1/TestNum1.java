package inthecsdn1;

import java.util.Scanner;

public class TestNum1 {
/*
 * ��ָ�������������Լ������С������
 * forѭ������������䣿����18��
 */
	public static void main(String[] args) {
		System.out.println("��������������");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		int  d=ziDag(a,b);
		long e=zxgbs(a,b);
                System.out.println("���Լ��Ϊ��"+d);
                System.out.println("��С��������"+e);
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
