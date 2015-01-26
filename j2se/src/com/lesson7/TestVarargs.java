package com.lesson7;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nzhmac on 15/1/13.
 */
public class TestVarargs {

    private static int sum(String str, int... nums){
        System.out.println(str);

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sum("a", 1, 2);
        System.out.println(result);
        Collections.sort(new ArrayList<Comparable>());

        result = sum("b", 1, 2, 3, 4);
        System.out.println(result);
    }

}
