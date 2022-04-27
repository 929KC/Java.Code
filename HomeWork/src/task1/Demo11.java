package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 14:44
 */

public class Demo11 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 2;
            for (; i <=Math.sqrt(n); i++) {
                if(n%i==0){
                    System.out.println("不是素数");
                    break;
                }
            }
            if(i>Math.sqrt(n)){
                System.out.println("是素数");
                break;
            }
        }
    }
}
