package leibulei6;

public class ObjectDemo {

	public static void main(String[] args) {
	 Student s=new Student();
	 s.setName("Ҷ�ﺭ");
	 s.setAge(19);
	 System.out.println(s);//leibulei6.Student@15db9742
	 System.out.println(s.toString());//leibulei6.Student@15db9742 
     System.out.println("--------");
     Student s2=new Student();
     s2.setName("Ҷ�ﺭ");
     s2.setAge(19);
     System.out.println(s.equals(s2));
	}

}
