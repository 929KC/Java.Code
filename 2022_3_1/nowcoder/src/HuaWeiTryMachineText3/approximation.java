package HuaWeiTryMachineText3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-26
 * Time: 15:50
 */
public class approximation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个浮点数：");
        double num = sc.nextDouble();
        int number = (int) Math.round(num);
        System.out.println("近似值：" + number);
    }
}
