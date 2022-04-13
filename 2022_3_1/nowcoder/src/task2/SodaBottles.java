package task2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-13
 * Time: 20:55
 */
public class SodaBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你手上的汽水空瓶：");
        int total = sc.nextInt();//空瓶
        int num = 0;//喝过的多少瓶
        while (true) {
            if (total == 0) {
                break;
            }
            while (total >= 3) {
                num += total / 3;
                total = total / 3 + total % 3;//空瓶
            }
            num=total==2?num+1:num;
            System.out.println(num);
        }
    }
}
