package java_1;

import java.util.Scanner;

public class Demo_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		char sex;
		double weight;
		
		char wedding;
		System.out.println("��¼���϶������Ϣ��");
       System.out.println("������������");
	   String   name=sc.next();
       System.out.println("���������䣺");
	    age=sc.nextInt();
	   System.out.println("�������Ա�");
         sex=sc.next().charAt(0);
	   System.out.println("���������أ�");
		 weight=sc.nextDouble();
		System.out.println("�������ַ��");
		String address=sc.next();
		System.out.println("�������Ƿ��ѻ飺");
		 wedding=sc.next().charAt(0);
      System.out.println("��Ϣ���£�");
      
      System.out.println("\t�������϶�");
      System.out.println("\t���䣺3500��");
      System.out.println("\t�Ա�Ů");
      System.out.println("\t���أ�45.5kg");
      System.out.println("\t��ַ������㺮��");
      System.out.println("\t��񣺷�");
	}

}
