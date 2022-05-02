package task4;

import java.util.Arrays;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-02 20:12
 */

public class Demo11 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] ret = new int[arr.length];
          System.arraycopy(arr, 0, ret, 0, ret.length);
        System.out.println(Arrays.toString(ret));
    }
}
