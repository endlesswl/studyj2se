package com.jdk5;

/**
 * Created by nzhmac on 15/1/14.
 */
public class ShowEnum {

    public static void main(String[] args) {
        enumCompareTo(OpConstant.valueOf(args[0]));
    }

    public static void enumCompareTo(OpConstant constant){
        System.out.println(constant);

        for (OpConstant o : OpConstant.values()) {
            System.out.println(constant.compareTo(o));
        }
    }
}
