package intheheima3;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line=sc.nextLine();
		//遍历字符串，首先要能获取到字符串中的每一个字符
//		System.out.println(line.charAt(0));
//		System.out.println(line.charAt(1));
//		System.out.println(line.charAt(2));
//          for(int i=0; i<3; i++) {
//        	  System.out.println(line.charAt(i));
//          }
          //遍历字符串，其次获取字符串长度
         // System.out.println(line.length());
		for(int i=0; i<line.length(); i++) {
			System.out.println(line.charAt(i));
		}
          
	}

}
