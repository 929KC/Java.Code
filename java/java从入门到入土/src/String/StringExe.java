package String;

import java.util.Random;

public class StringExe {
    public static void main(String[] args) {
       //获取5位数的验证码
        String passWord="abcdefghijklmnopqrstuvwhrzABCDEFGHIJKLMNOPQRSTUYWHRZ0123456789";
        String code="";
        Random r=new Random();
        for (int i=0;i<5;i++){
            int index=r.nextInt(passWord.length());//0~5(左闭右开)
            char c=passWord.charAt(index);
            code+=c;
        }
        System.out.println(code);
    }
}
