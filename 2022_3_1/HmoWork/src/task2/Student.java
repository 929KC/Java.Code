package task2;

public class Student extends Person {
    private String studentNumber;
    private String school;

    public Student() {

    }

    public Student(String studentNumber, String school) {
        super("叶秋涵","女",19,"China");
        this.studentNumber = studentNumber;
        this.school = school;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void work(){
        System.out.println("好好学习，天天向上！");
    }

}
