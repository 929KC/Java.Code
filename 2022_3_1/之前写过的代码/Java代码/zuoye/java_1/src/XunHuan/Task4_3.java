package XunHuan;

import java.util.Scanner;

public class Task4_3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个正整数：");
	int number=sc.nextInt();
	int k=1,sum=1;
	         do {
	        	 sum*=k;
	        	 k++;
	         }while(k<=number);
			System.out.println(number+"的阶乘是："+sum);
			//07黄茂荣
	}

}
