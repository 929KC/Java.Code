package leibulei5;

public class JumppingDemo {

	public static void main(String[] args) {
		JumppingOperator jo=new JumppingOperator();
		Jumpping j=new Cat();
		jo.method(j);
     
		Jumpping j2= new Dog();
		jo.method(j2);
		   System.out.println("--------");
		   //匿名类的实际开发使用
		jo.method(new Jumpping() {
			
			@Override
			public void jump() {
				System.out.println("猫可以调高了");
				
			}
		});   
		jo.method(new Jumpping() {
			
			@Override
			public void jump() {
				System.out.println("狗可以跳高了");
				
			}
		});
	}
     
}
