package task2;

public class Person {
    private String name;
    private String sex;
    private int age;
    private String nationality;

    public Person() {

    }

    public Person(String name, String sex, int age,
                  String nationality) {
        System.out.println("我是："+name+","+"性别："+sex+"," +
                ""+"年龄："+age+"岁"+"国籍："+nationality);
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat() {

        System.out.println("人类吃饭");
    }

    public void sleep() {
        System.out.println("人类睡觉");
    }

    public void work() {
        System.out.println("人类工作");
    }
}
