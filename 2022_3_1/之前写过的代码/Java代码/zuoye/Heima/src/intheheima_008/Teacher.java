package intheheima_008;

public class Teacher extends Person {
	public Teacher() {

	}

	public Teacher(String name, int age) {
//    	   this.name=name;;
//    	   this.age=age;
		super.setName(name);
		super.setAge(age);
	}

	public void teach() {
		System.out.println("用爱教好每一位学生");
	}
}
