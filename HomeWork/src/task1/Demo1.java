package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-26 20:44
 */

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=3;
       while (count!=0){
           System.out.println("请输入你的密码");
           String passWord= sc.next();
           if(passWord.equals("123456")){
               System.out.println("恭喜你，登录成功!");
               break;
           }else{
               System.out.println("登录失败,你还有"+--count+"次机会");
           }
       }
    }
}
