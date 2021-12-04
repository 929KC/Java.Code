package leibulei3;

public class Outer {
	private int num = 10;

	public void method() {
		int num2=80;
		class Inner {
			public void show() {
				System.out.println(num);
				System.out.println(num2);
			}
		}
		Inner i=new Inner();
		i.show();
	}
	
}
