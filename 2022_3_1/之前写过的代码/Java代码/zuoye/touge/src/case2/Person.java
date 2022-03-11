package case2;

public abstract class Person {
	private String name;
	private String sex;
	private int age;

	public Person(String name, String sex, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String setName() {
		return name;
	}
	
	public void getName(String name) {
		this.name=name;
	}
	public String setSex() {
		return sex;
	}
	
	public void getSex(String sex) {
		this.sex=sex;
	}
	public int setAge() {
		return age;
	}
	
	public void getAge(int age) {
		this.age=age;
	}
	public abstract void eat();
}
