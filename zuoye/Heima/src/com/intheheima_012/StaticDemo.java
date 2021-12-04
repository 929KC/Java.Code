package com.intheheima_012;

public class StaticDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student.university="B站大学";
		s1.name="叶秋涵";
		s1.age=19;
		//s1.university="B站大学";
		s1.show();
		System.out.println("-----");
		Student s2=new Student();
		s2.name="叶子秋";
		s2.age=19;
		//s2.university="";
		s2.show();
				

	}

}
