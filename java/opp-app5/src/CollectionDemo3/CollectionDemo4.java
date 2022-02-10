package CollectionDemo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 13:47
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList();
        list.add("赵敏");
        list.add("叶秋寒");
        list.add("叶秋涵");
        list.forEach(s -> System.out.println(s));

    }
}
