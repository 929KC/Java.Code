package intheheima3;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Ҷ�ﺭ");
		s.setAge(19);
		s.setUniversity("Bվ��ѧ");
		s.show();
		System.out.println("������������������������������������");
		System.out.println("����"+s.getName()+"����"+s.getAge()+"����"+s.getUniversity()+"����");
           
		System.out.println("������������������������������������");
		Student s2=new Student("Ҷ�ﺭ",19,"Bվ��ѧ");
		s.show();
		
		
	}

}
