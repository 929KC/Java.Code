package intheheima2;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		//通过set方法给set赋值
		s.setName("叶秋涵");
		s.setAge(19);
		s.show();
		//通过get获取成员变量的值
		System.out.println(s.getName()+"------"+s.getAge());
		System.out.println(s.getName()+","+s.getAge());
	}

}
