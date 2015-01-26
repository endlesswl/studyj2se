package com.lesson4;

/**
 * Created by nzhmac on 14/12/31.
 */
public class ArrayTest4 {
    public static void main(String[] args) {
//        int[] i = new int[4];

        int[][] a = new int[2][3];

//        i[0][0] = 1;
        int m = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m++;
                a[i][j] = 2 * m;
            }
        }

        System.out.println(a instanceof Object);
        System.out.println(a[0] instanceof int[]);

    }
}
