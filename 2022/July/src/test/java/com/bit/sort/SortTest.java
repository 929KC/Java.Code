package com.bit.sort;

import org.junit.Test;


import java.util.Arrays;

import static com.bit.sort.SortUtils.BubbleSort;
import static com.bit.sort.SortUtils.insertSort;

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
        int [] array = {2,4,6,8,3,9,10,15,17};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
