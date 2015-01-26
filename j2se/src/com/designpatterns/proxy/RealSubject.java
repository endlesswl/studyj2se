package com.designpatterns.proxy;

/**
 * Created by nzhmac on 15/1/21.
 */
public class RealSubject extends Subject {
    public void request(){
        System.out.println("From real subject.");
    }
}
