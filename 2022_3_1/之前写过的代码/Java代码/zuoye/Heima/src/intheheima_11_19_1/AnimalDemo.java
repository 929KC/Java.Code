package intheheima_11_19_1;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.eat();
		a.setName("�ܿ�");
		a.setAge(6);
		System.out.println(a.getName()+","+a.getAge());
		System.out.println("-------------");
		 a=new Cat("�ܿ�",5);
		 System.out.println(a.getName()+","+a.getAge());
		 System.out.println("-------------");
		 Animal d=new Dog();
		 d.eat();
		 d.setAge(7);
		 d.setName("��ķ");
		 System.out.println(d.getName()+","+d.getAge());
		 d=new Dog("��ķ",7);
		 System.out.println(d.getName()+","+d.getAge());
		 d.eat();
		  	 
	}
}
