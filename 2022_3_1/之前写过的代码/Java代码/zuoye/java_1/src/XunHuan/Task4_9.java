package XunHuan;
import java.util.Scanner;
public class Task4_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum = 0; int k=0;
		for (int i = 1; i < 7; i++) {
			System.out.println("���������" + i + "�ſεĳɼ���");
			int score = sc.nextInt();
			if(score>0) {
				sum += score;
				k++;
			}
		}
		float average = sum / 4;
		System.out.printf("��һ��������"+k+"�ſγ̵��ܳɼ��ǣ�%.1f,\nƽ����:%.1f"
		, sum, average);
		// 07��ï��
	}
}
