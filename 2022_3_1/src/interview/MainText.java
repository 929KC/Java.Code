package interview;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-15
 * Time: 21:53
 */
public class MainText {
    public static void main(String[] args) {
        if(args==null||args.length!=2)
                return ;
        String user = args[0];
        String age=args[1];
        System.out.println("user"+user+"is"+age+"years old");
    }
}
