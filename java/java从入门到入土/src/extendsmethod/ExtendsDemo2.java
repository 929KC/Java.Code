package extendsmethod;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-04
 * Time: 22:24
 */
public class ExtendsDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.run(); // 子类的
        System.out.println("-----------");
        s.go();
    }
}

class People{
    public void run(){
        System.out.println("可以跑~~");
    }
}

class Student extends People{
    public void run(){
        System.out.println("学生跑的贼快~~");
    }

    public void go(){
        run(); // 子类的
        super.run(); // 父类的
    }
}
