package java_1;

import java.util.Scanner;

public class Task5_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��Ӣ����ĸ��");
		char z=sc.next().charAt(0);
        boolean ZiMu=Judge(z);
        System.out.println("���������ĸ��"+z+","+"�Ǵ�д��ĸ");
	}
   public static boolean Judge(char ch) {
	   if(ch>'a'&&ch<'z') {
		   return true;
	   }else if(ch>'A'&&ch<'Z') {
		   return false;
	   }
	return true ;  
   } 
   }
