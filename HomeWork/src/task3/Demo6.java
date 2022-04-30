package task3;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 19:18
 */

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
     int ret= fib(n);
    }
    public static  int  fib(int n ){
        if(n==1||n==2){
            return n;
        }
        int tmp=fib(n-1)+fib(n-2);
        return tmp;
    }

}
