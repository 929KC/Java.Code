package inthecsdn1;

import java.util.Scanner;

public class TestNum {

	public static void main(String[] args) { 
		System.out.println("������һ��������");
		double input=new Scanner(System.in).nextDouble();
		double Num=getNum(input);
		System.out.println("����ֵΪ��"+Num);
             
	}
	public static double getNum(double input) {
		if(input>=0) {
			return input;
		}else {
			return -input;
		}
	}

}
