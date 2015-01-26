package com.reflect;

import com.lesson4.IntegerTest;

import java.lang.reflect.Array;
import java.util.Objects;

/**
 * Created by nzhmac on 15/1/20.
 */
public class ArrayTester2 {

    public static void main(String[] args) {
        int[] dims = new int[]{5, 10, 15};

        //System.out.println(Integer.TYPE);
        //System.out.println(Integer.class);
        Object array = Array.newInstance(Integer.TYPE, dims);
        Object arrayObj = Array.get(array, 3);

        Class<?> classType = arrayObj.getClass().getComponentType();

        System.out.println(classType);

        arrayObj = Array.get(arrayObj, 5);

        Array.setInt(arrayObj, 10, 37);

        int[][][] arrayCast = (int[][][])array;

        System.out.println(arrayCast[3][5][10]);


    }

}
