package XunHuan;

public class Task4_12 {

	public static void main(String[] args) {
		int a,b,c,sum;
		for(int i=100; i<=999; i++) {
			sum=i;
			a=i%10;
			b=i/10%10;
			c=i/100;
			if(sum==(a*a*a+b*b*b+c*c*c)){
				System.out.print(sum+"\t");
			}
		}
            //07��ï��
	}

}
