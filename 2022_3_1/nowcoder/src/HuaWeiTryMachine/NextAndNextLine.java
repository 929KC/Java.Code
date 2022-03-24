package HuaWeiTryMachine;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-24
 * Time: 21:22
 */
public class NextAndNextLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.print("请输入第一个字符串：");
        s1=sc.next();
        System.out.println("输入的字符串是："+s1);
        System.out.print("请输入第二个字符串：");
        s2=sc.nextLine();
        System.out.println("输入的字符串是："+s2);
    }
}
