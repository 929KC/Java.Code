package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 13:39
 */

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ret=1;
        while (i<=n) {
          ret*=i;
            i++;
        }
        System.out.println(ret);
    }
}
