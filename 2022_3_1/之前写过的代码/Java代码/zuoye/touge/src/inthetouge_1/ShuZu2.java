package inthetouge_1;

import java.util.Scanner;

public class ShuZu2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[sc.nextInt()];
		
		//循环给数组赋值
		for(int i = 0 ; i< scores.length;i++){
			scores[i] = sc.nextInt();
		}
		/********** Begin **********/
		//在这里计算数组scores的平均值和最大值
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		
		int max=scores[0];
		for(int i=1; i<scores.length;i++) {
			if(scores[i]>max) {
				max=scores[i];
			}
		}
		
		
		System.out.println("平均值："  +(double)sum/scores.length);
		System.out.println("最大值："+max );
		/********** End **********/

	}

}
