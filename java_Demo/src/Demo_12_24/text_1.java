package Demo_12_24;

import java.util.Scanner;

public class text_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������10�����������Ԫ�أ�");
		int[] arr = new int[10];
		int i;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("��������Ҫ���ҵ�Ԫ�أ�");
		int k = sc.nextInt();
		for (i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == k) {
		System.out.println("���ҵ���������ĵ�" + (i + 1) + "��λ��.");
				break;
			} else if (i >= arr.length - 1 || i < 0) {
				System.out.println("������˼��û�ҵ���");
			}
		}//07��ï��
	}

}
