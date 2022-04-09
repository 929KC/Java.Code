package task10;


public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int  salary;
    private String id;
    private  String sex;

    public Employee() {
    }

    public Employee(String name, int age, int  salary, String id, String sex) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.sex = sex;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (this.salary-o.salary);
    }
}
