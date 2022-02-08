package MathDemo;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 11:19
 */
public class MathAPi {
    public static void main(String[] args) {
        int abs=Math.abs(-324);
        System.out.println(abs);
        int abs2=Math.abs(90);
        System.out.println(abs2);
        //向上取整
        double ceil=Math.ceil(3.78);
        System.out.println(ceil);
        //向下取整
        double floor=Math.floor(3.75);
        System.out.println(floor);
        //四舍五入
        int round= (int) Math.round(7.5);
        System.out.println(round);
        //获得两个int值中的较大的值
        int max=Math.max(12,45);
        //返回a的b次幂的值
        double pow=Math.pow(2,3);
        System.out.println(pow);
        int random=(int)Math.random()*6+3;
        System.out.println(random);

    }
}
