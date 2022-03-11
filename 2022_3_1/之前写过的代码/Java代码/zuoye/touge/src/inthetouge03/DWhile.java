package inthetouge03;

import java.util.Scanner;

public class DWhile {

	public static void main(String[] args) {
		  // 定义变量positive，并赋初值0,用于统计正数个数
        int positive=0;
        // 定义变量negative，并赋初值0，用于统计负数个数
        int negative=0;
        
        // 创建Scanner对象
        Scanner input = new Scanner(System.in);
        char s='0';
        // 在do后的花括号中编写循环语句
        while(!input.hasNext("%")){
        // 请在 Begin-End 间编写代码
        /********** Begin **********/
            // 第一步： 获取输入值
            int n=input.nextInt();
            // 第二步：判断输入值是否为正数，如果是，把正数个数变量positive加1
           if(n>0)
           positive++;
            // 第三步：判断输入值是否为负数，如果是，把负数个数变量negative加1
           if(n<0)
           negative++;
           if(n==0)
           continue;         
           
           // 第四步：在while后判断条件，当输入值的下一个值为%时，终止循环
        } 
           // 第五步：输出正数和复数个数，具体格式见预期输出
        System.out.printf("正数个数为：%d。负数个数为：%d",positive,negative);
       


	}

}
