package java_1;

import java.util.Scanner;

public class Task5_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入自变量x的值：");
          int x=sc.nextInt();
          int number=Gety( x);
          System.out.println("y="+number);
         
	}
        public static int Gety(int x) {
             int y=0;
        	if(x>0) {
        		y=x+3;
        	}else if(x==0) {
        		y=0;
        	}else {
        		y=x*x-1;
        	}
         //黄茂荣
        	return y; 
        	 
        }
}
