package java_1;

import java.util.Scanner;

public class Task5_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入正整数n的值：");
		int n=sc.nextInt();
		int sum2=QiuSum(n);
		System.out.println("1到50的奇数之和是："+sum2);
	}	
	
    public static  int QiuSum(int num) {
    		int sum=0;
    	for(int i=1; i<=num; i++) {
    		if(i%2!=0) {
    			sum+=i;
    		}
    		i++;
    	}
    	return sum; 
    	//黄茂荣
    }
}
