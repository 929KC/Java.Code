package java_1;

import java.util.Scanner;

public class Demo_7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("�����������εĵ�һ���ߣ�");
		a=sc.nextInt();
		System.out.println("�����������εĵڶ����ߣ�");
		b=sc.nextInt();
		System.out.println("�����������εĵ������ߣ�");
		c=sc.nextInt();
		if(a==b&&b!=c || b==c&&a!=c || a==c&&c!=b) {
			System.out.println("����������߹��ɵ��������Σ�");
		}else if(a==b&&b==c) {
			System.out.println("����������߹��ɵĵȱ������Σ�");
			
		}else if(a+b>c&&b+c>a&&c+a>b) {
			System.out.println("������������ܹ��������Σ�");
		}else {
			System.out.println("����������߹��ɲ������Σ�");
		}
	}

}
