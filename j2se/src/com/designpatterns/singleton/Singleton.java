package com.designpatterns.singleton;

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

