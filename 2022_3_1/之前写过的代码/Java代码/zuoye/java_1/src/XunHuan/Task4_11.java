package XunHuan;
import java.util.Scanner;
public class Task4_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				int number1 = i % 10;
				if (number1 != 2 && number1 != 3 && number1 != 4 && number1 != 7) {
					sum += i;
				}
			}
		}
		System.out.println("1~100之间个位数不是2,3,4,7，" +
		"并且不能被三整除的整数之和为：" + sum);
	}
           //07黄茂荣
}
