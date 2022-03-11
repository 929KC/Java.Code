package intheheima_008;

public class Student extends Person{ 
	public Student() {
		
	}
	public Student (String name,int age) {
		super.setName(name);
		super.setAge(age);
		
	}
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}
