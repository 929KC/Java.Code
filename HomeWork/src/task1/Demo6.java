package task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 12:45
 */

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ret=0;
        for(int i = 0;i < arr.length;i++){
            ret ^= arr[i];
        }
        System.out.println(ret);
    }
}
