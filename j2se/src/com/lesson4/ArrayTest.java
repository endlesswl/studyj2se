package com.lesson4;

/**
 * Created by nzhmac on 14/12/30.
 */
public class ArrayTest {

    public static void main(String[] args) {

        /*int[] a = new int[4];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        System.out.println(a[3]);*/

       /* int a[] = new int[2];
        a[0] = 1;
        a[1] = 2;

        System.out.println();*/

        /*int[] a = {1, 2, 3, 4};
        System.out.println(a[2]);

        int[] b = new int[]{1, 2, 3, 4};
        System.out.println(a[3]);*/

//        int[] a = new int[100];
//
//        for (int i = 0; i < a.length; i++){
//            a[i] = i + 1;
//        }
//
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }
//
//        a.length = 200;


        /*int[] a = new int[4];

        System.out.println(a[3]);

        boolean[] b = new boolean[3];
        System.out.println(b[2]);*/

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(a.equals(b));

        //E e = new E();
        System.out.println(E.equals(a, b));


    }

}

class E {
    public static boolean equals(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
