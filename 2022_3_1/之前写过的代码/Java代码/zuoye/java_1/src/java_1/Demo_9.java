package java_1;

import java.util.Scanner;

public class Demo_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		char sex;
		double weight;
		
		char wedding;
		System.out.println("请录入嫦娥个人信息：");
       System.out.println("请输入姓名：");
	   String   name=sc.next();
       System.out.println("请输入年龄：");
	    age=sc.nextInt();
	   System.out.println("请输入性别：");
         sex=sc.next().charAt(0);
	   System.out.println("请输入体重：");
		 weight=sc.nextDouble();
		System.out.println("请输入地址：");
		String address=sc.next();
		System.out.println("请输入是否已婚：");
		 wedding=sc.next().charAt(0);
      System.out.println("信息如下：");
      
      System.out.println("\t姓名：嫦娥");
      System.out.println("\t年龄：3500岁");
      System.out.println("\t性别：女");
      System.out.println("\t体重：45.5kg");
      System.out.println("\t地址：月球广寒宫");
      System.out.println("\t婚否：否");
	}

}
