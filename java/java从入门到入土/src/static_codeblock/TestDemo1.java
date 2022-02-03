package static_codeblock;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-03
 * Time: 10:56
 */
public class TestDemo1 {
     public static String name;
    /**
     特点：与类一起加载，自动触发一次，优先执行
     作用：可以在程序加载时进行静态数据的初始化操作（准备内容）
     */
    static {
        name="叶秋寒";
        System.out.println("****静态代码块***");
    }
    public static void main(String[] args) {
        System.out.println(name);
    }
}
