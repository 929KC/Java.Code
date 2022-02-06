package polymorphic_text;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-06
 * Time: 21:11
 */
public class Text {
    public static void main(String[] args) {
        Computer c=new Computer("外星人");
        c.star();
        USB u=new Mouse("罗技");
        c.installUSB(u);
        USB k=new KeyBoard("虞美人");
        c.installUSB(k);
    }
}
