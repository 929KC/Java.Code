package task3;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 15:29
 */

public class Demo {
    public static void main(String[] args) {
        print(3);
    }
    public static void print(int n){
        if(n==1){
            return ;
        }//正常递归
        print(n-1);//死递归
    }

}
