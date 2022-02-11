package setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-11
 * Time: 22:13
 */
public class SetDemo {
    public static void main(String[] args) {
        //Set集合特点：不重复，无索引，无序
     //   Set<String> sets=new LinkedHashSet<>();//有序
        //Set<String> sets=new TreeSet<>();开排序，升序
        Set<String> sets=new HashSet<>();//不重复，无索引，无序
        sets.add("MYSQL");
        sets.add("html");
        sets.add("MYSQL");
        sets.add("java");
        System.out.println(sets);
        System.out.println(sets.hashCode());
    }
}
