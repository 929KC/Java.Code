package Map;

import java.util.*;


/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-16
 * Time: 19:42
 */
public class Map_Text_2 {
    public static void main(String[] args) {
        // 1、要求程序记录每个学生选择的情况。
        // 使用一个Map集合存储。
       Map<String, List<String>>  date=new  HashMap<>();
        // 2、把学生选择的数据存入进去。
       List<String>  selects=new ArrayList<>();
        Collections.addAll(selects,"A","B");
        date.put("叶子秋",selects);

        List<String>  selects2=new ArrayList<>();
        Collections.addAll(selects2,"D","B","C");
        date.put("黄茂云",selects2);

        List<String>  selects3=new ArrayList<>();
        Collections.addAll(selects3,"A","B","C","D");
        date.put("叶秋涵",selects3);
        System.out.println(date);


        // 3、统计每个景点选择的人数。
        Map<String,Integer> infos=new HashMap<>();

        // 4、提取所有人选择的景点的信息。
        Collection<List<String>> values=date.values();
        System.out.println(values);

        for (List<String> value : values) {
            for (String s : value) {
                if(infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else{
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);

    }
}
