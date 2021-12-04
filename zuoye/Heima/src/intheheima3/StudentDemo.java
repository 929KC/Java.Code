package intheheima3;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("叶秋涵");
		s.setAge(19);
		s.setUniversity("B站大学");
		s.show();
		System.out.println("——————————————————");
		System.out.println("我是"+s.getName()+"今年"+s.getAge()+"岁在"+s.getUniversity()+"读书");
           
		System.out.println("——————————————————");
		Student s2=new Student("叶秋涵",19,"B站大学");
		s.show();
		
		
	}

}
