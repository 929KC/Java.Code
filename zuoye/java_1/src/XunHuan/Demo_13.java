package XunHuan;

import java.util.Scanner;

public class Demo_13 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("�����뵹�����ε�������");
	int m=sc.nextInt();
	for(int i=1; i<=m; i++) {
		for(int j=1; j<=6-i; j++ ) {
			System.out.print("*");
			System.out.print("\t");
		}
		System.out.println("");
	}
  //07��ï��
	}

}
