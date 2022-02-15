package Collections;


import java.util.*;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-15
 * Time: 16:29
 */
public class collectionsDemo1 {
    public static void main(String[] args) {
       List<Apple> apples=new ArrayList<>();
     /*  Collections.addAll(name,"叶秋涵","黄茂荣","黄茂云");
          Collections.shuffle(name);
        System.out.println(name);*/
       /* Collections.addAll(name,124,45,245,425,60,45 ,310,4653);
        Collections.sort(name);
        System.out.println(name);*/
        apples.add(new Apple("红苹果","红色",9.9,500));
        apples.add(new Apple("红苹果","红色",9.9,500));
        apples .add(new Apple("青苹果","青色",9.7,400));
        apples.add(new Apple("黄苹果","黄色",9.8,100));
     /*   Collections.sort(apples);
        System.out.println(apples);*/

      Collections.sort(apples, ( o1, o2)-> Double.compare(o1.getPrice(),o2.getPrice()));
        System.out.println(apples);
    }
}
