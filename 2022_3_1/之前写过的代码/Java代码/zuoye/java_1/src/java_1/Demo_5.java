package java_1;

import java.util.Scanner;

public class Demo_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year,month;
		System.out.println("��������ݣ�");
		year=sc.nextInt();
		System.out.println("�������·ݣ�");
		month=sc.nextInt();
		if(year==2000&& month==2) {
			System.out.println(year+"��"+month+"�µ������ǣ�28��");
		}else if(year==2001 && month==2) {
			System.out.println(year+"��"+month+"�µ������ǣ�29��");
		}
		if(year==2002&& month==3) {
			System.out.println(year+"��"+month+"�µ������ǣ�31��");
		}else if(year==2002 && month==9) {
			System.out.println(year+"��"+month+"�µ������ǣ�30��");
		}
		
	}

}
