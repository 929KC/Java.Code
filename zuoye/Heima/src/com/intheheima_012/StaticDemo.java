package com.intheheima_012;

public class StaticDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student.university="Bվ��ѧ";
		s1.name="Ҷ�ﺭ";
		s1.age=19;
		//s1.university="Bվ��ѧ";
		s1.show();
		System.out.println("-----");
		Student s2=new Student();
		s2.name="Ҷ����";
		s2.age=19;
		//s2.university="";
		s2.show();
				

	}

}
