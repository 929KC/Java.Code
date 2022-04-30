package task3;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 19:41
 */

public class Demo7 {
    public static void main(String[] args) {
        int n1=fib(3);
        int n2=fib(4);
        System.out.println(n1);
        System.out.println(n2);
    }

    public static  int fib(int n){
        if(n<0){
            return -1;
        }
        if(n==1||n==2){
            return 1;
        }
        int f1=1;
        int f2=1;
        int f3=-1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

}
