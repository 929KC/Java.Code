package task1;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 21:25
 */

public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
