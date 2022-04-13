package reflect;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-13
 * Time: 14:24
 */
public class PersonText {
    public static void main(String[] args) throws ClassNotFoundException {
        //反射三种方式
        //方式一
        Class c1 = Class.forName("reflect.Person");
        //方式二
        Class c2=Person.class;
        //方式三
        Person p =new Person();
        Class c3=p.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
