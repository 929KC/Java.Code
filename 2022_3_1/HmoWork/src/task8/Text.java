package task8;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-03
 * Time: 10:44
 */
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManage sm = new StudentManage();
        sm.StudentMange();
        while (true) {
            System.out.println("*************");
            System.out.println("*1(按名字排序)");
            System.out.println("*2(按性别排序)");
            System.out.println("*3(按分数排序)");
            System.out.println("*4(显示平均分)");
            System.out.println("请输入1,2,3,4");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    Student.orderBy = "name";
                    sm.show();
                    break;
                case 2:
                    Student.orderBy = "sex";
                    sm.show();
                    break;
                case 3:
                    Student.orderBy = "score";
                    sm.show();
                    break;
                case 4:
                    System.out.println("学生平均分：" + sm.getAvg());
                    break;
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }
}