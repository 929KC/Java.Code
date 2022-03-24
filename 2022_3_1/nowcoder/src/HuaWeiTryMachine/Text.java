package HuaWeiTryMachine;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-24
 * Time: 21:38
 */
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入二个字符：");
        String name2=sc.nextLine();
        int len2=name2.length();
        System.out.println(len2);
        System.out.println("请输入一个字符：");
        String name=sc.next();
        int len=name.length();
        System.out.println(len);
    }
}
