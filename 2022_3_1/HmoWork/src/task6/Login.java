package task6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-30
 * Time: 11:26
 */
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String name=sc.next();
        System.out.println("请输入你的密码：");
        String passWord=sc.next();
        if(name.equals("黄茂荣")){
            if(passWord.equals("123456")){
                System.out.println("登录成功");
            }else{
                System.out.println("密码错误");
            }
        }else{
            System.out.println("用户名错误");
        }
    }
}
