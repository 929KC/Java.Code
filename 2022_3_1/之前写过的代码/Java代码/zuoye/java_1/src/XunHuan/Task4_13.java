package XunHuan;
import java.util.Scanner;
public class Task4_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("请输入行数");
		 int m=sc.nextInt();
		 System.out.println("请输入列数");
		 int n=sc.nextInt();
		 for(int i=1; i<=m; i++) {
			 for(int k=1;k<=n; k++) {
				 System.out.print("*");
			 }
			 System.out.println("\t");
		 }
		 //07黄茂荣
	}

}
