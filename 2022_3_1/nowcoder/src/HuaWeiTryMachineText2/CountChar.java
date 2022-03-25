package HuaWeiTryMachineText2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-25
 * Time: 22:32
 */
public class CountChar {
    public static void main(String[] args) {
        //统计字符串某个字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String word=sc.nextLine().toUpperCase();
        int count=0;
        System.out.println("输入字符：");
        char ch=sc.next().toUpperCase().charAt(0);
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)-ch==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
