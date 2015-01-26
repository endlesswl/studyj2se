package com.reflect;

/**
 * Created by nzhmac on 15/1/21.
 */
public class ClassTest {
    public static void main(String[] args) {
        Class<?> classType = Child.class;

        System.out.println(classType);

        classType = classType.getSuperclass();

        System.out.println(classType);

        classType = classType.getSuperclass();

        System.out.println(classType);

        classType = classType.getSuperclass();

        System.out.println(classType);
    }
}

class Parent{

}

class Child extends Parent{

}
