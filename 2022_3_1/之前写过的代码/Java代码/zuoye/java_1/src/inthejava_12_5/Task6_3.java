package inthejava_12_5;
import java.util.Scanner;
public class Task6_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int [4];
		float sum=0,average=0;
		for(int i=0; i<arr.length;i++) {
			System.out.println("�������"+(i+1)+"�ſγ̳ɼ���");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		average=sum/4;
		System.out.print("4�ſγ̵ĳɼ��ֱ��ǣ�"
				+ ""+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]);
        System.out.printf("�ܳɼ���%.2f,ƽ���֣�%.2f"
        		+ "",sum,average);
	}
}
