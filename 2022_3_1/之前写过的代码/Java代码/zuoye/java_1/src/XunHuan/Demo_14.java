package XunHuan;
import java.util.Scanner;
public class Demo_14 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入等腰三角形的行数：");
	int m=sc.nextInt();
	for(int i=0; i<=m; i++) {
		
		for(int j=0; j<=4-i;j++) {
			System.out.print("");
		}
		for( int j=0; j<2*i+1; j++ ) {
			
			System.out.print("*");
			
		}
		
		System.out.print("\n");
	}
	}

}
