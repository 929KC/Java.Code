package task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-03
 * Time: 10:43
 */
public class StudentManage {
    ArrayList<Student> list = new ArrayList<>();
    Random r = new Random();
    public void StudentMange() {
        for (int i = 1; i <= 10; i++) {
            String sex = "男";
            if (i % 2 == 0) {
                sex = "女";
            }
            int score = r.nextInt(100 - 1 + 1) + 1;
            list.add(new Student("张" + i, sex, score));
        }
    }

    public int getAvg() {
        int avg = 0;
        int sum = 0;
        int count = list.size();
        for (Student s : list) {
            sum +=s.getScore();
        }
        return avg = sum / count;
    }

    public void show() {
        list.sort(Comparator.naturalOrder());
        for (Student s : list) {
            System.out.println(s);
        }
    }

}
