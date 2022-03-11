package inthetouge_1;

import java.util.Scanner;

public class DWhileTest {

	public static void main(String[] args) {
		 // 定义变量n，接收输入值
       
        // 定义求和变量sum，并赋初值0
      float sum=0;
        // 定义变量i,并赋初值0
        int i=1;
        
        //创建Scanner对象
        Scanner input = new Scanner(System.in);
       // System.out.println("请输入一个数：");
        int n=input.nextInt();
         // 请在Begin-End间编写代码
        /********** Begin **********/
        
		// 获取输入值n
       
        do{
          sum+=i;
          i++;
            } while(i<n);
            //System.out.println(sum);
        // 在while后判断条件，当i不小于n时退出循环
       
        
        // 输出平均值，保留两位小数
      float average=sum/n;
        System.out.printf("%.2f",average);
        /********** End **********/


	}

}
