package com.intheheima_011;

public class FinalDemo {

	public static void main(String[] args) {
		//基本数据类型
	 final	int age=10;
		//age=19;
				
		System.out.println(age);
		//引用数据类型
		Student s=new Student();
		s.age=100;
		System.out.println(s.age);
		//s=new Student();

	}

}
