package inthetouge_1;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
              //System.out.println("�н������֣�");
	        int prize = input.nextInt();
	        int a1=prize%10;
	        int a2=prize/10%10;
	        int a3=prize/100;
	        //System.out.println("��������ĺ��룺");
	        int lottery = input.nextInt();
	        int b1=lottery%10;
	        int b2=lottery/10%10;
	        int b3=lottery/100;
	        input.close();
       if(lottery==prize) {
    	   System.out.println("10000");
       }else if(b1==a2&&b2==a3&&b3==a1||b1==a2&&b2==a1&&b3==a3||b1==a3&&b2==a1&&b3==a2||b1==a3&&b2==a2&&b3==a1||b1==a1&&b2==a3&&b3==a2) {
    	   System.out.println("3000");
       }else if(b1==a1||b1==a2||b1==a3||b2==a1||b2==a2||b3==a3||b3==a1||b3==a2||b3==a3) {
    	   System.out.println("200");
       }else {
    	   System.out.print("0");
       }
    	   
    	   
	}

}
