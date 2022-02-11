package genericity;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-11
 * Time: 14:17
 */
public class Text {
    public static void main(String[] args) {
        MyList<String>  list = new MyList();
        list.add("叶秋涵");
        list.add("叶子秋");
        list.add("5201314");
        System.out.println(list);
        list.remove("叶子秋");
        System.out.println(list);
    }
}
