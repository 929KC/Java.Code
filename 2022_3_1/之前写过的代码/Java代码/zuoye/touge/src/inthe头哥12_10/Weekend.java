package intheÍ·¸ç12_10;

import java.util.Scanner;

public class Weekend {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞÇÆÚ£º");
        String word = input.next();	
        switch(word) {
        case "Monday":
        	System.out.println("Weekday");
        	break;
        case "Tuesday":
        	System.out.println("Weekday");
        	break;
        case "Wednesday":
        	System.out.println("Weekday");
        	break;
        case "Thursday":
        	System.out.println("Weekday");
        	break;
        case "Friday":
        	System.out.println("Weekday");
        	break;
        case "Saturday":
        	System.out.println("Weekend");
        	break;
        case "Sunday":
        	System.out.println("Weekend");
        	break;
        	default:
        		System.out.println("ops");
        }

	}

}
