package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 07:55
 */

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;
        int ret=1;
        int i=1;
        while (i<=num){
           ret*=i;
           sum+=ret;
            i++;
        }
        System.out.println(sum);
    }
}
