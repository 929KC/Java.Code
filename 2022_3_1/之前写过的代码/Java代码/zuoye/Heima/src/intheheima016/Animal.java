package intheheima016;

public abstract class Animal {
	private int age = 19;
	private final String city = "上海";

	public Animal() {
	}

	public Animal(int age) {
	}

	public void show() {
		age = 20;
		System.out.println(age);
//    	 city="北京"
		System.out.println(city);

	}

	public abstract void eat();

}
