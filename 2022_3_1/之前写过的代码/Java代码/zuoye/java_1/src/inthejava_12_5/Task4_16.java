package inthejava_12_5;

import java.util.Scanner;

public class Task4_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0,average=0;
		int score=0,j=0,l=1;
	
			for(int k=1;k<=3;k++) {
				for(int i=1;i<=4;i++) {
				System.out.print("�������"+k+"��ѧ���ĵ�"+i+"�ſγɼ���");
				  score=sc.nextInt();
					if(i==1) {
						sum+=score;
						  j++;
						  average=sum/j;
					}else if(i==2) {
						sum+=score;
						  j++;
						  average=sum/j;
					}else if(i==3) {
						sum+=score;
						  j++;
						  average=sum/j;
					}else if(i==4) {
						sum+=score;
						  j++;
						  average=sum/j;
					}
				
				  if(j%4==0) {
					  System.out.printf("��" + k+"��ѧ�����ܳɼ���" + 
								"��%.1f,ƽ����:%.2f", sum, average);	  
				
					  sum=0;average=0;j=0;
				  }

				}
				System.out.println();
				//07��ï��
	  }
	}

}
