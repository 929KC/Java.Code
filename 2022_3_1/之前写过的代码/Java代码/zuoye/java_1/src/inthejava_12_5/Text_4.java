package inthejava_12_5;

import java.util.Scanner;

public class Text_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������ϰ벿�ֵ�������");
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
		for (int i = rows; i >= 0; i--)
		{
			for (int j = 0; j < rows - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//07��ï��
	}

}
