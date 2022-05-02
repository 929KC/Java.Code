package task4;

import java.util.Arrays;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-02 20:06
 */

public class Demo10 {
      public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6};
         int [] ret= copyArray(arr);
          System.out.println(Arrays.toString(ret));
      }

    public static int [] copyArray(int [] arr){
          int [] tmp=new int[arr.length];
          for(int i=0;i<arr.length;i++){
              tmp[i]=arr[i];
          }
          return tmp;
    }
}
