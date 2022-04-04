package task9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-04
 * Time: 9:19
 */
public class StudentSystem {
    private HashMap<String, Student> stuMap;

    public StudentSystem() {
        stuMap = new HashMap<>();
    }


    public void addStudent(Student st) {
        stuMap.put(st.getId(), st);
    }

    public Student deleeStudent(String id) {
       Student st=stuMap.remove(id);
       return st;

    }
    public Student updataStudent(Student st) {
        Student us=stuMap.put(st.getId(),st);
        return st;
    }
    public void showStudent() {
        //1.获取stuMap中所有的key
        Set<String> allkey = stuMap.keySet();
        //遍历所有的key
        Iterator<String> it = allkey.iterator();
        while (it.hasNext()) {
            String next = it.next();
            //3.输出相应的值
            Student stu = stuMap.get(next);
            System.out.println(stu);
        }

    }
}
