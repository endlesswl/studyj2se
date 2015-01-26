package com.lesson4;

/**
 * Created by nzhmac on 15/1/2.
 */
public class BubbleSortTest {

    /*
    * 冒泡排序
    * */
    public static void bubbleSequence(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    /*
    * 冒泡排序 优化
    * */
    public static void bubbleSequence2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean ifchange = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    ifchange = true;
                }
            }
            if (!ifchange) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{12, 2, 1, 9, 6};
        bubbleSequence(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
