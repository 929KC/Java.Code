package hj8_hj12;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-06
 * Time: 15:28
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i=word.length()-1;i>=0;i--){
            if(word.charAt(i)>='a'&&word.charAt(i)<='z'){
                System.out.print(word.charAt(i));
            }
        }
    }
}
