package XunHuan;
import java.util.Scanner;
public class Task4_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          System.out.println("������һ��������n��");
          int n=sc.nextInt();
          int i=1,sum=0;
       do {
    	   if(i%5==0) {
    		   sum+=i;
    	   }
    	   i++;
       }while(i<=n);
          
     System.out.println("1��50֮������5�ı���֮�ͣ�"+sum);
     //07��ï��     
	}

}
