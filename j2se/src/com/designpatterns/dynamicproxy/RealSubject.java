package com.designpatterns.dynamicproxy;

/**
 * Created by nzhmac on 15/1/24.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("From real subject!");
    }
}
