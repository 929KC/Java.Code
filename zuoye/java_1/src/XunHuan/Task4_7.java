package XunHuan;

import java.util.Scanner;

public class Task4_7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入n的值：");
	int n=sc.nextInt();
	int  sum=0;
	for(int i=1;i<=n; i++) {
		sum+=i;
	}
     System.out.println("1+2+3+…………7之和是："+sum);
     //07黄茂荣
	}

}
