package HuaWeiTryMachineText3;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-26
 * Time: 16:30
 */
public class ArrayRoundom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        int arr[]=new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       Arrays.sort(arr);

        System.out.println(arr[0]);
        for(int i=1;i<num;i++){
            if(arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
            }
        }

    }



}
