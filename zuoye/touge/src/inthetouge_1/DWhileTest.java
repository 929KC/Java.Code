package inthetouge_1;

import java.util.Scanner;

public class DWhileTest {

	public static void main(String[] args) {
		 // �������n����������ֵ
       
        // ������ͱ���sum��������ֵ0
      float sum=0;
        // �������i,������ֵ0
        int i=1;
        
        //����Scanner����
        Scanner input = new Scanner(System.in);
       // System.out.println("������һ������");
        int n=input.nextInt();
         // ����Begin-End���д����
        /********** Begin **********/
        
		// ��ȡ����ֵn
       
        do{
          sum+=i;
          i++;
            } while(i<n);
            //System.out.println(sum);
        // ��while���ж���������i��С��nʱ�˳�ѭ��
       
        
        // ���ƽ��ֵ��������λС��
      float average=sum/n;
        System.out.printf("%.2f",average);
        /********** End **********/


	}

}
