package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 07:38
 */

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int year = scanner.nextInt();
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.println("是闰年");
                break;
            }else{
                System.out.println("不是闰年");
            }
        }
    }
}
