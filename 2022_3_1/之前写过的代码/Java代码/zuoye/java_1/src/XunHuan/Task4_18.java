package XunHuan;
import java.util.Scanner;
public class Task4_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个任意位数的正整数：");
		int number=sc.nextInt();
		int sum=0;
		do {sum+=number%10; 
		     number/=10;
            
             }while(number>0);
	       //07黄茂荣
		 System.out.println(sum);
	}
}
