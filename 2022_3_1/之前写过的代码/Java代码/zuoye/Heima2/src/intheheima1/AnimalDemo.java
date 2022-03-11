package intheheima1;

public class AnimalDemo {

	public static void main(String[] args) {
		AnimalOperator ap=new AnimalOperator();
		Animal a=new Dog();
		ap.userAnimal(a);
        Animal a2=ap.getAnimal();//new Dog();
        a2.eat();
	}

}
