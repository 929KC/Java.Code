package inthetouge_1;

public class Cat extends Animal{
        
	public Cat() {
		
	}
    public Cat(String name,int age) {
		super(name,age);
	}
    public void voice() {
    	System.out.println("��è��������");
    }
    public void eat() {
    	System.out.println("��è����");
    }
}
