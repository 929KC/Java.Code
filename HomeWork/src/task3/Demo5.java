package task3;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 18:49
 */

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));


    }

    public static  int sum(int n ){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

}
