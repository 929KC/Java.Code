package inthetouge_2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		  // 定义变量sum，用于求非负数的和，并赋初值0。
        int sum=0;
        // 定义变量i，用于控制循环，并赋初值1。
        int i=1;
        // 定义Scanner对象
        Scanner input = new Scanner(System.in);
        // 请在 Begin-End 间编写代码
            
        /********** Begin **********/
        // 第一步：定义while循环，循环4次
           
         while(i<=4) {
        	
        	 int abs=input.nextInt();
        	 if(abs>=0) {
        		 sum+=abs;
        	 }
        	 i++;
         }
         System.out.println(sum);
        // 第二步：获取输入值
            
        // 第三步：判断输入值是否大于0，对大于0的值累加
             
        // 第四步：while循环中的变量加1
                 
        // 第五步：打印sum值
       
        /********** End **********/

	}

}
