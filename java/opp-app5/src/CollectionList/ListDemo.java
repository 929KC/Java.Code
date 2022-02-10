package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 18:48
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
            list.add("叶秋涵");
            list.add("叶子秋");
            list.add("你是猪");
//        System.out.println(list);
//        list.add(3,"黄茂荣");
//        System.out.println(list);
//        String str=list.remove(3);
//        System.out.println(str);
//        System.out.println(list);
        String str2=list.set(1,"黄茂云");
        System.out.println(str2);
        System.out.println(list);
       for (int i = 0; i <list.size(); i++){
           System.out.println(list.get(i));
       }

        Iterator<String> it=list.iterator();
       while(it.hasNext()){
           String ele=it.next();
           System.out.println(ele);
       }

        for (String s : list) {
            System.out.println(s);
        }

     list.forEach(s->System.out.println(s));
    }

}
