package XunHuan;

import java.util.Scanner;

public class Demo_9 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int i,sum=0,number;
		System.out.println("��ӭʹ���й���������ATMȡ���");
		  System.out.println("����ȡ���");
		  i=sc.nextInt();
	   while(i<=1000) {
		   sum=1000-i;
		   System.out.print("ʣ���"+sum+",");
		   
		   System.out.println("�Ƿ��������1������������2����������");
		   number=sc.nextInt();
		   if(number==2) {
			   System.out.println("����ȡ���");
			   i=sc.nextInt();
			   sum=900-i;
			   if(sum<0) {
				   System.out.println("Ŀǰ��900�޷����������������");
			   }
			   System.out.println("����ȡ���");
			   i=sc.nextInt();
			   sum=900-i;
			   System.out.print("ʣ���"+sum+",");
			   
			   System.out.println("�Ƿ��������1������������2����������");
			   number=sc.nextInt();
		   }
		   
		   
		   
		   
		   
	   }
	}
}
