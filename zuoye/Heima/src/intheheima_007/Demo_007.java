package intheheima_007;

public class Demo_007 {

	public static void main(String[] args) {
		 Teacher t1=new  Teacher();
	     t1.setName("Ò¶Çïº­");  
		 t1.setAge(19);
		 System.out.println(t1.getName()+","+t1.getAge());
	        t1.teach();
        
        System.out.println("--------");
        Teacher t2=new  Teacher("Ò¶×ÓÇï" ,18);
        
   
   	 System.out.println(t1.getName()+","+t1.getAge());
           t1.teach();
         
           System.out.println("---------");
           Student s1=new Student();
           s1.setName("»ÆÃ¯ÈÙ");
           s1.setAge(18);
           s1.study();
           System.out.println(s1.getName()+","+s1.getAge());
           System.out.println("-----------");
           Student s2=new Student("»ÆÃ¯ÔÆ",18);
         
           System.out.println(s1.getName()+","+s1.getAge());
           s1.study();
	}

}
