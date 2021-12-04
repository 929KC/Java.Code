package intheheima_1;

public class Student {
    String name;
    private   int age;
    public void setAge( int a) {
    	age=a;
    	if(age<0||age>120) {
    		System.out.println("你输入的年龄有误");
    	}else {
    		age=a;
    	}
    }
    public int getAge() {
    	return age;
    }
    public void study() {
    	System.out.println("天天向上，好好学习");
    }
   public void doHomowork() {
	   System.out.println("键盘敲烂，月薪过万");
   }
   public void show() {
	   System.out.println(name+","+age);
   }
	
	
}
