package Task4_1;

import java.util.Scanner;

public class Demo_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] drr = new int[10];
		int[] err = new int[10];
		System.out.println("�������һ�������10��������");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "��������");
			arr[i] = sc.nextInt();
		}

		System.out.println("������ڶ��������10��������");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "��������");
			drr[i] = sc.nextInt();
		}

		for(int i=0;i<err.length;i++) {
			err[i]=(arr[i]+drr[i]);
		}
		
		System.out.println("�����������10��������");
		
		for(int i=0;i<err.length;i++) {
			System.out.print(err[i]+"\t");
			//07��ï��
		}
	}

}
