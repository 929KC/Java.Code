package task7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time1(sc);
    }

    public static void time1(Scanner sc) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("欢迎使用时间的换算系统：");
        System.out.print("请输入开始时间：");
        String begin = sc.nextLine();
        System.out.print("请输入结束时间：");
        String end = sc.nextLine();

        try {
            Date date1 = sdf.parse(begin);
            Date date2 = sdf.parse(end);
            long time1 = date1.getTime();
            long time2 = date2.getTime();
            long days=(time2-time1)/1000/60/60/24;
            long hours=(time2-time1)/1000/60/60-days*24;
            long minuts=(time2-time1)/1000/60-(days*24+hours)*60;
            long seconds=((time2-time1)/1000)%60;
            System.out.println("您输入的日期差："+days+"天"+hours+"小时"+minuts+"分"+seconds+"秒");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
