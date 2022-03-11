package inthejava_12_5;

import java.util.Scanner;

public class Text_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入等腰三角形的行数：");
		int rows=sc.nextInt();
		for (int i = 1; i <= rows; i++) {
        	//打印空格
        	for (int j = 1; j <= rows - i ; j++) {
        		System.out.print(" ");
        	}
        	//打印*
        	for (int j = 1; j <= 2 * i - 1; j++) {
        		System.out.print("*");
        	}
        	//换行
        	System.out.println();
        }
		//07黄茂荣
		
	}
}
