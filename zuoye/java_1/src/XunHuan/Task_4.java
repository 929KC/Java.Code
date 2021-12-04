package XunHuan;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int n=sc.nextInt();
		int sum=0;
		int k=n;
		while(k>=1) {
			sum+=k;
			k--;
			
		}
		System.out.println(sum);
	}

}
