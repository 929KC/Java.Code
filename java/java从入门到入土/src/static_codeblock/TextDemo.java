package static_codeblock;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-03
 * Time: 11:02
 */
public class TextDemo {

        private  String name;
    /**
     属于对象的，与对象一起加载，自动触发执行。
     */
    {
        System.out.println("==构造代码块被触发执行一次==");
        name = "张麻子";
    }

    public TextDemo (){
        System.out.println("==构造器被触发执行==");
    }

    public static void main(String[] args) {
        TextDemo t1=new TextDemo();
        System.out.println(t1.name);
        TextDemo  t2=new TextDemo ();
        System.out.println(t2.name);
    }
}
