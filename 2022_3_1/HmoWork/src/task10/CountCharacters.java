package task10;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-06
 * Time: 12:27
 */
public class CountCharacters {
    public static final    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CuntCharacters();
    }

    private static void CuntCharacters() {
        System.out.println("请输入一个字符串：");
        String word = sc.nextLine();
        char [] arr=word.toCharArray();//转换成字符数组
        TreeMap<Character, Integer> map=new TreeMap<>();
        for (char c : arr) {
           if(map.containsKey(c)){
               int key=map.get(c);
               map.put(c,key+1);
           }else{
               map.put(c,1);
           }
        }

        Set<Character> set=map.keySet();
        for (Character character : set) {
            System.out.println(character+":"+map.get(character));
        }
    }
}
