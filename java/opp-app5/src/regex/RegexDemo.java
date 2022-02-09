package regex;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-09
 * Time: 11:10
 */
public class RegexDemo {
    public static void main(String[] args) {
            String qq="3076675259";
        System.out.println(checkQQ(qq));
        System.out.println(checkQQ2(qq));
    }

    public static  boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        if (qq == null||qq.length()<6||qq.length() >20){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch=qq.charAt(i);
            if(ch<'0'&&ch>'9'){
                return false;
            }
        }
        return true;
    }
}
