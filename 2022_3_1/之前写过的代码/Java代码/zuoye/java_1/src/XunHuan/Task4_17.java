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
  System.out.println("������������У�"+sum+",�����У�"+sum2+"��"+",0�ĸ�����"+sum3);
  //07��ï��
	}

}
