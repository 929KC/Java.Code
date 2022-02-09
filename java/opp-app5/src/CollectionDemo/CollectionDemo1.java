package CollectionDemo;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-09
 * Time: 21:54
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序 有索引 可重复
    Collection list=new ArrayList();
    list.add("叶秋寒");
    list.add("黄茂荣");
    list.add(999);
    list.add(false);
    list.add(false);
    System.out.println(list);
   System.out.println("**************");
   //无序 无索引 不重复
    Collection list2=new HashSet();
    list2.add("叶秋涵");
    list2.add("叶子秋");
    list2.add(152400);
    list2.add(true);
    System.out.println(list2);
    System.out.println("***********");
    Collection<String> list3=new ArrayList();
        list3.add("叶秋寒");
        list3.add("黄茂荣");
        System.out.println(list3);
        Collection<Integer> list4=new HashSet();
        list4.add(999);
        list4.add(999);
        list4.add(999);
        list4.add(12);
        list4.add(999);
        list4.add(999);
        System.out.println(list4);
    }
}
