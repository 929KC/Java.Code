package inetheCsdn12_6;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ֻ��ŵ�β�ţ�");
		int card=sc.nextInt();
		switch(card) {
		case 8:
			System.out.println("��֧���쿨�ѣ�50Ԫ");
			break;
		case 4:
			System.out.println("��֧���쿨�ѣ�0Ԫ");
			break;
		default:
			System.out.println("��֧���쿨�ѣ�20Ԫ");
			
		}
	}

}
