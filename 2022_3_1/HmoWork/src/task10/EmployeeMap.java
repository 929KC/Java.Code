package task10;

import java.util.*;

public class EmployeeMap {
    private HashMap<String, Employee> map;

    public EmployeeMap() {
        map = new HashMap<>();
    }

    public void addEmployee(Employee em) {
        map.put(em.getId(), em);
    }

    public Employee getEmployee(String id) {
        Employee emp = map.get(id);
        return emp;
    }

    public Employee deleteEmployee(String id) {
        Employee em = map.remove(id);
        return em;
    }

    public void updateEmployee(Employee em) {
        String id = em.getId();
        Set<String> set = map.keySet();
        boolean flag = set.contains(id);
        if (flag) {
            map.put(em.getId(), em);
        } else {
            System.out.println("查无此人不能修改");
        }
    }

    public void showAllEmployee() {
        Collection<Employee> emp = map.values();
        Iterator<Employee> it = emp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void sortBySalary() {
        Collection<Employee> emp = map.values();
        ArrayList<Employee> list = new ArrayList();
        Iterator<Employee> it = emp.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
        list.sort(Comparator.naturalOrder());
        System.out.println("按薪水排序后：");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}
