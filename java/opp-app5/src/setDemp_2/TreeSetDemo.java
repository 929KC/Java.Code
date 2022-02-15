package setDemp_2;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-15
 * Time: 14:24
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Apple> sets=new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                /*return o1.getWeight()-o2.getWeight();*/
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        });

         /*sets.add(45);
        sets.add(451);
        sets.add(451);
        sets.add(415);
        sets.add(405);*/

       /* sets.add("java");
        sets.add("c++");
        sets.add("html");
        sets.add("mySQL");
        System.out.println(sets);*/
        sets.add(new Apple("红苹果","红色",9.9,500));
        sets.add(new Apple("红苹果","红色",9.9,500));
        sets.add(new Apple("青苹果","青色",9.7,400));
        sets.add(new Apple("黄苹果","黄色",9.8,100));
        System.out.println(sets);

    }
}
