package java_1;

import java.util.Scanner;

public class Demo_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//07黄茂荣
		int score;
		System.out.println("请输入分数：");
		score=sc.nextInt();
		switch(score/10) {
		case 10:
		case 9:
		System.out.println(score+"分为优");	
		break;
		case 8:
			System.out.println(score+"分为良");	
			break;
		case 7:
			System.out.println(score+"分为中");	
			break;
		case 6:
			System.out.println(score+"分为及格");	
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println(score+"分为不及格");
			break;
			default:
				System.out.println("输入有误！");
		}

	}

}
