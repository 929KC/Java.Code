package intheheima2;

import java.util.Scanner;

public class StringDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String line=sc.nextLine();
		
	 String s= resever(line);
	 System.out.println("s:"+s);
	}
	public static String resever(String s) {
		String ss="";
		for(int i=s.length()-1; i>=0; i--) {
			s+=s.charAt(i);
			
		}
		
		return ss;
		
	}

}
