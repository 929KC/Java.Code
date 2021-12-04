package inthema003;

public class Zi  extends Fu{
  public void method() {
	  System.out.println("method被调用");
  }
  public void show() {
	  super.show();//父类成员方法
		 System.out.println("Zi中show被调用");
		/////????
	 }
}
