package AnnoDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-14
 * Time: 9:32
 */

public @interface Anno {
    String name();

    int age();

    String[] num();

    Person enum_1();

    Ann02 ann2();

}
