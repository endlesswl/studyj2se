package com.lesson4;

/**
 * Created by nzhmac on 15/1/3.
 */
public class FastSortTest {

    public static void fastSort(int[] array, int left, int right) {
//        for (int i=0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
        if (left < right) {
            int low = left;
            int high = right;
            int key = array[left];
            while (low < high) {
                while (low < high && array[high] >= key) {
                    high--;
                }
                array[low] = array[high];

                while (low < high && array[low] <= key) {
                    low++;
                }
                array[high] = array[low];

            }
            array[low] = key;
            fastSort(array, left, low - 1);
            fastSort(array, low + 1, right);
        }

    }

    public static int[] RandomArray() {
        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = (int) (Math.random() * 41) + 10;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = new int[]{11, 23, 4, 55, 65, 22, 23};
        a = RandomArray();
        fastSort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
