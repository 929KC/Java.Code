package inthejava_12_5;
import java.util.Scanner;
public class Task6_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int [10];
		for(int i=0;i<arr.length; i++) {
			System.out.print("������һ�����֣�");
			arr[i]=sc.nextInt();
		}
		for(int k=9; k>=0&&k<=arr.length; k--) {
			System.out.print(arr[k]+" ");
		}
		//��ï��07
	}
}
