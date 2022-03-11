package intheheima_1;

public class PhoneDemo {

	public static void main(String[] args) {
	  Phone p=new Phone();
	  //成员变量
	  System.out.println(p.brand);
	  System.out.println(p.price);
	  //给成员变量赋值
	  p.brand="华为";
	  p.price=9999;
	  System.out.println(p.brand);
	  System.out.println(p.price);
	  //使用成员方法
	  p.call();
	  p.call();

	}

}
