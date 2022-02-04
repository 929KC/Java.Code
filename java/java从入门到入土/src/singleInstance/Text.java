package singleInstance;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-04
 * Time: 10:08
 */
public class Text {
    public static void main(String[] args) {
        SingleInstance s1=SingleInstance.Instance;
        SingleInstance s2=SingleInstance.Instance;
        SingleInstance s3=SingleInstance.Instance;
        SingleInstance s4=SingleInstance.Instance;
        System.out.println(s4 == s1);
    }


}
