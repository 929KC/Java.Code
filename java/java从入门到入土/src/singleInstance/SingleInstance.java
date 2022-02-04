package singleInstance;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-04
 * Time: 10:10
 */
/**
 目标：学会使用恶汉单例模式设计单例类
 */
public class SingleInstance {


    /**
     static修饰的成员变量，静态成员变量，加载一次，只有一份
     */
    public static SingleInstance Instance=new SingleInstance();


    /**
     1、必须私有构造器：私有构造器对外不能被访问。
     */
    private  SingleInstance(){

    }
}
