package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 15:42
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
       //格式化日期
       SimpleDateFormat sdf=new SimpleDateFormat("yyy年MM月dd日 HH：mm:ss EEE a");
        String rs=sdf.format(d);
        System.out.println(rs);
        System.out.println("*********");
        long time = System.currentTimeMillis()+121*1000;
        String rs2=sdf.format(time);
        System.out.println(rs2);

    }
}
