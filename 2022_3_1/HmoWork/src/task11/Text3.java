package task11;
import java.util.Scanner;
public class Text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        try {
            inputNum(num);
        } catch (InputException e) {
            e.printStackTrace();
        }
    }
    public static void inputNum(int m) throws InputException {
        if (m > 0 && m <= 100) {
            System.out.println("m" + "=" + m);
        } else {
            throw new InputException("m的范围必须在1~100");
        }
    }

}
