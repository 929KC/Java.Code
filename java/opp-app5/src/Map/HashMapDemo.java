package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-16
 * Time: 14:44
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 1、把80个学生选择的数据拿进来。
        String [] selects = {"A" , "B", "C", "D"};
        StringBuilder sb=new StringBuilder();
        Random r=new Random();

        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);
        // 2、定义一个Map集合记录最终统计的结果： A=30 B=20 C=20 D=10  键是景点 值是选择的数量
            Map<Character,Integer> infos= new HashMap<>();
        // 3、遍历80个学生选择的数据
        for(int i=0 ;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(infos.containsKey(ch)){
                infos.put(ch, infos.get(ch)+1);
            }else{
                infos.put(ch,1);
            }

        }
        // 4、输出集合
        System.out.println(infos);
    }
}
