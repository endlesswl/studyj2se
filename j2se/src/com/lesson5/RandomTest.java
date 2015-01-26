package com.lesson5;

import java.util.Random;

/**
 * Created by nzhmac on 15/1/3.
 */
public class RandomTest {

    public static int[] getRandomArray(){
        int[] array = new int[50];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(40)+10;
        }

        return array;
    }

    public static void main(String[] args){
        int a[] = getRandomArray();
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

}
