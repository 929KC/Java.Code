package DateDemo;

import sun.nio.ch.sctp.SctpChannelImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 15:48
 */
public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String str="2021年08月06日 11:11:11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
        Date d=sdf.parse(str);
        System.out.println(d);
        long time=d.getTime()+(2L*24*60*60+14*60*60+49*60+6)*1000;
        String s=sdf.format(time);
        System.out.println(s);
    }
}
