package System.out;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入狗的名字");
		String dogName = sc.next();
		System.out.println("请输入狗的性别");
		String dogSex = sc.next();
		System.out.println("请输入狗的颜色");
		String dogColor = sc.next();
		System.out.println("请输入猫的名字");
		String catName = sc.next();
		System.out.println("请输入猫的性别");
		String catSex = sc.next();
		System.out.println("请输入猫的体重");
		double catWeight = sc.nextDouble();
		// 通过有参构造函数实例化Dog类对象dog
		// dog调用talk()方法
		// dog调用eat()方法
		//设置无参构造方法???
		/********* begin *********/
		Pet p=new Dog(dogName,dogSex,dogColor);
		
		p.eat();
		p.talk();
		
		/********* end *********/
		// 通过有参构造函数实例化Cat类对象cat
		// cat调用talk()方法
		// cat调用eat()方法
		/********* begin *********/
		Pet p2=new Cat(catName,catSex,catWeight);
		
		p2.eat();
		p2.talk();
		
		/********* end *********/

	}

	

}
