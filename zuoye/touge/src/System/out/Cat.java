package System.out;

public class Cat extends Pet {
	private  double weight;

	

	public Cat(String name,String sex,double weight) {
		super(name,sex);
		this.weight=weight;
		
	}

	public void talk() {
		System.out.println("���ƣ�"+getName()+"���Ա�"+getSex()+"�����أ�"+weight+"kg��������");
	}

	

	public void eat() {
		System.out.println(getName()+"���㣡");
	}
}
