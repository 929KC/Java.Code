package inthetouge_2;

public class Person {
	String name = "����";
	int age = 18; 
	String sex = "��";
	/********** Begin **********/

	public Person(String name,int age,String sex){
		this(age);
		name = name;
		sex = sex;
	}
	
	public Person(int age){
		age = age;
	}
	
	public void display(){
		String name = "����";
		int age = 11;
		String sex = "��";
		System.out.println("name��" + name);
		System.out.println("age��" + age);
		System.out.println("sex��" + sex);
	}


	/********** End **********/
}
