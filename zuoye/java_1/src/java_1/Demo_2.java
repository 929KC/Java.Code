package java_1;

import java.util.Scanner;

public class Demo_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//黄茂荣
		double a, b;
		String i;
		System.out.println("请输入第一个数字：");
		a = sc.nextDouble();
		System.out.println("请输入运算符(+、-、*、/、%)：");
		i = sc.next();
		System.out.println("请输入第二个数字：");
		b = sc.nextDouble();
		switch (i) {
		case "+":
			double result = a + b;
			System.out.println(a + "+" + b + "=" + result);
			break;
		case "-":
			double result2 = a - b;
			System.out.println(a + "-" + b + "=" + result2);
			break;
		case "*":
			double result3 = a * b;
			System.out.println(a + "*" + b + "=" + result3);
			break;
		case "/":
			double result4 = a / b;
			System.out.println(a + "/" + b + "=" + result4);
			break;
		case "%":
			double result5 = a % b;
			System.out.println(a + "%" + b + "=" + result5);
			break;
		default:
			System.out.println("输入的运算符有误！");
		}

	}

}
