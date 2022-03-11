package java_1;

import java.util.Scanner;

public class Task3_17_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,d1,d2;
		System.out.println("请输入100-999的整数：");
		number=sc.nextInt();
		if(number>100&&number<999) {
			d1=number/100;
			d2=number%10;
			if(d1==d2) {
				System.out.println(number+"是回文数");
			}else {
				System.out.println(number+"不是回文数");
			}
		}
	//07黄茂荣

	}

}
