package homework;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-21
 * Time: 22:05
 */
public class palindrome {
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个5位数的数字：");
            String number = sc.next();
            StringBuilder sb = new StringBuilder(number);
            String s = sb.reverse().toString();

            if (s.equals(number)) {
                System.out.println(number + "是回文数！");
                break;
            } else {
                System.out.println(number + "不是回文数");

            }
        }
    }
}
