package intheheima_1;

public class Student {
    String name;
    private   int age;
    public void setAge( int a) {
    	age=a;
    	if(age<0||age>120) {
    		System.out.println("���������������");
    	}else {
    		age=a;
    	}
    }
    public int getAge() {
    	return age;
    }
    public void study() {
    	System.out.println("�������ϣ��ú�ѧϰ");
    }
   public void doHomowork() {
	   System.out.println("�������ã���н����");
   }
   public void show() {
	   System.out.println(name+","+age);
   }
	
	
}
