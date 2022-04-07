package hi13_hij20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-07
 * Time: 7:15
 */
public class SentencesReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String [] s=new String[1000];
       while (!sc.hasNextLine()) {
           for (int i=0; i<s.length; i++){
            s[i]=sc.next();
           }
       }
        int left=s.length-1;
        int right=0;
       reverse(s,left,right);
       int index=0;
     for (int i=0;i<s.length;i++){
         if(s[i]==" "){
             reverse(s,index,i-1);
             index=i+1;
         }
     }

     for(int i=0;i<s.length;i++) {
         System.out.println(s[i]);
     }
    }

    private static void reverse(String [] s,int left,int right) {

        while (left<right){
            String tmp=s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
    }
}
