package inthetouge_2;

import java.util.Scanner;

public class DecomposeFactor {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ������");
	int scores=sc.nextInt();
	DecomposeFactor de=new DecomposeFactor();
	       de.decompose(scores);
	 //System.out.println( de.decompose(scores));
	    
	}
   
public static void decompose(int score) {
	    float temp;
	   if(score>90&&score<=100) {
	    	temp=(float) 4.0 ;
	    	System.out.println(temp);
	     }else if(score>80&&score<=90) {
	    	 temp=(float) 3.5;
	    	 System.out.println(temp);
	     }else if(score>70&&score<=80) {
	    	 temp=(float) 3.0 ;
	    	 System.out.println(temp);
	     }else if(score>60&&score<=70) {
	    	 temp=(float) 2.5;
	    	 System.out.println(temp);
	     }else {
	    	 temp=(float)0.0;
	    	 System.out.println(temp);
	     }
	   
	   
	   //return  temp;
   }
}
