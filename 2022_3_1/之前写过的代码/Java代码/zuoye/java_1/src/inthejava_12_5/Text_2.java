package inthejava_12_5;

import java.util.Scanner;

public class Text_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������ε�������");
		int rows=sc.nextInt();
		for (int i = 1; i <= rows; i++) {
        	//��ӡ�ո�
        	for (int j = 1; j <= rows - i ; j++) {
        		System.out.print(" ");
        	}
        	//��ӡ*
        	for (int j = 1; j <= 2 * i - 1; j++) {
        		System.out.print("*");
        	}
        	//����
        	System.out.println();
        }
		//07��ï��
		
	}
}
