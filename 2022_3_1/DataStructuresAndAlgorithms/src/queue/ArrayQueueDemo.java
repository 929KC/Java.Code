package q;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-17
 * Time: 21:51
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue(3);
        boolean loop=true;
        System.out.println("请输入您的选择");
        char key= ' ';
        while(loop) {
            System.out.println("s(show): 显示队列数据");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据");
            System.out.println("g(get): 获取数据");
            System.out.println("h(head): 得到头数据");
            key = sc.next().charAt(0);
            switch (key) {
                case 's':
                    q.show();
                    break;
                case 'a':
                    System.out.println("请输入一个数：");
                    int value = sc.nextInt();
                    q.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = q.getQueue();
                        System.out.printf("%d", res);
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = q.headQueue();
                        System.out.println(res);
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    sc.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("退出程序！");
    }
}
