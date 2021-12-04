package intheheima_007;

public class Teacher {
	private String name;
    private int age;
    public Teacher(){
   	 
    }
    public Teacher(String name,int age) {
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
    public void teach() {
   	 System.out.println("用爱教好每一位学生");
    }
}
