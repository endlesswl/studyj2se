package com.reflect;

import java.lang.reflect.Field;

/**
 * Created by nzhmac on 15/1/21.
 */
public class TestPrivate2 {

    public static void main(String[] args) throws Exception{
        Private2 p = new Private2();

        Class<?> classType = p.getClass();
        Object obj = classType.newInstance();
        Field field = classType.getDeclaredField("name");
        field.setAccessible(true);
        field.set((Private2) obj, "lisi");
        field.set(p, "lisi");
        System.out.println(((Private2) obj).getName());
        System.out.println(p.getName());

    }

}
