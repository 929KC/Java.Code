package task8;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-03
 * Time: 11:57
 */
public class EmployeeList {
    public ArrayList<Employee> list;

    public EmployeeList() {
        list = new ArrayList();
    }

    //添加成员
    public boolean addEmployee(Employee employee) {
        return list.add(employee);
    }

    public Employee getEmployee(String id) {
        Employee emp = null;
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                index = i;
                break;
            }

        }
        if (index != -1) {
            emp = list.get(index);
        } else {
            System.out.println("查无此人");
        }
        return emp;
    }

    //删除员工
    public Employee delete(String id) {
        Employee emp = null;
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            emp = list.remove(index);
        } else {
            System.out.println("查无此人");
        }
        return emp;
    }

    //替换员工
    public Employee setEmployee(String id, Employee e){
        Employee emp=null;
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                index=i;
                break;
            }
        }

        if(index!=-1){
            emp=list.set(index,e);
        }else{
            System.out.println("没有可以替换的员工");
        }
        return emp;
    }
    public void showEmployee(){
        for(Employee e :list){
            System.out.println(e);
        }
    }

    public void sortByAge(){
        list.sort(Comparator.naturalOrder());
    }
}
