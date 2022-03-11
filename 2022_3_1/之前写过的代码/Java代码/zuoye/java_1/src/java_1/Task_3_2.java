package java_1;
import java.util.Scanner;
public class Task_3_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=0;
		char x;
		System.out.println("请输入性别：");
		x=sc.next().charAt(0);
		System.out.println("请输入年龄：");
		age=sc.nextInt();
		//07*、 黄茂荣
		switch(x) {
		case 'F':
			if(age>20) {
				System.out.println("女孩20岁以上可以喝酒");
			}
			else {
				System.out.println("女孩20岁以下可以饮料");
			}
			break;
			case 'M':
			if(age>18) {
				System.out.println("男孩18岁以上可以喝酒");
			}
			else {
				System.out.println("男孩18岁以下可以饮料");
			}
			break;
		  default:
			  System.out.println("您输入的有误。请输入F（女性）或M（男性）");
		}
	}
}
