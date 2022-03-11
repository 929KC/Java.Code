package inthehieanli;

public class BasketballCoach extends Coach {
	public BasketballCoach() {

	}
	
	public BasketballCoach(String name, int age) {
		super(name, age);
	}
	@Override
	public void teach() {
		System.out.println("教学生如何运球和投篮");
	}
	@Override
	public void eat() {
		System.out.println("教练吃牛肉，喝羊奶");
	}
}
