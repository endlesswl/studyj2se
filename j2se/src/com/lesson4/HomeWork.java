package com.lesson4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * Created by nzhmac on 15/1/4.
 */
public class HomeWork {
    public static int[][] getNumCon(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            //tmp[tmp.length-1];// =
            if (map.get(array[i]) != null) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int[][] tmp = new int[2][map.size()];

        Iterator<Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer key = it.next();
            Integer val = map.get(key);
            tmp[0][i] = key;
            tmp[1][i] = val;
            i++;
        }
        return tmp;
    }

    public static void FastSort(int[] array, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int key = array[left];

            while (i < j) {
                while (i < j && array[j] >= key) {
                    j--;
                }
                array[i] = array[j];
                while (i < j && array[i] <= key) {
                    i++;
                }
                array[j] = array[i];
            }

            array[i] = key;
// System.out.println("================");
// for (int ii = 0; ii < array.length; ii++) {
// System.out.print(array[ii]+" ");
// if((ii+1)%10 == 0){
// System.out.println();
// }
// }

            FastSort(array, left, i - 1);
            FastSort(array, i + 1, right);
        }
    }

    public static void FastSort2(int[][] array, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int key = array[0][left];
            int keylen = array[1][left];

            while (i < j) {
                while (i < j && array[0][j] >= key) {
                    j--;
                }
                array[0][i] = array[0][j];
                array[1][i] = array[1][j];
                while (i < j && array[0][i] <= key) {
                    i++;
                }
                array[0][j] = array[0][i];
                array[1][j] = array[1][i];
            }

            array[0][i] = key;
            array[1][i] = keylen;

            FastSort2(array, left, i - 1);
            FastSort2(array, i + 1, right);
        }
    }

    public static int FastSortMin(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int key = array[left];

        while (i < j) {
            while (i < j && array[j] >= key) {
                j--;
            }
            array[i] = array[j];
            i++;
            while (i < j && array[i] <= key) {
                i++;
            }
            array[j] = array[i];
            j--;
        }
// System.out.println("================");
// for (int ii = 0; ii < array.length; i++) {
// System.out.print(array[ii]+" ");
// if((ii+1)%10 == 0){
// System.out.println();
// }
// }
        array[i] = key;
        return i;
    }

    public static int BinarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int middle = 0;
        while (low < high) {
            middle = (low + high) / 2;
            if (key == array[middle]) {
                return middle;
            }
            if (key > array[middle]) {
                low = middle + 1;
            }
            if (key < array[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static int[] RandomArray(int len, int start, int end) {
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(end - start) + start;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = RandomArray(50, 10, 50);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("================");
        //FastSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("================");
        int[][] endVal = getNumCon(a);

        for (int i = 0; i < endVal[0].length; i++) {
            System.out.print(endVal[0][i] + ":" + endVal[1][i] + "  ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        FastSort2(endVal, 0, endVal[0].length - 1);
        System.out.println("================");
        for (int i = 0; i < endVal[0].length; i++) {
            System.out.print(endVal[0][i] + ":" + endVal[1][i] + "  ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
// System. out .println( " 内存信息 :" + toMemoryInfo ());
    }

    public static String toMemoryInfo() {

        Runtime currRuntime = Runtime.getRuntime();
        int nFreeMemory = (int) (currRuntime.freeMemory() / 1024 / 1024);
        int nTotalMemory = (int) (currRuntime.totalMemory() / 1024 / 1024);
        return nFreeMemory + "M/" + nTotalMemory + "M(free/total)";
    }
}
