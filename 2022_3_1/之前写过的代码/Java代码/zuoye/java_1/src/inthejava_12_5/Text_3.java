package inthejava_12_5;

import java.util.Scanner;

public class Text_3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int  rows=sc.nextInt();
	System.out.println("µ¹µÈÑüÈý½Ç£º");
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
	}

}
