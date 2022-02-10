package CollectionDemo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 11:14
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList();
        list.add("叶秋涵");
        list.add("544");
        list.add("你是猪");
        list.add("你是傻子");
        //迭代器
        //得到迭代器对象
    Iterator<String> it=list.iterator();
    while(it.hasNext()){
        String ele=it.next();
        System.out.println(ele);
    }

    }
}
