package hj20;

import java.util.Scanner;




/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-08
 * Time: 20:16
 */
public class hi20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println("请输入一个字符串：");
            String passWord = sc.nextLine();
            boolean flag = true;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            char[] arr = passWord.toCharArray();
            if (passWord.length() > 8) {
                for (char c1 : arr) {
                    if (c1 >= 'a' && c1 < 'z') {
                        a = 1;
                    } else if (c1 >= 'A' && c1 < 'Z') {
                        b = 1;
                    } else if (c1 >= '0' && c1 <= '9') {
                        c = 1;
                    } else if (c1 ==' ' || c1 == '\n') {
                        flag = false;
                        break;
                    } else {
                        d = 1;
                    }
                }

                if(flag){
                    if((a+b+c+d)>=3){
                        if(reStr(passWord)){
                            System.out.println("YES");
                        }else{
                            System.out.println("密码重复/NO");
                        }
                    }else{
                        System.out.println("字符中类小于三/NO");
                    }
                }else{
                    System.out.println("字符含有空格或者\0/NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean reStr(String passWord) {
                for(int i=3;i<passWord.length();i++){
                    if(passWord.substring(i).contains(passWord.substring(i-3,i))){
                        return false;
                    }
                }
        return true;
    }
}
