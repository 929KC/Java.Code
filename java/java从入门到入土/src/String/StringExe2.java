package String;

import java.util.Scanner;

public class StringExe2 {
    public static void main(String[] args) {
    //模拟登录网站，3次机会
        String okLoginName="intheroom";
        String okPassWord="123456";
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <=3; i++) {
            System.out.println("请输入你的用户名");
            String name=sc.next();
            System.out.println("请输入你的密码");
            String password=sc.next();
            if (name.equals(okLoginName)){
                if(password.equals(okPassWord)){
                    System.out.println("恭喜你登录成功，你可以为所欲为了！");
                    break;
                }else{
                    System.out.println("你输入的密码有误,你还有"+(3-i)+"次机会");
                }
            }else{
                System.out.println("你输入的用户名有误,你还有"+(3-i)+"次机会");
            }
        }

    }
}
