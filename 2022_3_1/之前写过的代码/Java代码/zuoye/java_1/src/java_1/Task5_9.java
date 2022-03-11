package java_1;

import java.util.Scanner;

public class Task5_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个英文字母：");
		char z=sc.next().charAt(0);
        boolean ZiMu=Judge(z);
        System.out.println("您输入的字母："+z+","+"是大写字母");
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
