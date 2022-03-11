package XunHuan;

public class Demo_3 {

	public static void main(String[] args) {
		int count= 0;
		int i=1;
		do {
		if(i%6==0) {
			System.out.println(i);
			
			count++;
			
		}
		
		i++;
		}while(i<=100);
		
		System.out.println("6的倍数出现的次数为：" + count);
		
		
		
	}

}
