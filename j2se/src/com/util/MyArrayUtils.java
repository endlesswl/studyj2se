package com.util;

/**
 * Created by nzhmac on 15/1/4.
 */
public class MyArrayUtils {

    /**
     * 冒泡排序
     * 从小到大排
     * 方法优化过，如果没有换位，退出排序。
     * @param array 数组
     * */
    public static void BubbleSort(int[] array){
        for(int i=0; i<array.length; i++){
            boolean ifchange = false;
            for (int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    ifchange = true;
                }
            }
            if (!ifchange){
                break;
            }
        }
    }

    /**
     * 快速排序
     * 从小到大排序
     * @param array
     * @param low
     * @param high
     */
    public static void quickShort(int[] array, int low, int high){
        if (low<high){
            int i = low;
            int j = high;
            int key = array[low];
            while (i < j){
                while (i < j && array[j] > key){
                    j--;
                }
                array[i] = array[j];
                while (i < j && array[i] < key){
                    i++;
                }
                array[j] = array[i];
            }
            array[i] = key;
            quickShort(array, low, i-1);
            quickShort(array, i+1, high);
        }
    }

    /**
     * 二分搜索
     * 查询数组array中是否包含key的值。如果包含返回数组下标。不包含返回 -1。
     * 数组必须为有序的数组。
     * @param array
     * @param key
     * */
    public static int BinarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;
        int middle;
        while (low <= high){
            middle = (low + high)/2;
            if (key == array[middle]){
                return middle;
            }
            if (key < array[middle]){
                high = middle - 1;
            }
            if (key > array[middle]){
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1, 3, 2, 5, 9, 7};
        //BubbleSort(a);
        quickShort(a, 0, a.length-1);
        System.out.println(BinarySearch(a, 3));
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

}
