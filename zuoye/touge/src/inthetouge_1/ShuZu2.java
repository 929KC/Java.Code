package inthetouge_1;

import java.util.Scanner;

public class ShuZu2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[sc.nextInt()];
		
		//ѭ�������鸳ֵ
		for(int i = 0 ; i< scores.length;i++){
			scores[i] = sc.nextInt();
		}
		/********** Begin **********/
		//�������������scores��ƽ��ֵ�����ֵ
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
		
		
		System.out.println("ƽ��ֵ��"  +(double)sum/scores.length);
		System.out.println("���ֵ��"+max );
		/********** End **********/

	}

}
