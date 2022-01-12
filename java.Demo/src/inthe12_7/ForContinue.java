package inthe12_7;

public class ForContinue {

	public static void main(String[] args) {
		//打印100以内除了尾数为3,5,7的所有数
		
		for(int  i=1; i<=100; i++) {
			int y=i%10;
			if(y==1||y==3||y==5) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
