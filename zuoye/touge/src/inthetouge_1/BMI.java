package inthetouge_1;

import java.util.Scanner;

public class BMI {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double weight = input.nextDouble();
        double  BIM=0;
        if(weight>0&&weight<=200&&height>0&&height<=3) {
        	
        		 BIM=weight/(height*height);
        		 System.out.println();
        		
        } else {
          	System.out.println("illegal");
          }
        	
        
        if(BIM>0&&BIM<18.5) {
        	System.out.println("A");
        }else if(BIM>0&&BIM<25.0) {
        	System.out.println("B");
        }else if(BIM>0&&BIM<30.0) {
        	System.out.println("C");
        }else if(BIM>=30){
        	System.out.print("D");
        }
	}

}
