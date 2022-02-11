package genericity;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-11
 * Time: 14:30
 */
public class GenericDemo {
    public static void main(String[] args) {
        String [] name={"叶秋涵","叶子秋","赵敏"};
        printArray(name);
    }

    public static <T> T[] getArr(T[] arr){
        return arr;
    }

    public static <T> void  printArray(T [] arr){
        if(arr!=null){
            StringBuilder sb=new StringBuilder("[");
           for (int i=0;i<arr.length; i++){
               sb.append(arr[i]).append(i==arr.length - 1 ?"":",");
           }
           sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }

    }


}
