package intheheima3;

import java.util.Scanner;

public class intheheima04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		System.out.println("请输入一个字符");
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
		System.out.println("大写字母的个数"+bigCount);
		System.out.println("小写字母的个数"+smallCount);
		System.out.println("数字字符的个数"+numberCount);
	}

}
