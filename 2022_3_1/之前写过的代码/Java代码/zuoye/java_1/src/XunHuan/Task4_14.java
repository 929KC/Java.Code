package XunHuan;
import java.util.Scanner;
public class Task4_14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞĞÊı£º");
		int m=sc.nextInt();
		for(int i=1; i<=m; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//07»ÆÃ¯ÈÙ
	}

}
