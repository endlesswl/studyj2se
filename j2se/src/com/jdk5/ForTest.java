package com.jdk5;

/**
 * Created by nzhmac on 15/1/13.
 */
public class ForTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


        for(int element : arr){
            System.out.println(element);
        }

        for (int i : arr) {

        }

        for (int i : arr) {

        }
    }

}
