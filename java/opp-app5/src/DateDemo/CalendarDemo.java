package DateDemo;

import sun.util.resources.cldr.sq.CalendarData_sq_AL;

import java.util.Calendar;
import java.util.Date;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 15:23
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar  cal= Calendar.getInstance();
        System.out.println(cal);
        int year=cal.get(Calendar.YEAR);
        System.out.println(year);
        int month=cal.get(Calendar.MONTH)+1;
        System.out.println(month);
        int days=cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        System.out.println("------------");
         cal.add(Calendar.DAY_OF_YEAR,60);
        cal.add(Calendar.MONTH,2);
       Date d=cal.getTime();//修改后日历的信息
        System.out.println(d);

        long time=cal.getTimeInMillis();
        System.out.println((((time/1000)/60)/24)/365
        );
    }
}
