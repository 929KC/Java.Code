package task;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-29 21:35
 */

public class dfsDemo1 {
    public static void main(String[] args) {
    //迷宫问题
        int [] [] arr =new int[8][7];
        for(int i=0;i<7;i++){
            arr[0][i]=1;
            arr[7][i]=1;
         }
        for(int j=0;j<8;j++){
            arr[j][0]=1;
            arr[j][6]=1;
        }
        arr[3][1]=1;
        arr[3][2]=1;
        System.out.println("地图情况：");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean setWay(int [] [] arr,int i,int j){
        if(arr[6][5]==2){
            return true;
        }else{
            if(arr[i][j]==0){
                arr[i][j]=2;
                return true;
            }el
        }

    }

}
