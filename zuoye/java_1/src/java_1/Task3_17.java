package java_1;
import java.util.Scanner;
public class Task3_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month = 0, day=0;
		System.out.println("��������ݣ�");
		year = sc.nextInt();
		System.out.println("�������·ݣ�");
		month = sc.nextInt();
		//07�Sï��
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

				day = 20;

			} else {
				day = 28;
			}
			break;
		default:
			System.out.println("��������");
		}
        System.out.println(year+"��"+month+"����"+day+"��");
	}
}
