package inthetouge03;

import java.util.Scanner;

public class DWhile {

	public static void main(String[] args) {
		  // �������positive��������ֵ0,����ͳ����������
        int positive=0;
        // �������negative��������ֵ0������ͳ�Ƹ�������
        int negative=0;
        
        // ����Scanner����
        Scanner input = new Scanner(System.in);
        char s='0';
        // ��do��Ļ������б�дѭ�����
        while(!input.hasNext("%")){
        // ���� Begin-End ���д����
        /********** Begin **********/
            // ��һ���� ��ȡ����ֵ
            int n=input.nextInt();
            // �ڶ������ж�����ֵ�Ƿ�Ϊ����������ǣ���������������positive��1
           if(n>0)
           positive++;
            // ���������ж�����ֵ�Ƿ�Ϊ����������ǣ��Ѹ�����������negative��1
           if(n<0)
           negative++;
           if(n==0)
           continue;         
           
           // ���Ĳ�����while���ж�������������ֵ����һ��ֵΪ%ʱ����ֹѭ��
        } 
           // ���岽����������͸��������������ʽ��Ԥ�����
        System.out.printf("��������Ϊ��%d����������Ϊ��%d",positive,negative);
       


	}

}
