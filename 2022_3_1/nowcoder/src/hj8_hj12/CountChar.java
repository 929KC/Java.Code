package hj8_hj12;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-06
 * Time: 14:43
 */
public class CountChar {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StatisticalCharacters();
    }

    private static void StatisticalCharacters() {
        System.out.println("请输入一个字符串：");
        String word = sc.next();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        System.out.println(set.size());
    }
}
