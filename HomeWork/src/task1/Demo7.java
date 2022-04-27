package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 13:16
 */

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(getMax(num1, num2));
        System.out.println(getMax(num1, num2));
        System.out.println(getMax(num1, num2, num3));
    }
    public static int getMax(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static double getMax(double num1,double num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static double getMax(double num1,double num2,int num3){
        double max=num1;
        if(num2>max){
            max=num2;
        }
        if (num3>max){
            max=num3;
        }
        return max;
    }
}
