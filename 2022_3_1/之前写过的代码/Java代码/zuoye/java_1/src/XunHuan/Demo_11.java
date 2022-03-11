package XunHuan;
import java.util.Scanner;
public class Demo_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          for(int i=1; i<=9999; i++) {
        	  System.out.println("请输入第1个数：");
        	  int number=sc.nextInt();
        	  System.out.println("请输入第2个数：");
        	  int number2=sc.nextInt();
        	  int sum=number+number2;
        	  if(sum%5!=0) {
        		  System.out.println("不好意思，您输了！");
        		  break;
        	  }
          }
          //07黄茂荣
	}
}
