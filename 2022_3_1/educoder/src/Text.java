import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author ：KC萧寒
 * Date: 2022-03-01
 * Time: 22:05
 */
public class Text {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList();
         l.add(98);
        l.add(77);
        l.add(66);
        l.add(79);
        l.add(50);
        l.add(100);

        for (int i = l.size()-1; i >=0 ; i--) {
           if(l.get(i)<80){
               l.remove(i);
           }
            System.out.println(l);
        }

    }
}
