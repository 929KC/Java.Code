package task3;
import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请问您要几杯果汁：");
        int num = sc.nextInt();
        Juicer j = new Juicer();
        Apple a = new Apple("青苹果", "绿色", "酸酸的");

        Banana b = new Banana("金香蕉", "黄色", "甜甜的");
        String s = j.GetFruitJuicer(a);
        System.out.println(s);
        String s2 = j.GetFruitJuicer(a, b);
        System.out.println(s2);
        String s3 = j.GetFruitJuicer(a, num);
        System.out.println(s3);
    }
}
