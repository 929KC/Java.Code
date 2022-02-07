package ObjectDemo;

import java.util.Objects;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-07
 * Time: 23:05
 */
public class Text2 {
    public static void main(String[] args) {
        Student s=new Student("叶秋寒","女",19);
        Student s2=new Student("叶秋寒","女",19);
        System.out.println(s.toString());
        System.out.println(s);
        System.out.println("***************");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println("************");
        String name="叶秋涵";
        String name2="叶子秋";
        System.out.println(name.equals(name2));
        System.out.println("**********");
        String name3=null;
        String name4="叶子秋";
        //System.out.println(name3.equals(name4));
        System.out.println(Objects.equals(name3,name4));
    }

}
