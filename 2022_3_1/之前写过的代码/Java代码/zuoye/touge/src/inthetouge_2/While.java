package inthetouge_2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		  // �������sum��������Ǹ����ĺͣ�������ֵ0��
        int sum=0;
        // �������i�����ڿ���ѭ����������ֵ1��
        int i=1;
        // ����Scanner����
        Scanner input = new Scanner(System.in);
        // ���� Begin-End ���д����
            
        /********** Begin **********/
        // ��һ��������whileѭ����ѭ��4��
           
         while(i<=4) {
        	
        	 int abs=input.nextInt();
        	 if(abs>=0) {
        		 sum+=abs;
        	 }
        	 i++;
         }
         System.out.println(sum);
        // �ڶ�������ȡ����ֵ
            
        // ���������ж�����ֵ�Ƿ����0���Դ���0��ֵ�ۼ�
             
        // ���Ĳ���whileѭ���еı�����1
                 
        // ���岽����ӡsumֵ
       
        /********** End **********/

	}

}
