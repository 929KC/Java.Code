package reflect;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-13
 * Time: 14:49
 */
public class PersonText2 {
    public static void main(String[] args) throws Exception {
        //
        Class personClass = Person.class;
        //1.Field[] getFileds()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-----------");
        //2.Filed getFiled(String name);根据指定的字符串去获取成员变量的对象
        Field school = personClass.getField("school");
        //获取成员变量school的值
        Person p = new Person();
        Object value = school.get(p);
        System.out.println(value);
        school.set(p, "B站大学");
        System.out.println(p);

        System.out.println("-------------");
        //获取所有的成员变量，不考虑修饰符
        Field[] fileds2 = personClass.getDeclaredFields();
        for (Field field : fileds2) {
            System.out.println(field);
        }

        Field age = personClass.getDeclaredField("age");
        age.setAccessible(true);
        Object value2 = age.get(p);

        System.out.println(value2);
    }
}
