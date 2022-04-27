package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 18:47
 */

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%b;
        while(c!=0){
        a=b;
        b=c;
        c=a%b;
        }
        System.out.println("最大公约数为："+b);
    }
}
