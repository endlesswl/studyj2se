package com.lesson4;

/**
 * Created by nzhmac on 14/12/30.
 */
public class IntegerTest {

    public static void main(String[] args) {
        int a = 10;

        Integer integer = new Integer(a);

        int b = integer.intValue();

        System.out.println(a == b);
    }

}
