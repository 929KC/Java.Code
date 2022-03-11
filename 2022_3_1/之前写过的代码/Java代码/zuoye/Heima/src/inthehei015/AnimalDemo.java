package inthehei015;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.setName("╪с╥ф");
		a.setAge(5);
		System.out.println(a.getName()+","+a.getName());
          a=new Cat("╪с╥ф",5);
          System.out.println(a.getName()+","+a.getAge());
          System.out.println("-----------");
          Animal b=new Dog();
  		b.setName("люд╥");
  		b.setAge(9);
  		System.out.println(b.getName()+","+b.getName());
            b=new Cat("люд╥",9876);
            System.out.println(b.getName()+","+b.getAge());
          
	}

}
