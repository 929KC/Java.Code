package homework;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-21
 * Time: 22:23
 */
public class MyMultiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            }
            System.out.println();
        }
    }
}
