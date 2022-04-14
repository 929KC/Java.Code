package reflect;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @author ：KC萧寒
 * Date: 2022-04-13
 * Time: 14:22
 */
public class Person {
   private String name;
    private int age;
    public String school;
    public int id;


    public Person() {
    }

    /**
     *
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", id=" + id +
                '}';
    }


    public void  eat() {
        System.out.println("吃饭~~~");
    }

    /**
     *
     * @param food
     */
    public void  eat(String food) {
        System.out.println("吃饭~~~"+food);
    }
}
