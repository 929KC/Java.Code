package java_1;

import java.util.Scanner;

public class Demo_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y=0;
		System.out.println("请输入一个整数：");
		x = sc.nextInt();
		if (x >= 0) {
			if (x <= 5) {
				y = 0;
				System.out.println(y);
			} else {
				y = x + 3;
				System.out.println(y);
			}
		} else {
			y = 2 * x + 30;
			System.out.println(y);
		}
 
//		 if(x>5) {
//			 y=x+3;
//		 }else if(x<0) {
//			 y=2*x+30;
//		 }
	}

}
