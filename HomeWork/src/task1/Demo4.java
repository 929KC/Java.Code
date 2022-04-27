package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 07:49
 */

public class Demo4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    int sum1=add(num1,num2);
    double sum2=add(num1,num2,num3);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static double add(double num1,double num2,double num3){
        return num1+num2+num3;
    }


}
