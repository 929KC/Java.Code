package intheheima3;

import java.util.Scanner;

public class intheheima04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		System.out.println("������һ���ַ�");
		String line=sc.nextLine();
		for(int i=0; i<line.length(); i++) {
			char ch=line.charAt(i);
			if(ch>='A' &&ch<='Z') {
				bigCount++;
			}else if(ch>='a'&& ch<='z') {
				smallCount++;
			}else {
				numberCount++;
			}
		}
		System.out.println("��д��ĸ�ĸ���"+bigCount);
		System.out.println("Сд��ĸ�ĸ���"+smallCount);
		System.out.println("�����ַ��ĸ���"+numberCount);
	}

}
