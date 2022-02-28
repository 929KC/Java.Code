package Array;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-28
 * Time: 17:25
 */
public class ArrayDemo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int i=sc.nextInt();
       int [] arr=new int[i];
       int n=1;
        while(!sc.hasNext("#")){
           int x=sc.nextInt();
           arr[n]=x;
            n++;
        }
        int sum=0;
        for (int j : arr) {
           sum+=j;
        }
        double average=(double) sum/arr.length;

        System.out.println("数学平均成绩为："+average);
    }
}
