package Map;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * Description:
 * @Author KC萧寒
 * Date: 2022-02-16
 * Time: 12:57
 */
public class MapAPI {
    public static void main(String[] args) {


/*
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("huawei",12);
        maps.put("苹果",12);
        maps.put("肉",12);
        maps.put("肉",12);
        maps.put("java",12);
        System.out.println(maps);*/

/*
        Map<String, Integer> maps = new TreeMap<>();
        maps.put("huawei",12);
        maps.put("苹果",12);
        maps.put("肉",12);
        maps.put("肉",12);
        maps.put("java",12);
        System.out.println(maps);*/


     /*   System.out.println(maps.remove("java"));
        System.out.println(maps);*/
       // maps.clear();
        //System.out.println(maps);
 /*       System.out.println(maps.isEmpty());
        System.out.println(maps.containsKey("java"));
        System.out.println(maps.containsValue(41));
        int size=maps.size();
        System.out.println(size);
*/
        // 8.获取全部键的集合：public Set<K> keySet()
       /* Set<String> keys=maps.keySet();
        System.out.println(keys);

        // 9.获取全部值的集合：Collection<V> values();
        Collection<Integer> values=maps.values();
        System.out.println(values);
        // 11.合并其他Map集合。(拓展)
        Map<String, Integer> map1=new HashMap<>();
          map1.put("java1",1);
        map1.put("java2",100);
        Map<String, Integer> map2=new HashMap<>();
        map2.put("java1",1);
        map2.put("java2",100);
        map1.putAll(map2);//将集合map2的元素拷贝到map1中去
        System.out.println(map1);
        System.out.println(map2);*/

        Map<String, Integer> maps = new HashMap<>();
        maps.put("huawei",121);
        maps.put("苹果",1254);
        maps.put("肉",120);
        maps.put("java",441);
        maps.put("java2",541);
        maps.put("html",431);
        System.out.println(maps);
            //遍历1
      /*  Set<String> keys=maps.keySet();
        for (String key : keys) {
            int values=maps.get(key);
            System.out.println(key+"----->"+values);
        }*/

        //遍历2
        /*Set<Map.Entry<String, Integer>> entries = maps.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value=entry.getValue();
            System.out.println(key+"--->"+value);
        }*/

        //遍历三
        maps.forEach((k, v) ->{System.out.println(k+"---->"+v); });




    }
}
