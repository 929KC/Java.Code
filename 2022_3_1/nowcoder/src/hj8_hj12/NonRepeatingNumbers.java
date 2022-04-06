package hj8_hj12;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-06
 * Time: 14:13
 */
public class NonRepeatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        char[] arr = (num + "").toCharArray();
       String s="";
       for(int i=arr.length-1;i>=0;i--){
           if(!s.contains(arr[i] +"")){
               s+=arr[i];
           }
        }
        System.out.println("去重后："+Integer.valueOf(s));
    }
}
