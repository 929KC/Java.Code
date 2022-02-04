package singleInstance;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-04
 * Time: 10:09
 */
public class Text1 {
    public static void main(String[] args) {
        SingleInstance1 s1=SingleInstance1.Instance;
        SingleInstance1 s2=SingleInstance1.Instance;
        SingleInstance1 s3=SingleInstance1.Instance;
        System.out.println(s3 == s1);

    }
}
