package params;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-15
 * Time: 15:25
 */
public class MethodDemo {
    public static void main(String[] args) {
           
            sum(54,42,45);
    }

    public static void sum(int age,int... nums){
        System.out.println(age);
        System.out.println(Arrays.toString(nums));
    }
}
