package inthetouge_2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Factorial f=new Factorial();
	f.factorial(n);
	}
	public void factorial(int n) {
		/********** Begin *********/
				int sum=1;
         for(int k=1; k<=n;k++) {
        	 sum*=k;
         }
         System.out.println(sum);


		/********** End *********/
	}
}