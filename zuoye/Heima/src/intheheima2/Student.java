package intheheima2;

public class Student {
         private String name;
         private int age ;
         //get/set·½·¨
         public void setName(String n) {
        	 name=n;
        	 
         }
         public String getName() {
        	 return name;
         }
         public void setAge(int a) {
        	 age=a;
        	 
         }
         public int getAge() {
        	 return age;
         }
         public void show() {
        	 System.out.println(name+","+age);
         }
}
