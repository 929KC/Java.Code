package StringBulid;



/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 10:26
 */
public class StringBuildApi {
    public static void main(String[] args) {
        StringBuilder  s=new StringBuilder();
        s.append("叶秋涵");
        s.append("叶子秋");
        s.append("我爱你").append("猪").append("玩笑");
        System.out.println(s);
        s.reverse().append("你是猪");
        System.out.println(s);

    }
}
