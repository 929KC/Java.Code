package java_1;
import java.util.Scanner;
public class Task3_16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=0;
		char x;
		//07��ï��
		System.out.println("�������Ա�");
		x=sc.next().charAt(0);
		System.out.println("���������䣺");
		age=sc.nextInt();
		if(x=='M'&& age>18) {
			System.out.println("�к�18�����ϺȾ�");
		}
		if(x=='M'&& age<18) {
			System.out.println("�к�18�����º�����");
		}
		if(x=='F'&& age>20) {
			System.out.println("Ů��20�����ϺȾ�");
		}
		if(x=='F'&& age<20) {
			System.out.println("Ů��20�����º�����");
		}
	}

}
