package com.lesson4;

/**
 * Created by nzhmac on 14/12/31.
 */
public class ArrayTest5 {

    public static void main(String[] args) {
        /*
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[1];*/

        //int[][] b = new int[][3];
//        int[] a = new int[]{1, 2, 3};
        int[][] a = new int[][]{{1, 2, 3}, {4}, {5, 6, 7, 8}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
