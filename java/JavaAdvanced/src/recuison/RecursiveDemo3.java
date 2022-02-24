package recuison;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-24
 * Time: 18:29
 */
//猴子吃桃子
public class RecursiveDemo3 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入天数：");
            int day =sc.nextInt();
            int peachValue=getPeach(day);
            System.out.println(peachValue);
        }

    }

    public  static int getPeach(int day){
        if(day==10){
            return  1;
        }else{
            return  2*getPeach(day+1)+2;
        }
    }


}
