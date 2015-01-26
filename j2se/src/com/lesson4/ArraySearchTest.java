package com.lesson4;

/**
 * Created by nzhmac on 15/1/3.
 */
public class ArraySearchTest {

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /*
    二分搜索
     */
    public static int BinarySearch(int[] array, int value) {
        int st = 0;
        int end = array.length - 1;
        int mi;

        while (st <= end) {
            mi = (st + end) / 2;

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i == mi) {
                    System.out.print("#");
                }
                System.out.print(" ");
            }
            System.out.println();

            if (array[mi] == value) {
                return mi;
            } else if (array[mi] < value) {
                st = mi + 1;
            } else if (array[mi] > value) {
                end = mi - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 9};

        int value = 7;

        int index = search(a, value);
        int index2 = BinarySearch(a, value);
        System.out.println(index2);
    }
}
