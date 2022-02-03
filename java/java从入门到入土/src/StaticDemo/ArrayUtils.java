package StaticDemo;

import java.util.ArrayList;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-03
 * Time: 9:28
 */
public class ArrayUtils {
    private  ArrayUtils(){

    }

    public static  String toString(int [] arr){
        if(arr!=null){
            String result="[";
            for (int i=0;i<arr.length; i++){
                result+=(i==arr.length-1 ? arr[i] : arr[i]+",");
            }
            result+="]";
            return result;
        }else{
            return  null;
        }

    }

    public static  double getAverage(int [] arr){
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for  ( int i = 0; i < arr.length; i++){
           if(arr[i]>max){
               max=arr[i];
               sum+=arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }
        }
        return (sum-max-min)*1.0/(arr.length - 2);
    }
}
