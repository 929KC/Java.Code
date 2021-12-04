package intheheima_007;

public class Student {
         private String name;
         private int age;
         public Student(){
        	 
         }
         public Student(String name,int age) {
        	 this.age=age;
        	 this.name=name;
        	 
         }
         public String getName() {
        	 return name;
         }
         public void setName(String name) {
        	 this.name=name;
         }
         public int getAge() {
        	 return age;
         }
         public void setAge(int age) {
        	 this.age=age;
         }
         public void study() {
        	 System.out.println("好好学习，天天向上");
         }
}
