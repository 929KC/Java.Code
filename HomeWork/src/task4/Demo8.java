package task4;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-02 16:13
 */

public class Demo8 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[1] = new int[]{1,2,3};
        arr[2] = new int[4];
        arr[2][1] = 30;
        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
