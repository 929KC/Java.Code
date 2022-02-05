package estends_constructor;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-05
 * Time: 16:26
 */
public class Cat extends  Animal{
    public Cat(){
        super();
        System.out.println("子类无参");
    }

    public  Cat(String n){
        super();
        System.out.println("子类有参构造");
    }
}
