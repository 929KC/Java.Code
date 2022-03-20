package stack;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 19:30
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = " ";
        boolean flag = true;
        ArrayStack as = new ArrayStack(4);
        while (flag) {
            System.out.println("show：显示栈");
            System.out.println("exit：退出程序");
            System.out.println("push：添加数据到栈");
            System.out.println("pop：从栈中取出数据");
            System.out.println("请输入您的选择：");
            key = sc.next();
            switch (key) {
                case "show":
                    as.showList();
                    break;
                case "exit":
                    sc.close();
                    flag = false;
                    break;
                case "push":
                    System.out.println("请输入您要添加的数据：");
                    int num = sc.nextInt();
                    as.push(num);
                    break;
                case "pop":
                    try {
                        int ret = as.pop();
                        System.out.println("出栈的数据是："+ret);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        System.out.println("程序终止！");
    }
}
