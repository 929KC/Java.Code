package java_1;

import java.util.Scanner;

public class Demo_10 {

	public static void main(String[] args) {
		System.out.println("�Ǽ��ɼ�����ϵͳ");
		System.out.println("������ɼ���");
		Scanner sc = new Scanner(System.in);
		/******start******/
	int score=0;
	 score=sc.nextInt();
   if(score >=90){
	   System.out.println("*****���ǳɼ�");
   }else if(score >=80 && score<90){
	   System.out.println("****���ǳɼ�");

   }else if(score >=70 && score<80){
 	System.out.println("***���ǳɼ�");
   }else if(score >=60 && score<70){
	    System.out.println("**���ǳɼ�");
   } else {
	    System.out.println("���ǳɼ�");
   } 

	}

}
