package Company;
import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入每个小时的工资：");
        double salary = sc.nextDouble();
        Pay p = new Pay(salary);
        double gPay1 = p.computeNatPay(12);
        double gPay2 = p.computeNatPay(12, 5.15);
        double gPay3 = p.computeNatPay(15, 0.12, 0.45);
        System.out.println("应得工资1：" + gPay1);
        System.out.println("应得工资2：" + gPay2);
        System.out.println("应得工资3：" + gPay3);
    }
}
