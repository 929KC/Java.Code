package ArrayDemo;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-09
 * Time: 20:14
 */
public class LambdaDemo {
    public static void main(String[] args) {
    Swimming s= ()-> System.out.println("老师游泳游的很厉害");
    go(s);
    }

    public static void go(Swimming s){
        System.out.println("游泳开始");
        s.swim();
        System.out.println("游接结束");
    }

    interface  Swimming{ void swim();
    }
}

