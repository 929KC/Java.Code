package XunHuan;
import java.util.Scanner;
public class Task4_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sum=0;
           for(int i=1; i<5; i++) {
           System.out.println("���������"+i+"�ſεĳɼ���");
           int score=sc.nextInt();
            sum+=score;
             }
             float average=sum/4;
System.out.printf("4�ſγ̵��ܳɼ��ǣ�%.1f,\nƽ����:%.1f",sum,
             average);
            		//07��ï��
	}
}
