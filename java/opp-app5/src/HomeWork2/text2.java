package HomeWork2;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-22
 * Time: 22:04
 */
public class text2 {
    public static void main(String[] args) {
        int sum = 1000;
        while (sum > 0) {
            if (sum % 5 == 2 && sum % 7 == 3 && sum % 3 == 1) {
                System.out.println(sum);
                break;
            }
            sum++;
        }
    }

}

