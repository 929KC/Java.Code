package System.out;

public class Dog extends Pet {
	
	private String color;
	

	public Dog(String name,String sex,String color) {
		super(name,sex);
		
		this.color=color;
		
	}

	public void talk() {
		System.out.println("���ƣ�"+getName()+ "���Ա�"+getSex()+"����ɫ��"+color+"��������" );
	}

	public void eat() {
		System.out.println(getName()+"�Թ�ͷ��");
	}
	
	
}
