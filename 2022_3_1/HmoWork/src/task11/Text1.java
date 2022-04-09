package task11;
import java.util.Scanner;
public class Text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
