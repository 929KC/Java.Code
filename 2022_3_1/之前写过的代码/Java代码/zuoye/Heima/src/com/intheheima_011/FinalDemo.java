package com.intheheima_011;

public class FinalDemo {

	public static void main(String[] args) {
		//������������
	 final	int age=10;
		//age=19;
				
		System.out.println(age);
		//������������
		Student s=new Student();
		s.age=100;
		System.out.println(s.age);
		//s=new Student();

	}

}
