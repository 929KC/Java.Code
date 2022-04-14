package reflect;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-14
 * Time: 7:35
 */
public class PersonText4 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        //获取指定的方法
        Method method1 = personClass.getMethod("eat");
        Person p=new Person();
        //执行方法
        method1.invoke(p);


        Method method2 = personClass.getMethod("eat",String.class);
        method2.invoke(p,"鱼");
        //获得所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(methods);
            System.out.println(method.getName());
        }
    }
}
