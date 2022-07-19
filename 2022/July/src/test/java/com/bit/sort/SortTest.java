package com.bit.sort;

import org.junit.Test;
import java.util.Arrays;
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
    public void testSelectSort(){
        int [] array=new int[]{1,5,4,6,0,3};
        selectOneSort(array);
        System.out.println(Arrays.toString(array));
    }
}
