package inthetouge03;

import java.util.Scanner;

public class TransFrom {

	public static void main(String[] args) {
		//创建一个Scanner的实例对象，命名为reader
        Scanner reader = new Scanner(System.in);
        // double型变量a
        System.out.println("请输入一个数：");
        double a = reader.nextDouble();
        // short型变量b
        System.out.println("请输入一个数：");
        short b = reader.nextShort();
        // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
        /********** Begin **********/

        // 第一步：将double型变量a强转为int型
            int c=(int)a;
            System.out.println(c);
        // 第二步：将short型变量b转换为double型
              double d=b;
              System.out.println(d);
        // 第三步：换行输出变量a转换后的结果

        // 第四步：不换行输出变量b转换后的结果

        /********** End **********/


	}

}
