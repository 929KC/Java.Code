package StringBulid;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-08
 * Time: 10:32
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        int arr []={};
        System.out.println(toString(arr));
        int arr2[]=null;
        System.out.println(toString(arr2));
        int arr3[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(toString(arr3));

    }

    public static String toString(int [] arr){
        if (arr!=null){
         StringBuilder s=new StringBuilder("[");
       for (int i = 0; i < arr.length; i++) {
           s.append(arr[i] ).append(i == arr.length - 1 ? "" : ", ");
       }
            s.append("]");
            return s.toString();
        }else{
            return  null;
        }

    }
}
