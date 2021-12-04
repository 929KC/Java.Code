package XunHuan;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int  number=sc.nextInt();
		int i=1,sum=0;
		while(i<=number) {
			sum+=i;
			i++;
		}
         System.out.println(sum);
         //黄茂荣
	}

}
