package com.baozhuang;

public class IntegerDemo3 {

	public static void main(String[] args) {
		//int ---String 
		int number=120;
		//方式一
		String s1=""+number;
		System.out.println(s1);
		//方式二
		//public static String valueof(int i)
		String s2=String.valueOf(number);
		System.out.println(s2);
		System.out.println("---------");
		//String ---Integer---int
		//方式一
		String s="100";
		Integer i=Integer.valueOf(s);
		//public int intValue()
		int x=i.intValue();
		System.out.println(x);
		//方式二
		//public static int pareInt(String s)
		int y=Integer.parseInt(s);
		System.out.println(y);
		
	}

}
