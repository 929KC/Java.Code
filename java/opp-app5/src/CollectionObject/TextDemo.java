package CollectionObject;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 14:02
 */
public class TextDemo {
    public static void main(String[] args) {
        Collection<movie> list = new ArrayList();
        list.add(new movie("你的名字", 9.9, "海明威"));
        list.add(new movie("霸王别姬", 9.9, "张国荣"));
        list.add(new movie("唐人街侦探", 9.9, "王宝强"));
        for (movie movie : list) {
            System.out.println(movie);
        }
    }
}