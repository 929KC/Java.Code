package java_1;
import java.util.Scanner;
public class Task_3_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=0;
		char x;
		System.out.println("�������Ա�");
		x=sc.next().charAt(0);
		System.out.println("���������䣺");
		age=sc.nextInt();
		//07*�� ��ï��
		switch(x) {
		case 'F':
			if(age>20) {
				System.out.println("Ů��20�����Ͽ��ԺȾ�");
			}
			else {
				System.out.println("Ů��20�����¿�������");
			}
			break;
			case 'M':
			if(age>18) {
				System.out.println("�к�18�����Ͽ��ԺȾ�");
			}
			else {
				System.out.println("�к�18�����¿�������");
			}
			break;
		  default:
			  System.out.println("�����������������F��Ů�ԣ���M�����ԣ�");
		}
	}
}
