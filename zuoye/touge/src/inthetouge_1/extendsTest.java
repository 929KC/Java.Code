package inthetouge_1;

public class extendsTest {

	public static void main(String[] args) {
	Animal a=new Cat();
   a.voice();
   a.eat();
   a.setName("��è");
   a.setAge(6);
   System.out.println( a.getName()+a.getAge()+"��");
   Animal a2=new Dog();
   a2.voice();
   a2.eat();
   a2.setName("��ڹ�");
   a2.setAge(8);
   System.out.println( a2.getName()+a2.getAge()+"��");
	}

}
