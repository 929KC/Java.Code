package System.out;

import java.util.Scanner;

public class AdditionCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int n=sc.nextInt();
		AdditionCalculator ad=new AdditionCalculator();
		ad.addition(a, n);

	}
	public void addition(int a, int n) {
		int k = 0,sum=0,t=0;
		while(k<n) {
			t=t*10+a;
			sum+=t;
			k++;
		}
		System.out.println(sum);
		
	}
	
}
