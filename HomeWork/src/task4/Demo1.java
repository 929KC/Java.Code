package task4;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-01 10:01
 */

public class Demo1 {
    public static void main(String[] args) {
        print(3);
    }

    private static void print(int i) {
        if(i==1){
            return ;
        }
        i--;
        print(i);
    }
}
