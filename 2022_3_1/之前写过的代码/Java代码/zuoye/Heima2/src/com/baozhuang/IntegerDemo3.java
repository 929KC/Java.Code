package com.baozhuang;

public class IntegerDemo3 {

	public static void main(String[] args) {
		//int ---String 
		int number=120;
		//��ʽһ
		String s1=""+number;
		System.out.println(s1);
		//��ʽ��
		//public static String valueof(int i)
		String s2=String.valueOf(number);
		System.out.println(s2);
		System.out.println("---------");
		//String ---Integer---int
		//��ʽһ
		String s="100";
		Integer i=Integer.valueOf(s);
		//public int intValue()
		int x=i.intValue();
		System.out.println(x);
		//��ʽ��
		//public static int pareInt(String s)
		int y=Integer.parseInt(s);
		System.out.println(y);
		
	}

}
