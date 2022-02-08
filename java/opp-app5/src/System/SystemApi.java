package System;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 11:40
 */
public class SystemApi {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//     //   System.exit(0);
//        System.out.println("你是猪");

        long time=System.currentTimeMillis();
        for(int i=0;i<1;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println((end - time)/1000.0);
    }
}
