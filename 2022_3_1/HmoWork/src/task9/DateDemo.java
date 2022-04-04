package task9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-04
 * Time: 13:10
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        /*Date date = new Date();
        System.out.println(date);

        //返回从1970年1月1日的00:00:00走到此刻总的毫秒数
        long time = date.getTime();
        System.out.println(time);

        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data2 = sdf.format(time);//日期转字符串
        System.out.println(data2);
        String time2 = sdf.format(time);
        System.out.println(time2);
        Date date3 = new Date();

        String day = "2022-4-4 13:28:00";
        Date d1 = sdf.parse(day);
        System.out.println(d1);
        String time5 = sdf.format(d1);
        System.out.println(time5);


        //日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        long time7 = cal.getTimeInMillis();
        System.out.println(time7);
        String time0=sdf.format(time7);
        System.out.println(time0);
        Date date0=cal.getTime();
        System.out.println(sdf.format(date0));*/

      /*  LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());*/


       /* int a = 10;
        Integer b = a;
        System.out.println(Integer.toString(b));
        int d = Integer.parseInt((Integer.toString(b)));
        System.out.println(d);*/

       /* int arr []=new int[]{12,34,56,46,8,90};
        String  str= Arrays.toString(arr);
        System.out.println(str);
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.printf("%d ",i);
        }
*/
        int arr[]={12,34,56,46,8,90};
        Integer arr2[]={125,344,546,464,48,490};
        /**
         参数一：被排序的数组 必须是引用类型的元素
         参数二：匿名内部类对象，代表了一个比较器对象。
         */
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (Integer integer : arr2) {
            System.out.printf("%d ",integer);
        }
    }
}
