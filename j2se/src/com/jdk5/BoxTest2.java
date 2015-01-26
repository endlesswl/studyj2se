package com.jdk5;

import java.util.DoubleSummaryStatistics;

/**
 * Created by nzhmac on 15/1/13.
 */
public class BoxTest2 {

    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;

        Double d1 = 100.0;
        Double d2 = 100.0;

        System.out.println(d1 == d2);

        if (i1 == i2){
            System.out.println("i1 == i2");
        } else {
            System.out.println("i1 != i2");
        }

    }

}
