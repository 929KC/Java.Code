package inthetouge_1;

import java.util.Scanner;

public class ShuZu3 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int [] [] scores= {{92,85},{91,65},{90,33}};
        for(int i=0; i<scores.length; i++) {
        	for(int j=0; j<scores[i].length; j++) {
        		System.out.println(scores[i][j]);
        	}
        }
		 for(int i=0; i<scores.length; i++) {
        	for(int j=0; j<scores[i].length; j++) {
        	scores[i][j]=sc.nextInt();
        }
        	
        	
		 }
	        for(int i=0; i<scores.length; i++) {
	        	for(int j=0; j<scores[i].length; j++) {
	        		System.out.println(scores[i][j]);
	        	}
	        }
}
}