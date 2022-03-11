package java_1;

import java.util.Scanner;

public class Demo_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year,month;
		System.out.println("请输入年份：");
		year=sc.nextInt();
		System.out.println("请输入月份：");
		month=sc.nextInt();
		if(year==2000&& month==2) {
			System.out.println(year+"年"+month+"月的天数是：28天");
		}else if(year==2001 && month==2) {
			System.out.println(year+"年"+month+"月的天数是：29天");
		}
		if(year==2002&& month==3) {
			System.out.println(year+"年"+month+"月的天数是：31天");
		}else if(year==2002 && month==9) {
			System.out.println(year+"年"+month+"月的天数是：30天");
		}
		
	}

}
