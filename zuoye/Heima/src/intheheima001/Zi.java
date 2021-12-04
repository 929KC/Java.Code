package intheheima001;

public class Zi extends Fu {
      public int age=20;
	public void show () {
		int age=19;
		System.out.println(age);
		//访问本类当中的成员变量
	System.out.println(this.age);
	//访问本类当中的成员变量
	System.out.println(super.age);
	}
}
