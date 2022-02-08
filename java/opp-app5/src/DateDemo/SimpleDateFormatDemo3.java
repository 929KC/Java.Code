package DateDemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 16:06
 */
public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        //1.开始时间
        String star="2021-11-11 00:00:00";
        String  end="2021-11-11 00:10:00";
        String xiaoJia="2021-11-11 00:03:47";
        String xiaoPi="2021-11-11 00:10:11";
        //解析时间
        SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(star);
        Date d2=sdf.parse(end);
        Date d3= sdf.parse(xiaoJia);
        Date d4=sdf.parse(xiaoPi);
      if (d3.after(d1)&&d3.before(d2)){
          System.out.println("秒杀成功");
      }else{
          System.out.println("秒杀失败");
      }
    if(d4.after(d1)&&d4.before(d2)){
        System.out.println("秒杀成功");
    }else{
        System.out.println("秒杀失败");
    }




    }
}
