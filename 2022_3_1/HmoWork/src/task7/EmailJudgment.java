package task7;

import java.util.Scanner;

public class EmailJudgment {
    public static void main(String[] args) {
       while (true) {
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入你的电子邮箱号：");
           String email = sc.nextLine();
           boolean isEmail = EmailJudgment(email);
           isEmail(isEmail,email);
       }
    }

    public static boolean EmailJudgment(String email) {
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        if (email.contains("@")) {
            if (email.contains(".")) {
                if (index1 < index2) {
                    if (index1 != 0 && index2 != email.length() - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static  void isEmail(boolean isEmail,String email){
        if (isEmail) {
            System.out.println("您输入电子邮箱合法！");
        }else{
            System.out.println("您输入的电子邮件不合法！");
        }
    }
}