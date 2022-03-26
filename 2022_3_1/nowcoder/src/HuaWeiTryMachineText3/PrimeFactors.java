package HuaWeiTryMachineText3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-26
 * Time: 20:53
 */
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        long num=sc.nextLong();
        long k=(long)Math.sqrt(num);

        for(long i=2;i<=k;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
        }
        System.out.println(num==1? "":num+" ");
    }
}
