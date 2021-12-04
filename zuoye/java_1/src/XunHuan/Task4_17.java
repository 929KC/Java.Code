package XunHuan;
import java.util.Scanner;
public class Task4_17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,sum2=0,sum3=0;
		for(; ;) {
			System.out.println();
			int number=sc.nextInt();
			if(number==0) {
				sum3++;
			}else if(number>0){
				sum++;
			}else {
				sum2++;
			}
			if(number==999) {
				break;
			}
		}
  System.out.println("您输入的正数有："+sum+",负数有："+sum2+"个"+",0的个数有"+sum3);
  //07黄茂荣
	}

}
