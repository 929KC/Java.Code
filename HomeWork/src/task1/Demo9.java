package task1;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 14:04
 */

import java.util.Scanner;

/**
 * 质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数（规定1既不是质数也不是合数）。
 */
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        long startTime = System.currentTimeMillis();
        for (; i < n; i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        if (i == n) {
            System.out.println("是素数");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (double) (endTime - startTime) / 1000 + "s");
    }
}
