package singleInstance;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-04
 * Time: 10:10
 */
public class SingleInstance1 {

    /**
     2、定义一个静态的成员变量用于存储一个对象，一开始不要初始化对象，因为人家是懒汉
     */
    public static   SingleInstance1 Instance=null;


    /**
     1、私有构造器啊
     */
    private SingleInstance1(){


    }


    /**
     3、提供一个方法暴露，真正调用这个方法的时候才创建一个单例对象
     */
    public  static  SingleInstance1 getInstance(){

        if (Instance==null){
            Instance=new SingleInstance1();
        }
        return Instance;
    }
}
