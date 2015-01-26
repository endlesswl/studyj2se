package com.lesson3;

/**
 * Created by nzhmac on 14/12/29.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton2);
    }

}

/**
 * Singleton Design
 * autor nzh
 */
class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}

