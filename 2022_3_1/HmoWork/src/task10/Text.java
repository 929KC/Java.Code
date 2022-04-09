package task10;

import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeMap map=new EmployeeMap();
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
                 map.addEmployee(new Employee("叶秋涵",19,90000,"001","女"));
                 map.addEmployee(new Employee("叶子秋",15,100000,"002","男"));
                 map.addEmployee(new Employee("黄茂荣",13,40000,"003","男"));
                 map.addEmployee(new Employee("黄茂云",43,9440000,"004","男"));
                 map.showAllEmployee();
                 break;
             case 2:
                map.showAllEmployee();
                 break;
             case 3:
                 System.out.println("请输入你要查找的id:");
                 String id=sc.next();
                 Employee em=map.getEmployee(id);
                 if(em==null){
                     System.out.println("没有查找到雇员信息");
                 }else{
                     System.out.println(em);
                 }
                 break;
             case 4:
                  map.updateEmployee(new Employee("杨玉环",2000,9440000,"005","女"));
                  map.showAllEmployee();
                 break;
             case 5:
                 System.out.println("请输入你要删除员工的id:");
                 String id2=sc.next();
                 Employee em2=map.deleteEmployee(id2);
                 if(em2==null){
                     System.out.println("没有你要删除的雇员信息");
                 }else{
                     System.out.println(em2);
                 }
                 break;
             case 6:
            map.sortBySalary();
                 break;
             case 7:
                System.exit(0);
                 break;
             default :
                 System.out.println("没有此选择,感谢使用");
         }
        }
    }
}
