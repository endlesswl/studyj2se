package com.designpatterns.proxy;

/**
 * Created by nzhmac on 15/1/21.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();
    }
}
