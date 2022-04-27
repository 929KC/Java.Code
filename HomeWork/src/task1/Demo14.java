package task1;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 18:59
 */

public class Demo14 {
    public static void main(String[] args) {
        for (int i = 1; i < 999; i++) {
            int tmp = i;
            int count = 0;
            while (tmp != 0) {
                count++;
                tmp = tmp / 10;
            }
            tmp=i;
            int sum=0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp = tmp / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }

        }
    }
}
