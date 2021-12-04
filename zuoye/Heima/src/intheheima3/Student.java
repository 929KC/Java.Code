package intheheima3;

public class Student {
      private String name;
      private int age;
      private String university;
      public Student() {
    	  
      }
      public Student(String name,int age,String university) {
    	  this.name=name;
    	  this.age=age;
    	  this.university=university;
    	  
      }
      public void setName(String name) {
    	 this.name=name;
      }
      public String getName() {
    	  return name;
      }
      public void setAge(int age) {
    	 this.age=age;
      }
      public int getAge() {
    	  return age;
      }
      public void setUniversity(String university) {
    	 this.university=university;
      }
      public String getUniversity() {
    	  return university;
      }
      public void show() {
    	  System.out.println("我是"+name+"今年"+age+"岁在"+university+"读书");
      }
}
