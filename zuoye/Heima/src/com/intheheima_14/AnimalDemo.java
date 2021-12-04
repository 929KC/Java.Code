package com.intheheima_14;

public class AnimalDemo {

	public static void main(String[] args) {
	      //父类引用指向子类 对象
		Animal a=new Cat();
		System.out.println(a.age);
		//System.out.println(a.weight);
		a.eat();
		//a.playGame();
	}

}
