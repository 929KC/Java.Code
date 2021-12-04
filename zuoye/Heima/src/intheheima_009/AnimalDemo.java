package intheheima_009;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.setName("杰克");
		c1.setAge(19);
		System.out.println(c1.gaeName()+","+c1.gaeAge());
		c1.catchMouse();
		System.out.println("-----------");
		Cat c2=new Cat("杰克",5);
		System.out.println(c2.gaeName()+","+c2.gaeAge());
		c1.catchMouse();
		System.out.println("-------");		
		Dog d1=new Dog();
		d1.setName("杰克");
		d1.setAge(19);
		System.out.println(d1.gaeName()+","+d1.gaeAge());
		d1.lookDoor();
		System.out.println("-----------");
		Cat d2=new Cat("杰克",5);
		System.out.println(d2.gaeName()+","+c2.gaeAge());
		d1.lookDoor();
			
		
	}

}
