package com.bit.sort;

import java.util.Stack;

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
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (tmp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
            ;
        }
    }

    /**
     * 希尔排序
     * 时间复杂度:
     * 空间复杂度:
     * 稳定性:
     */
    public static void shellSort(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i - gap;
            for (; j >= 0; j -= gap) {
                //加上等号 就是不稳定
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    /**
     * 冒泡排序
     * 时间复杂度:
     * 空间复杂度:
     * 稳定性:
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    /**
     * 交换函数
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * 计数排序
     *
     * @param array
     */
    public static void countSort(int[] array) {
        int maxVal = array[0];
        int minVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            }
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        int len = maxVal - minVal + 1;
        int[] count = new int[len];
        //对源数组中的元素进行统计
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            count[val - minVal]++;
        }
        //将排序好的元素依次拷贝到原数组
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                array[index++] = minVal + i;//最小值加下标即为元素
                count[i]--;
            }
        }
    }

    /**
     * 直接选择排序
     * 时间复杂度:o(n^2) 无论有序无序都是o(n^2)
     * 空间复杂度:o(1)
     * 稳定性:不稳定
     */
    public static void selectOneSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int midIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[midIndex]) {
                    midIndex = j;
                }
            }
            swap(array, i, midIndex);
        }
    }

    /**
     * 选择排序2
     *
     * @param array
     */
    public static void selectTwoSort(int[] array) {
        int right = array.length - 1;
        int left = 0;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left + 1; i <= right; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            swap(array, left, minIndex);
            //当数组开头元素为最大值时处理 18,3,10,2,7
            //修正max的下标
            if (left == maxIndex) {
                maxIndex = minIndex;
            }
            swap(array, right, maxIndex);
            left++;
            right--;
        }
    }

    /**
     * 堆排序
     * 时间复杂度:o(n*long^n)
     * 空间复杂度:o(1)
     * 稳定性:不稳定性
     */
    public static void heapSort(int[] array) {
        int end = array.length - 1;
        while (end >= 0) {
            swap(array, 0, end);
            shiftDown(array, 0, end);
            end--;
        }

    }

    public static void createHeap(int[] array) {
        for (int parent = (array.length - 1 - 1) / 2; parent >= 0; parent--) {
            shiftDown(array, parent, array.length);
        }
    }

    public static void shiftDown(int[] array, int parent, int len) {
        int child = 2 * parent + 1;
        while (child < len) {
            if (child + 1 < len && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                swap(array, child, parent);
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    /**
     * hoare版快速排序
     * 时间复杂度:o(N*logN)(理性每次均分排序序列)
     * 最慢:o(n^2)数据有序或者逆序
     * 空间复杂度:
     * 最好:o(logN)
     * 最坏:o(N)
     * 稳定性:
     */
    public static void quickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    public static void insertSort2(int[] array, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= start; j--) {
                if (tmp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
            ;
        }
    }

    public static void quick(int[] array, int left, int right) {
        //可能没有左树
        if (left >= right) {
            return;
        }
        //减少递归次数
        if (right - left + 1 <= 7) {
            insertSort2(array, left, right);
            return;
        }
        // int pivot = partitionHoare(array,left,right);
        // int pivot = partitionHole(array,left,right);
        int index = midNumIndex(array, left, right);
        swap(array, index, left);
        int pivot = partitionPointer(array, left, right);
        quick(array, left, pivot - 1);
        quick(array, pivot + 1, right);
    }

    /**
     * hoare版快速排序  递归深度过大会栈溢出
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partitionHoare(int[] array, int start, int end) {
        int i = start;
        int key = array[start];
        while (start < end) {
            //===否则死循环
            while (start < end && array[end] >= key) {
                end--;
            }
            while (start < end && array[start] <= key) {
                start++;
            }
            swap(array, start, end);
        }
        swap(array, i, start);
        return start;
    }

    /**
     * 挖坑法版快速排序  递归深度过大会栈溢出
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partitionHole(int[] array, int start, int end) {
        int key = array[start];
        while (start < end) {
            while (start < end && array[end] >= key) {
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] <= key) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = key;
        return start;
    }

    /**
     * 双指针版快速排序  递归深度过大会栈溢出
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partitionPointer(int[] array, int start, int end) {
        int prev = start;
        int cur = start + 1;
        while (cur <= end) {
            if (array[cur] < array[start] && array[++prev] != array[cur]) {
                swap(array, cur, prev);
            }
            cur++;
        }
        swap(array, prev, start);
        return prev;
    }

    /**
     * 三数取中
     *
     * @param array
     * @param left
     * @param right
     * @return
     */
    public static int midNumIndex(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        if (array[left] < array[right]) {
            if (array[mid] < array[left]) {
                return left;
            } else if (array[mid] > array[right]) {
                return right;
            } else {
                return mid;
            }
        } else {
            if (array[mid] < array[right]) {
                return right;
            } else if (array[mid] > array[left]) {
                return left;
            } else {
                return mid;
            }
        }
    }

    public static void quickSort2(int[] array) {
        int left = 0;
        int right = array.length-1;
        Stack<Integer> stack = new Stack<Integer>();
        int pivot = partitionHole(array, left, right);
        if (pivot > left + 1) {
            stack.push(left);
            stack.push(pivot - 1);
        }

        if (pivot > right - 1) {
            stack.push(pivot + 1);
            stack.push(right);
        }
        while (!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();
            pivot = partitionHole(array, left, right);
            if (pivot > left + 1) {
                stack.push(left);
                stack.push(pivot - 1);
            }

            if (pivot > right - 1) {
                stack.push(pivot + 1);
                stack.push(right);
            }
        }

    }
}
