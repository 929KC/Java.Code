package XunHuan;
import java.util.Scanner;
public class Task4_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������λ������������");
		int number=sc.nextInt();
		int sum=0;
		do {sum+=number%10; 
		     number/=10;
            
             }while(number>0);
	       //07��ï��
		 System.out.println(sum);
	}
}
