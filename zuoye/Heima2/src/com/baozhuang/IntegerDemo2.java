package com.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {
		/*
		 * public Integer(int value):����intֵ����Integer�����ʱ
		 
		 *
		 *
		 */
		/*
		 * Integer il=new Integer(100); System.out.println(il);
		 * System.out.println("-------------"); //public Integer (String s):����String
		 * ֵ�������󣨹�ʱ�� Integer i2=new Integer("100"); //Integer i3=new Integer("abc");
		 * System.out.println(i2);
		 * 
		 * ����Ϊ��ʱ����
		 */
		//public   static Integer valueof(int i):����ֵ��ʾָ����intֵIntegerʵ��
		Integer i1=Integer.valueOf(100);
		System.out.println(i1);
		//public static Integer valueof(String s):����һ������ָ��ֵ��Integer����String
		Integer i3=Integer.valueOf("100");
		System.out.println(i3);
		//Integer i4=Integer.valueOf("abd");
		//System.out.println(i4);
		
	}

}
