package reflect;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-14
 * Time: 7:23
 */
public class PersonText3 {
    public static void main(String[] args) throws Exception {
        //获取构personClass对象
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        //创建对象
        Object obj1 = constructor.newInstance("黄茂荣", 19);
        System.out.println(obj1);
        System.out.println("--------------");
        Constructor constructor2 = personClass.getConstructor();
        Object obj2 = constructor2.newInstance();
        System.out.println(obj2);
        System.out.println("--------------");
        //使用personClass的方法创建无参对象
        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
