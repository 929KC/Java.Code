package hi13_hij20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-07
 * Time: 7:50
 */
public class SentencesReverse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        String [] arr=s.split(" ");
        for (int i=arr.length-1;i>=0;i--) {
            if(i!=0){
                System.out.print((arr[i] + " "));
            }else{
                System.out.print(arr[i]);
            }
        }
    }

}
