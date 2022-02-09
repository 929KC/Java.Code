package ArrayDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-09
 * Time: 16:57
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        String str= Arrays.toString(arr);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");
        int arr2[]={12,45,78,14,5,78,69,3,50,7452};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //降序排序：(自定义比较器，只能支持引用类型
        Integer arr4[]={12,45,78,14,5,78,69,3,50,7452};
//        Arrays.sort(arr4, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -(o1-o2);
//            }
//        });

        Arrays.sort(arr4,( o1,  o2)-> -(o1-o2)  );

        System.out.println(Arrays.toString(arr4));

        System.out.println("--------------");
        int arr5[]={1,2,3,4,5,6,7,8,9,10};
        int index=Arrays.binarySearch(arr5,5);
        System.out.println(index);
    }


}
