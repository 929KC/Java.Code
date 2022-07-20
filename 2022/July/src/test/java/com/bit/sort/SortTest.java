package com.bit.sort;

import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

import static com.bit.sort.SortUtils.*;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-07-17 07:56
 */

public class SortTest {
    @Test
    public void testInsertSort(){
        int [] array = {2,4,6,8,3,9,10,15,17};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void testBulletSort(){
        int [] array = {12,4,100,8,3,9,10,15,17};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void testCountSort(){
        int [] array=new int[]{1,5,4,6,0,3};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testShellSort(){
        int [] array=new int[]{1,5,4,6,0,3};
        for(int i=0;i<array.length;i++){
            shellSort(array,i/2);
        }
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testSelectSort1(){
        int [] array=new int[]{1,5,4,6,0,3};
        selectOneSort(array);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void testSelectSort2(){
        int [] array=new int[]{18,3,10,2,7};
        selectTwoSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testQuickSort(){
        int [] array=new int[]{18,3,10,2,7,45,47,89,20};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testHoleQuickSort(){
        int [] array=new int[]{18,3,10,2,7,45,47,89,20};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testPointerQuickSort(){
//        int [] array=new int[10_00000];
//        randomNum(array);
        int [] array={12,45,78,89,56,231,0,23};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void randomNum(int [] array){
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            array[i] = rand.nextInt(10_00000);
        }
    }

    public static void traverseArray(int [] array){
        for (int i =0;i<array.length;i++){
            array[i]=i;
        }
    }

    /**
     * 非递归
     */
    @Test
    public void testHoleQuick2Sort(){
        int [] array=new int[]{18,3,10,2,7,45,47,89,20};
        quickSort2(array);
        System.out.println(Arrays.toString(array));
    }

}
