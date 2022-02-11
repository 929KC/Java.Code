package setDemo;

import java.util.HashSet;
import java.util.Set;


/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-11
 * Time: 22:21
 */
public class SetDemo3 {
    public static void main(String[] args) {
        Set<Student> sets=new HashSet<>();
        Student s1=new Student("叶秋涵","女",19);
        Student s2=new Student("叶秋涵","女",19);
        Student s3=new Student("叶子秋","男",19);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);
    }
}
