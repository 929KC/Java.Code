package task8;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 * @Author ：KC萧寒
 * Date: 2022-04-03
 * Time: 12:01
 */
public class EmployeeText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList emp = new EmployeeList();
        emp.addEmployee(new Employee("001", "黄茂荣", "男", 20, 10000));
        emp.addEmployee(new Employee("002", "黄茂云", "男", 20, 20000));
        emp.addEmployee(new Employee("003", "叶子秋", "男", 19, 30000));
        emp.addEmployee(new Employee("004", "叶秋涵", "女", 18, 40000));
        while (true) {
            System.out.println("**********");
            System.out.println("雇员管理系统");
            System.out.println("1,添加雇员");
            System.out.println("2,显示所有雇员信息");
            System.out.println("3,根据id查找雇员");
            System.out.println("4,修改雇员信息");
            System.out.println("5,根据id删除雇员");
            System.out.println("6,排序");
            System.out.println("7,退出");
            System.out.println("**********");
            System.out.println("请输入你的选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    System.out.println("添加雇员：");
                    emp.addEmployee(new Employee("005","新人","男",20,12121));
                    break;
                case 2:
                    emp.showEmployee();
                    break;
                case 3:
                    String id="003";
                    Employee el=emp.getEmployee(id);
                    System.out.println(el);
                    break;
                case 4:
                    String id2="004";
                    Employee emp2=emp.setEmployee(id2,new Employee("003,","杨玉环","女",20,2412));
                    System.out.println(emp2);
                    break;
                case 5:
                    String id3="003";
                    Employee emp3=emp.delete(id3);
                    System.out.println(emp3);
                    break;
                case 6:
                    emp.sortByAge();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("没有此选项");
                    break;
            }
        }
    }
}
