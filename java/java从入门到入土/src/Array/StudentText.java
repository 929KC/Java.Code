package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentText {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();

        students.add(new Student("202104040207","叶秋涵",19,"软件二班"));
        students.add(new Student("202104040201","叶秋寒",14,"软件二班"));
        students.add(new Student("202104040202","叶子秋",11,"软件二班"));
        students.add(new Student("202104040203","黄茂荣",12,"软件二班"));

        System.out.println("学号\t\t名字\t\t年龄\t\t班级");
        for (int i = 0; i < students.size(); i++) {
        Student s=students.get(i);
        System.out.println(s.getStudyId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClass());
        }

        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你要查询的学生的学号：");
            String id=sc.next();
            Student s=getStudyId( students, id);
            if(s==null){
                System.out.println("查无此人！！！");
            }else{
                System.out.println("该学生的信息：");
                System.out.println(s.getStudyId()+"\t\t"+
                s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClassName());

            }
        }

    }

    public  static  Student getStudyId(ArrayList<Student> students,String studyId){

        for (int i = 0; i < students.size(); i++) {
           Student s=students.get(i);
            if (s.getStudyId().equals(studyId)){
                return s;
            }
        }
        return  null;
    }
}
