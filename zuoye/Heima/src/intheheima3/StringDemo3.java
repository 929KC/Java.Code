package intheheima3;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line=sc.nextLine();
		//�����ַ���������Ҫ�ܻ�ȡ���ַ����е�ÿһ���ַ�
//		System.out.println(line.charAt(0));
//		System.out.println(line.charAt(1));
//		System.out.println(line.charAt(2));
//          for(int i=0; i<3; i++) {
//        	  System.out.println(line.charAt(i));
//          }
          //�����ַ�������λ�ȡ�ַ�������
         // System.out.println(line.length());
		for(int i=0; i<line.length(); i++) {
			System.out.println(line.charAt(i));
		}
          
	}

}
