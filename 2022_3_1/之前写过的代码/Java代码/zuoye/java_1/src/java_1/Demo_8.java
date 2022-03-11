package java_1;

import java.util.Scanner;

public class Demo_8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int month,tickets;
		double sum;
		System.out.println("请输入月份：");
		month=sc.nextInt();
		System.out.println("请输入订购机票的数量：");
		tickets=sc.nextInt();
		if(month>=7&&month<=9 && tickets>20) {
			sum=15;
		}else if(month>=7&&month<=9 && tickets<20) {
			sum=5;
		}else if(month>=1&&month<=5 || month==10 ||month==11 &&tickets>20) {
			sum=30;
		}else if(month>=1&&month<=5 || month==10 ||month==11 &&tickets<20) {
			sum=20;
		}
		else {
			sum=10;
		}
		System.out.println(sum+"%");
	}

}
