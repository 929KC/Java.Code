package hi13_hij20;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-07
 * Time: 8:06
 */
public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n=sc.nextInt();
        String [] str=new String[n];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        Arrays.sort(str);
        for (String s : str) {
            System.out.println(s);
        }
    }
}
