package sort;

import java.util.Arrays;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-26
 * Time: 8:05
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12, 45, 783, 485, 4};
        BubbleSort(arr);
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}