package task9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-04
 * Time: 9:19
 */
public class Text {
    public static void main(String[] args) {
        StudentSystem ss = new StudentSystem();
        Student s1 = new Student("黄茂荣", "12", "07");
        Student s2 = new Student("叶秋涵", "54", "08");
        Student s3 = new Student("叶子秋", "10", "09");
        Student s4= new Student("黄茂云", "50", "10");
        ss.addStudent(s1);
        ss.addStudent(s2);
        ss.addStudent(s3);
        ss.showStudent();
        ss.deleeStudent("07");
        System.out.println("*********");
        ss.showStudent();
        System.out.println("*********");
        ss.updataStudent(s4);
        ss.showStudent();
    }
}
