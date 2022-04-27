package task1;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-27 20:00
 */

public class Demo15 {
    public static void main(String[] args) {
     int count=0;
       for(int i=1;i<=100;i++){
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
}
