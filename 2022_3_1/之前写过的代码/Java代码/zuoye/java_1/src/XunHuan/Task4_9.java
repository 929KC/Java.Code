package XunHuan;
import java.util.Scanner;
public class Task4_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum = 0; int k=0;
		for (int i = 1; i < 7; i++) {
			System.out.println("请输入出第" + i + "门课的成绩：");
			int score = sc.nextInt();
			if(score>0) {
				sum += score;
				k++;
			}
		}
		float average = sum / 4;
		System.out.printf("你一共输入了"+k+"门课程的总成绩是：%.1f,\n平均分:%.1f"
		, sum, average);
		// 07黄茂荣
	}
}
