package task2;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-28 11:43
 */

public class Demo1 {
    public static void main(String[] args) {
                int a = 10;
                int b = 20;
                // 方法的调用
                int ret = add(a, b);
                System.out.println("ret = " + ret);
            }
            // 方法的定义
            public static int add(int x, int y) {
                return x + y;
            }
}
