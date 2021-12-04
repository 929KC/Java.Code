package XunHuan;

import java.util.Scanner;

public class Demo_9 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int i,sum=0,number;
		System.out.println("欢迎使用中国人民银行ATM取款机");
		  System.out.println("输入取款金额：");
		  i=sc.nextInt();
	   while(i<=1000) {
		   sum=1000-i;
		   System.out.print("剩余金额："+sum+",");
		   
		   System.out.println("是否继续（’1’：结束，’2’：继续）");
		   number=sc.nextInt();
		   if(number==2) {
			   System.out.println("输入取款金额：");
			   i=sc.nextInt();
			   sum=900-i;
			   if(sum<0) {
				   System.out.println("目前金额：900无法满足您的提款需求！");
			   }
			   System.out.println("输入取款金额：");
			   i=sc.nextInt();
			   sum=900-i;
			   System.out.print("剩余金额："+sum+",");
			   
			   System.out.println("是否继续（’1’：结束，’2’：继续）");
			   number=sc.nextInt();
		   }
		   
		   
		   
		   
		   
	   }
	}
}
