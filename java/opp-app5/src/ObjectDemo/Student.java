package ObjectDemo;

import java.util.Objects;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-07
 * Time: 23:05
 */
public class Student {
    private  String name;
    private  String sex;
    private int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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
//        @Override
//    public String toString (){
//        return "{"+ "姓名"+name + ","+"性别"+sex + ","+"年龄"+age+"}";
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    //    @Override
//    public   boolean equals(Object o){
//        if (o instanceof Student){
//            Student s2=(Student) o;
//            if (this.name.equals(s2)&&this.sex.equals(s2)&&this.age==s2.age) {
//                return  true;
//            }else{
//                return false;
//            }
//        }else{
//            return false;
//        }
//  }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

}
