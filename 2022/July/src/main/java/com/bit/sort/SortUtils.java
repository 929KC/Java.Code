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

    /**
     * 冒泡排序
     * 时间复杂度:
     * 空间复杂度:
     * 稳定性:
     * @param array
     */
    public static  void bubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++) {
            boolean flag=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                   swap(array,j,j+1);
                   flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    /**
     * 交换函数
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int [] array,int i,int j){
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
    }

    /**
     * 计数排序
     * @param array
     */
    public static  void countSort(int [] array){
        int maxVal = array[0];
        int minVal = array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]<minVal){
                minVal = array[i];
            }
            if(array[i]>maxVal){
                maxVal = array[i];
            }
        }
        int len=maxVal-minVal+1;
        int [] count=new  int [len];
        //对源数组中的元素进行统计
        for(int i=0;i<array.length;i++){
            int val = array[i];
           count[val-minVal]++;
        }
        //将排序好的元素依次拷贝到原数组
        int index =0;
        for(int i=0;i<count.length;i++){
           while(count[i]!=0){
               array[index++] = minVal+i;//最小值加下标即为元素
               count[i]--;
           }
        }
    }

    /**
     * 直接选择排序
     *时间复杂度:o(n^2) 无论有序无序都是o(n^2)
     * 空间复杂度:o(1)
     * 稳定性:不稳定
     */
    public static void selectOneSort(int [] array){
        for(int i = 0;i<array.length;i++){
            int midIndex =i;
            for (int j = i+1;j<array.length;j++){
                if(array[j]<array[midIndex]){
                    midIndex = j;
                }
            }
            swap(array,i,midIndex);
        }
    }
}
