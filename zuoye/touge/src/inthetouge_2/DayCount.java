package inthetouge_2;

import java.util.Scanner;

public class DayCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("please input year");
		int year=sc.nextInt();
		//System.out.println("please input month");
		int month=sc.nextInt();
		//System.out.println("please input day");
		int day=sc.nextInt();
		DayCount dy=new DayCount();
		dy.dayCount(year, month, day);

	}
	public void dayCount(int year, int month, int day) {
		/********** Begin *********/        
        int sumDays=0;//��Ӧ��������

        //2���ж��Ƿ�Ϊ���겢���·ݴ���2   ������������һ��
        if((year%4==0&&year%100!=0||year%400==0)&&month>2){
            sumDays=1;//������Ķ��·ݶ����һ�����
        }

        //3������֮ǰ�����µ�����
        for(int i=1;i<month;i++){
            switch(i){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    sumDays+=31;
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                    sumDays+=30;
                    break;
            case 2:sumDays+=28;
            }
        }

        //4�����ϵ��¶�Ӧ������
        sumDays+=day;
         switch(month) {
         
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
              day =31;
              break;
         case 4:     
         case 6:        
         case 9:     
         case 11: 
        	 day=30;
        	 break;
         case 2:
        	 if(year%4==0&&year%100!=0|| year%400==0) {
           	  day=29;
             }else {
           	  day=28;
             }
        	 break;
           default:
        	   System.out.println("���������");
         }
           System.out.println("It is the "+sumDays+"th"+day);
         //��ï��
		/********** End *********/
	}
}
