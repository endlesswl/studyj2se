package com.reflect;

import java.lang.reflect.Method;

/**
 * Created by nzhmac on 15/1/16.
 */
public class DumpMethods {
    public static void main(String[] args) throws Exception {
        Class<?> classType = Class.forName(args[0]);
        Method[] method = classType.getDeclaredMethods();
        for (Method method1 : method) {
            System.out.println(method1);
        }
    }
}
