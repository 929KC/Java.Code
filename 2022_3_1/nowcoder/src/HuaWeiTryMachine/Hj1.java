package HuaWeiTryMachine;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-24
 * Time: 20:17
 */
public class Hj1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("请请输入一个字符串:");
        String word=sc.next();
        int num=getValue(word);
        System.out.println("字符串最后一个子串的长度："+num);
    }

    public static int getValue(String word) {
        int len = word.length();
        int index = -1;
        for (int i = len - 1; i >= 0; i--) {
            if (word.charAt(i) == ' ') {
                index = i;
                break;
            }
        }
        return len - 1 - index;
    }
}
