package intheheima2;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		//ͨ��set������set��ֵ
		s.setName("Ҷ�ﺭ");
		s.setAge(19);
		s.show();
		//ͨ��get��ȡ��Ա������ֵ
		System.out.println(s.getName()+"------"+s.getAge());
		System.out.println(s.getName()+","+s.getAge());
	}

}
