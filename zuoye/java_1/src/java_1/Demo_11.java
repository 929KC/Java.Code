package java_1;

import java.util.Scanner;

public class Demo_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//07黄茂荣
		int month;
		System.out.print("请输入月份：");
		month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("1月属于冬天");
			break;
		case 2:
			System.out.println("2月属于冬天");
			break;
		case 3:
			System.out.println("3月属于春天");
			break;
		case 4:
			System.out.println("4月属于春天");
			break;
		case 5:
			System.out.println("5月属于春天");
			break;
		case 6:
			System.out.println("6月属于夏天");
			break;
		case 7:
			System.out.println("7月属于夏天");
			break;
		case 8:
			System.out.println("1月属于夏天");
			break;
		case 9:
			System.out.println("9月属于秋天");
			break;
		case 10:
			System.out.println("10月属于秋天");
			break;
		case 11:
			System.out.println("1月属于秋天");
			break;
		case 12:
			System.out.println("12月属于冬天");
		default:
			System.out.println("输入的月份有误");
		}

	}

}
