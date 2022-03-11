package inthejava_12_5;
import java.util.Scanner;
public class Task6_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int [4];
		float sum=0,average=0;
		for(int i=0; i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"门课程成绩：");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		average=sum/4;
		System.out.print("4门课程的成绩分别是："
				+ ""+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]);
        System.out.printf("总成绩：%.2f,平均分：%.2f"
        		+ "",sum,average);
	}
}
