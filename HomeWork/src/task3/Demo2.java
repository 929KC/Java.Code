package task3;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 16:33
 */

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int ret= factor(num);
        System.out.println(ret);
    }
    public static int  factor(int n){
        if(n==1){
            return 1;
        }
        int ret=n*factor(n-1);
        return ret;
    }

}
