package task4;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-01 14:53
 */

public class Demo2 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            System.out.print(JumpFloor(i)+" ");
        }
    }
    public static int JumpFloor(int target){
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else {
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
}
