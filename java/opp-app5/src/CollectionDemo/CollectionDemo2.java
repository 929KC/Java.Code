package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-09
 * Time: 22:32
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList();
        list.add("叶秋寒");
        list.add("你是猪");
        list.add("爱意随风起");
        list.add("我自横到向天笑");
        list.add("java");
        list.add("java");
        System.out.println(list);
        System.out.println("********");
        //list.clear();
       // System.out.println(list);
       list.remove("java");
        System.out.println(list);
        System.out.println(list.contains("java"));
        System.out.println(list.isEmpty());
        int size=list.size();
        System.out.println(size);
        Object arr[]=list.toArray();
        System.out.println(Arrays.toString(arr));
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
