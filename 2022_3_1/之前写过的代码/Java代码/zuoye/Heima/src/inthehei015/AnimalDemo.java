package inthehei015;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.setName("�ӷ�");
		a.setAge(5);
		System.out.println(a.getName()+","+a.getName());
          a=new Cat("�ӷ�",5);
          System.out.println(a.getName()+","+a.getAge());
          System.out.println("-----------");
          Animal b=new Dog();
  		b.setName("��ķ");
  		b.setAge(9);
  		System.out.println(b.getName()+","+b.getName());
            b=new Cat("��ķ",9876);
            System.out.println(b.getName()+","+b.getAge());
          
	}

}
