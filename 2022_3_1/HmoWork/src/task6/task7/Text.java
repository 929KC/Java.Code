package task7;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-31
 * Time: 16:00
 */
public class Text {
    public static void main(String[] args) {
        BigDecimal bd = BigDecimal.valueOf(0.03);
        BigDecimal add = bd.add(new BigDecimal(0.9));
        System.out.println("加法："+add);
        BigDecimal sub = bd.subtract(new BigDecimal(0.9));
        System.out.println("减法："+sub);
        BigDecimal mul = bd.multiply(new BigDecimal(0.9));
        System.out.println("乘法："+mul);
        BigDecimal div = bd.divide(new BigDecimal(0.12));
        System.out.println("除法："+div);
        /*BigDecimal div2 = bd.divide(new BigDecimal(0.12));
        System.out.println("除法："+div2);*/
    }
}
