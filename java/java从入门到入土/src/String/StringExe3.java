package String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class StringExe3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的手机号码：");
        String tel=sc.next();
        String before=tel.substring(0,3);
        String after=tel.substring(7);
        String s=before+"****"+after;
        System.out.println(s);

    }
}
