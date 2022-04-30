package task3;

import java.util.Scanner;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 16:41
 */

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num=sc.nextInt();
        print(num);
    }
    public static void print(int n){
        if(n<10){
            System.out.print(n);
        }else{
            print(n/10);
            System.out.print(n%10);
        }

    }

}
