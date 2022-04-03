package task8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-03
 * Time: 10:40
 */
public class Student implements Comparable<Student>{
    private String name;
    private String sex;
    private  int score;
    public  static String orderBy="name";

    public Student() {
    }

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static String getOrderBy() {
        return orderBy;
    }

    public static void setOrderBy(String orderBy) {
        Student.orderBy = orderBy;
    }

    @Override
    public int compareTo(Student o) {
       int n=0;
       if(orderBy.equals("sex")){
           n=this.sex.compareTo(o.sex);
       }else if(orderBy.equals("score")){
           n=this.score-o.score;
       }else{
           n=this.name.compareTo(o.name);
           //
       }
       return n;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}
