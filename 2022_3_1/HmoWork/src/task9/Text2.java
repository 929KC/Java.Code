package task9;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-04
 * Time: 14:34
 */
public class Text2 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        Student2[] students = new Student2[3];
        students[0] = new Student2("吴磊",23 , 175.5);
        students[1] = new Student2("谢鑫",18 , 185.5);
        students[2] = new Student2("王亮",20 , 195.5);

       Arrays.sort(students, (Student2 o1, Student2 o2)-> Double.compare(o1.getHeight(),o1.getHeight())   );

        System.out.println(Arrays.toString(students));
    }
}
