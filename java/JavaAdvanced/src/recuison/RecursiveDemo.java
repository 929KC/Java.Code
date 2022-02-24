package recuison;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-24
 * Time: 18:15
 */
public class RecursiveDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = sc.nextInt();
        int value=getFactorial(number);
        System.out.println(value);
    }

    public static int getFactorial(int n){
        if(n==1){
            return 1;
        }else{
            int value=getFactorial(n-1)*n;
            return value;
        }
    }
}
