package ArrayDemo;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-09
 * Time: 16:56
 */
public class Student {
    private String name;
    private int age;
    private double height;

    public Student() {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
