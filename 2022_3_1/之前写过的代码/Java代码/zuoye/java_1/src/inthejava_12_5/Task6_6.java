package inthejava_12_5;
import java.util.Scanner;
public class Task6_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个六位数：");
		int number=sc.nextInt();
		int [] arr=new int [6];
		int k=1;
			arr[5]=number%10;
			arr[4]=number/10%10;
			arr[3]=number/100%10;
			arr[2]=number/1000%10;
			arr[1]=number/10000%10;
			arr[0]=number/100000;
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
			//07黄茂荣
		}
	}

	
}
