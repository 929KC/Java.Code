package java_1;

import java.util.Scanner;

public class Practice {

	final static Scanner sc = new Scanner(System.in);	//创建扫描仪

	//第一题
	public void first(){
		System.out.println("请输入人数：");
        int input = sc.nextInt();		//获取输入的数据
        
		/*****start*****/
		if (input<10) {
			System.out.println("打办场");
		} else {
			System.out.println("打全场");
		}
		
		
		
		
		/*****end*****/
	}
	
	//第二题
	public void second(){
		System.out.println("请输入今天星期几：");
        int input = sc.nextInt();		//获取输入的数据
        
		/*****start*****/
         if(input==1) {
        	 System.out.println("今天吃米饭");
         }else if(input==2) {
        	 System.out.println("今天吃牛排");
         }else if(input==3) {
        	 System.out.println("今天吃鸡排");
         }else {
        	 System.out.println("今天吃红烧肉");
         }
		

		
		/*****end*****/
	}	
	
	//第三题
	public void third(){
		System.out.println("请输入今天星期几：");
        int input = sc.nextInt();		//获取输入的数据
        
		/*****start*****/

		switch(input) {
		case 1:
			System.out.println("今天吃米饭");
			break;
		case 2:
			 System.out.println("今天吃牛排");
			break;
		case 3:
			System.out.println("今天吃鸡排");
			break;
		default:
		System.out.println("今天吃红烧肉");
		}
		
		
		/*****end*****/
	}

}
