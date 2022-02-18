package com.ssg_1;

public class SparseArr {
    public static void main(String[] args) {
    // 创建二维数组11*11
    //0，表示没有棋子，1表示 黑子 2表示蓝子
        int chessArr[][]=new int[11][11];
        chessArr[1][2]=1;
        chessArr[2][3]=2;
        //遍历二维数组
        for (int[] row:chessArr) {
        for(int date:row) {
            System.out.printf("%d\t",date);

        }
            System.out.println("\n");
        }

        //计算非0数值
        int sum=0;
        for(int i=0;i<chessArr.length;i++){
            for(int j=0;j<chessArr[0].length;j++){
               if(chessArr[i][j]!=0){
                   sum++;
               }
            }
        }
        System.out.println("sum="+sum);
        //创建稀疏数组
        int SparseArr[][]=new int[sum+1][3];
        //给稀疏数组第一行赋值
        SparseArr[0][0]=11;
        SparseArr[0][1]=11;
        SparseArr[0][2]=3;
        //将二维数组的值注入稀疏数组
        int count=0;
        for (int i = 0; i < 11; i++) {
            for (int j= 0;j<11;j++){
                if (chessArr[i][j] != 0) {
                count++;
                SparseArr[count][0]=i;
                SparseArr[count][1]=j;
                SparseArr[count][2]=chessArr[i][j];
                }
            }
        }

    //打印稀疏数组
        System.out.println();
        System.out.println("稀疏数组");
        for (int i = 0; i <SparseArr.length ; i++) {
            System.out.println(SparseArr[i][0]+"\t"+SparseArr[i][1] + "\t"+SparseArr[i][2] + "\n");

        }

        //将稀疏数组的值还原给二维数组
        int chessArr2[][]=new int[SparseArr[0][0]][SparseArr[0][1]];
        for (int i = 1; i < SparseArr.length; i++) {
           chessArr2[SparseArr[i][0]][SparseArr[i][1]]=SparseArr[i][2];
        }

        System.out.println();
        System.out.println("恢复后的二维数组");
        for (int[] row : chessArr2) {
            for(int date: row){
                System.out.printf("\t"+date);
            }
            System.out.println();
        }
    }
}
