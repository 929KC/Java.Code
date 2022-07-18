package com.bit.sort;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-07-17 07:46
 */

public class SortUtils {
    /**
     * 直接插入排序
     * 时间复杂度:
     * 空间复杂度:
     * 稳定性:
     */
    public static void insertSort(int [] array){
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=i-1;
            for( ;j>=0;j--){
                if(tmp<array[j]){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;;
        }
    }

    /**
     * 希尔排序
     *  时间复杂度:
     * 空间复杂度:
     * 稳定性:
     */
    public static  void shellSort(int [] array,int gap){
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for(;j >= 0;j-=gap) {
                //加上等号 就是不稳定
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static  void BubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++) {
            boolean flag=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                   swap(array,j);
                   flag=true;
                }
            }
            if(!flag){
                return;
            }
        }

    }

    public static void swap(int [] array,int j){
            int tmp=array[j];
            array[j]=array[j+1];
            array[j+1]=tmp;
    }
}
