package task8;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-03
 * Time: 22:27
 */
public class AppleDemo {
    public static void main(String[] args) {
        ArrayList<Apple>apples = new ArrayList();
        apples.add(new Apple("红富士", "红色", 9.9, 100));
        apples.add(new Apple("青苹果", "绿色", 15.9, 200));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 900));
        System.out.println(apples);
        System.out.println("******");
        ArrayList linst = new ArrayList();
        linst.add(12);
        linst.add(45);
        linst.add(78);
        linst.add(89);
        linst.add(23);
        linst.add(10);
        linst.add(30);
        apples.sort(Comparator.naturalOrder());
        System.out.println(linst);
    }
}
