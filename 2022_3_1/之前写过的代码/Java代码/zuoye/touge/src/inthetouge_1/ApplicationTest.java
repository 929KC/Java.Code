package inthetouge_1;

import java.util.Scanner;

public class ApplicationTest {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        // 声明 double 类型变量 score  获取控制台输入的学生成绩
	        double score = scanner.nextDouble();
			// 声明 int 类型变量 temp 用来保存学生成绩是否合格的结果（1 或者 0）
			int temp ;
	        /********** Begin **********/
	        // 使用三元表达式，判断变量 score 是否小于 60 ，如果小于 60 ，则将数值 0 赋值给变量 temp；
			//反之，则将数值 1 赋值给变量 temp
	           temp=score>=60 ? 1:0;
	        /********** End **********/
			String result = temp == 1 ? "合格":"不合格";
	        System.out.println("该学生成绩判定为：" +result );

	}

}
