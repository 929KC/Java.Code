package HuaWeiTryMachineText3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-26
 * Time: 19:11
 */
public class Segmentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
       while (sc.hasNextLine()) {
           String word=sc.nextLine();
           split(word);
       }
    }

    public static  void split(String word) {
        if(word.length()>=8){
            System.out.println(word.substring(0,8));
            word=word.substring(8);
        }
        if(word.length()>0&&word.length()<=8){
            word+="00000000";
            System.out.println(word.substring(0,8));
        }
    }
}
