package intheͷ��12_10;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   System.out.println("��������ݣ�");
		  int year=input.nextInt();
		  int number=0;
		  if(year>0) {
			  number=year%12;
		  }else {
			 number=(year%12)*(-1);
			  
		  }
		  switch(number) {
		  case 4:
			  System.out.println("��");
			  break;
		  case 5:
			  System.out.println("ţ");
			  break;
		  case 6:
			  System.out.println("��");
			  break;
		  case 7:
			  System.out.println("��");
			  break;
		  case 8:
			  System.out.println("��");
			  break;
		  case 9:
			  System.out.println("��");
			  break;
		  case 10:
			  System.out.println("��");
			  break;
		  case 11:
			  System.out.println("��");
			  break;
		  case 0:
			  System.out.println("��");
			  break;
		  case 1:
			  System.out.println("��");
			  break;
		  case 2:
			  System.out.println("��");
			  break;
		  case 3:
			  System.out.println("��");
			  break;
		  }

	}

}
