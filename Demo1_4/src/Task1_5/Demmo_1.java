
package Task1_5;

import java.util.Scanner;

public class Demmo_1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println("交换之前的数组：");
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
	System.out.println("");
	System.out.println("交换之后的数组：");
	for (int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+"\t");
	}
	}
//07黄茂荣
}
