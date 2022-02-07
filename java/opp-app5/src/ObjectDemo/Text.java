package ObjectDemo;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-07
 * Time: 23:05
 */
public class Text {
    public static void main(String[] args) {
        Swimming s=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };
        go(s);

        System.out.println("*************");
        Swimming s2=new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳");
            }
        };
        go(s2);

        System.out.println("************");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        });
    }

    public static  void go(Swimming s) {
        System.out.println("开始游泳");
        s.swim();
        System.out.println("结束游泳");
    }

    interface Swimming{
        void swim();
    }
}
