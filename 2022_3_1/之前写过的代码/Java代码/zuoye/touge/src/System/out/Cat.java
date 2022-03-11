package System.out;

public class Cat extends Pet {
	private  double weight;

	

	public Cat(String name,String sex,double weight) {
		super(name,sex);
		this.weight=weight;
		
	}

	public void talk() {
		System.out.println("名称："+getName()+"，性别："+getSex()+"，体重："+weight+"kg，喵喵叫");
	}

	

	public void eat() {
		System.out.println(getName()+"吃鱼！");
	}
}
