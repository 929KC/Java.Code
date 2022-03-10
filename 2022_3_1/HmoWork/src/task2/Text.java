package task2;
public class Text {
    public static void main(String[] args) {
        Student s=new Student("07",
                "哔哩哔哩大学");
        System.out.println("学校："+s.getSchool()+"," +
                ""+"学号："+s.getStudentNumber());
        System.out.println("*****-------****");
        Worker w=new Worker("腾讯",5);
        System.out.println("所在公司："+w.getCompany()+"," +
                ""+"工龄："+w.getWorkAge()+"年。");
        w.work();
        System.out.println("*****-------****");
        StudentLeader s2=new StudentLeader("学生会主席");
        s2.meeting();
    }
}
