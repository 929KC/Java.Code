package java_1;
import java.util.Scanner;
public class Demo_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double result,sum;
		int money,weight;
		System.out.println("请输入西瓜重量：");
		weight=sc.nextInt();
		System.out.println("请输入顾客所付钱数：");
		money=sc.nextInt();
		if(weight>20) {
			sum=weight*0.85;
			System.out.printf("西瓜应付钱数：%.2f\n",sum);
			result=(money-weight*0.85);
			System.out.printf("应找钱数：%.2f",result);
		}else if(weight>15&&weight<=20) {
			sum=weight*0.90;
			System.out.printf("西瓜应付钱数：%.2f\n",sum);
			result=(money-weight*0.90);
			System.out.printf("应找钱数：%.2f",result);
		}else if(weight>10&&weight<=15) {
			sum=weight*0.95;
			System.out.printf("西瓜应付钱数：%.2f\n",sum);
			result=(money-weight*0.95);
			System.out.printf("应找钱数：%.2f",result);
		}else if(weight>5&&weight<=10) {
			sum=weight*1.00;
			System.out.printf("西瓜应付钱数：%.2f\n",sum);
			result=(money-weight*1.00);
			System.out.printf("应找钱数：%.2f",result);
		}else if(weight<=5) {
			sum=weight*1.05;
			System.out.printf("西瓜应付钱数：%.2f\n",sum);
			result=(money-weight*1.05);
			System.out.printf("应找钱数：%.2f",result);
		}
			
		
		
	}
}
