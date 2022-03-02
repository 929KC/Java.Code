package task;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("**********欢迎来到宠物店**********");
            System.out.println("请输入宠物的姓名：");
            String name = sc.next();
            System.out.println("请选择你要领养的宠物：");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("恭喜您成功领养了一只狗狗");
                Dog d = new Dog();
                d.setName(name);
                System.out.println("请您选择狗狗的性别");
                n = sc.nextInt();
                if (n == 1) {
                    d.setSex("狗仔");
                } else if (n == 2) {
                    d.setSex("狗妹");
                } else {
                    System.out.println("不好意思，您选择了一只阴阳狗");
                    return;
                }

                System.out.println("请输入狗狗的健康值：");
                n = sc.nextInt();
                d.setHeath(n);
                System.out.println("请输入狗狗的亲密值：");
                n = sc.nextInt();
                d.setLive(n);
                d.print();

            } else if (n == 2) {
                System.out.println("恭喜您成功领养了一只企鹅");
                Penguin p = new Penguin();
                p.setName(name);
                System.out.println("请您选择企鹅的性别");
                n = sc.nextInt();

                if (n == 1) {
                    p.setSex("Q仔");
                } else if (n == 2) {
                    p.setSex("Q妹");
                } else {
                    System.out.println("不好意思，您选择了一只阴阳企鹅");
                    return;
                }

                System.out.println("请输入企鹅的健康值：");
                n = sc.nextInt();
                p.setHeath(n);
                System.out.println("请输入企鹅的亲密值：");
                n = sc.nextInt();
                p.setLive(n);
                p.print();
            } else {
                System.out.println("对不起,没有这个选择。");
            }
        }
    }
}
