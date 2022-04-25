package com.bit.task1.task2;

import java.util.Random;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-24 07:36
 */

public class Demo {
    public static void main(String[] args) {
        int arr[][] =new int[10][10];
        Random rand = new Random();
        for(int i=0; i<arr.length; i++) {
            for(int j=0;j<arr[0].length;j++){
               arr[i][j]=rand.nextInt(11);
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
