package inthetouge_1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt(); //第一门成绩
		int score2 = sc.nextInt(); //第二门成绩
		/********** Begin **********/
        // 调用方法，传入两门课程的成绩
        calcAvg( score1,score2 );
        System.out.println();
		/********** End **********/
    }

    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */

	/********** Begin **********/
     public static  int calcAvg(int number1, int number2){
  
          int sum=(number1+number2)/2;
          return sum;

     }

	/********** End **********/
	

}
