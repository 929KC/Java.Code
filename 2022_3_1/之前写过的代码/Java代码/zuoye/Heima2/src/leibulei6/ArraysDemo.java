package leibulei6;

/*
	public sattic void sort (int [] a):按照数字顺序排列指定的数组
	public static String toString (int [] a):返回指定数组的内容的字符串表示形式
*/
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = { 0, 99, 56, 8 };
		System.out.println("排序前：" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));
	}
}