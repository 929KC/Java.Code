package task4;

import java.util.Arrays;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-01 20:46
 */

public class Demo4 {
    public static void main(String[] args) {
        int [] arr1=new int[]{11,22,33};
        int [] arr2=arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        arr2[1]=90;
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);

    }
}
