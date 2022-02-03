package StaticDemo;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-03
 * Time: 9:40
 */
public class ArrayUtilsDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(ArrayUtils.toString(arr));
        System.out.println(ArrayUtils.getAverage(arr));
         int arr1[]={};
         int arr2 []=null;
        System.out.println(ArrayUtils.toString(arr1));
        System.out.println(ArrayUtils.toString(arr2));

    }
}
