package inthetouge_1;

public class Worker extends Person{
	public Worker() {

	}

	public Worker(String name, int age, String occupation) {
		super(name, age, occupation);
//    	this.school="哈佛大学";

	}

	public void talk() {

		System.out.println("我是：" + getName() + "," + "今年：" + getAge() + "，职业：" + getOccupation() + "！");
	}
}
