package String;

import java.util.Scanner;

public class StringEqualsDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="inthehei";
        String passWord="123456";
        System.out.println();
        System.out.println("请输入登录名称：");
        String MyName=sc.next();
        System.out.println("请输入登录密码：");
        String  MyPassWord=sc.next();
//        if (name==MyName){===比较的 是地址值
//            System.out.println("登录成功！");
//        }else{
//            System.out.println("登录失败");
//        }

        if (name.equals(MyName)&&passWord.equals(MyPassWord)){
            System.out.println("登录成功！");
        }else{
            System.out.println("登录失败");
        }
        String word="ASDFGHJ";
        String word2="asdfghj";
        System.out.println(word.equals(word2));
        System.out.println(word2.equalsIgnoreCase(word2));//无视大小写

    }

}
