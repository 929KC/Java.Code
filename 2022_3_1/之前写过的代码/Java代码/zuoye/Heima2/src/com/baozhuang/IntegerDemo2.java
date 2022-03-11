package com.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {
		/*
		 * public Integer(int value):根据int值创建Integer对象过时
		 
		 *
		 *
		 */
		/*
		 * Integer il=new Integer(100); System.out.println(il);
		 * System.out.println("-------------"); //public Integer (String s):根据String
		 * 值创建对象（过时） Integer i2=new Integer("100"); //Integer i3=new Integer("abc");
		 * System.out.println(i2);
		 * 
		 * 以上为过时方法
		 */
		//public   static Integer valueof(int i):返回值表示指定的int值Integer实例
		Integer i1=Integer.valueOf(100);
		System.out.println(i1);
		//public static Integer valueof(String s):返回一个保留指定值的Integer对象String
		Integer i3=Integer.valueOf("100");
		System.out.println(i3);
		//Integer i4=Integer.valueOf("abd");
		//System.out.println(i4);
		
	}

}
