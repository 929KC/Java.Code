package java_1;

import java.util.Scanner;

public class Task3_17_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,d1,d2;
		System.out.println("������100-999��������");
		number=sc.nextInt();
		if(number>100&&number<999) {
			d1=number/100;
			d2=number%10;
			if(d1==d2) {
				System.out.println(number+"�ǻ�����");
			}else {
				System.out.println(number+"���ǻ�����");
			}
		}
	//07��ï��

	}

}
