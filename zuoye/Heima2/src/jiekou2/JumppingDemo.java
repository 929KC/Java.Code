package jiekou2;

public class JumppingDemo {

	public static void main(String[] args) {
		JumppingOperator jo=new JumppingOperator();
		Jumpping j=new Cat();
		jo.userJumpping(j);
		Jumpping j2=jo.getJumpping();
		j2.jump();
	}

	
}
