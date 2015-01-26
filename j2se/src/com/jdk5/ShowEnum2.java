package com.jdk5;

/**
 * Created by nzhmac on 15/1/14.
 */
public class ShowEnum2 {
    public static void main(String[] args) {
        for (OpConstant c : OpConstant.values()) {
            System.out.printf("%d, %s, %n", c.ordinal(), c);
        }
    }
}
