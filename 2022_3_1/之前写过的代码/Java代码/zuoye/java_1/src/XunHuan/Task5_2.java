package XunHuan;
import java.util.Scanner;
public class Task5_2 {
	public static void main(String[] args) {
             Task5_2 t=new Task5_2();
             t.getSan();
	}
	public void getSan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入直角三角形的行数：");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			//07黄茂荣
			System.out.println();
		}
	}
}
