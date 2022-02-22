package HomeWork2;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-22
 * Time: 20:17
 */
public class text {
    public static void main(String[] args) {
        double page = 0.5/1000;
        double height = 8844.43;
        int count = 0;
        while (page<height) {
            page *= 2;
            count++;
        }
        System.out.println("折叠次数"+count);
    }
}
