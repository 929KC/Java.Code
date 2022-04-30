package task3;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 17:03
 */

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if(num<10){
            return num;
        }
        return num%10+sum(num/10);
    }


}
