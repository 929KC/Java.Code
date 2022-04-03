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
 * Time: 21:54
 */
public class Text2 {
    public static void main(String[] args) {
        ArrayList lines = new ArrayList();
        lines.add(12);
        lines.add(45);
        lines.add(78);
        lines.add(89);
        lines.add(23);
        lines.add(10);
        lines.add(30);
        lines.sort(Comparator.naturalOrder());
        System.out.println(lines);

    }

}
