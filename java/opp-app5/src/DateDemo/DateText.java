package DateDemo;


import java.util.Date;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 14:16
 */
public class DateText {
    public static void main(String[] args) {
//        Date d=new Date();
//        System.out.println(d);
//        long time=System.currentTimeMillis();
//        System.out.println(time);
//        Date d2=new Date(time);
//        System.out.println(d2);

        Date d=new Date();
        System.out.println(d);
        long time=System.currentTimeMillis();
        time+=(60*60+121)*1000;
        Date d2=new Date(time);
        System.out.println(d2);
        Date d3=new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
