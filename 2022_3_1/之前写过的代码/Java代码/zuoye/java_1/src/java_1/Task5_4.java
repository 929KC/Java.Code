package java_1;

import java.util.Scanner;

public class Task5_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int number=sc.nextInt();
		int abs= QiuAbs( number);
		System.out.println(number+"����ֵΪ��"+abs);

	}
	public static int QiuAbs(int num) {
		
		int y=0;
		if(num>=0) {
			y=num;
		}else {
			y=-num;
		}
		return y;
		
		//��ï��
	}
          
}
