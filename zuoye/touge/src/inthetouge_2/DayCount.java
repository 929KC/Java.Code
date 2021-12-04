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
        int sumDays=0;//对应的总天数

        //2、判断是否为闰年并且月份大于2   若是总天数多一天
        if((year%4==0&&year%100!=0||year%400==0)&&month>2){
            sumDays=1;//将闰年的二月份多出的一天加上
        }

        //3、加上之前几个月的天数
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

        //4、加上当月对应的天数
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
        	   System.out.println("你输的有误");
         }
           System.out.println("It is the "+sumDays+"th"+day);
         //黄茂荣
		/********** End *********/
	}
}
