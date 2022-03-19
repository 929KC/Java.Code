package queue;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 12:14
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        System.out.println("测试数组模拟环形队列的案例~~~");
        CircleArrayQueue queue = new CircleArrayQueue(4);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);
            int res;
            switch (key) {
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                case 'g':
                    try {
                        res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception var8) {
                        System.out.println(var8.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception var7) {
                        System.out.println(var7.getMessage());
                    }
                    break;
                case 's':
                    queue.show();
            }
        }
        System.out.println("程序退出~~");
    }

}

