package intheheima_008;

public class Demo_Person {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setName("Ҷ֪��");
		t1.setAge(19);
		System.out.println(t1.getName()+","+t1.getAge());
		t1.teach();
		Teacher t2=new Teacher("Ҷ�ﺭ",19);
		System.out.println(t1.getName()+","+t1.getAge());
		t2.teach();
		Student s1=new Student();
		s1.setName("��ï��");
		s1.setAge(18);
		System.out.println(s1.getName()+","+s1.getAge());
		s1.study();
		System.out.println("------");
		Student s2=new Student("��ï��",19);
		System.out.println(s2.getName()+"."+s2.getAge());
		s2.study();
	}

}
